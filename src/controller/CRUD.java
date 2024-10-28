/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

// =============================================================================

import controller.enums.TipoAtributo;
import controller.db.Conexao;
import controller.enums.TipoSQL;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 * To do: 
 * - Verificação no "próximo" e "anterior" para não ir out of bounds
 * - Função de Pesquisar
 * - Verificação de FK nas ações de Gravar e Alterar (e nisso adicionar FK ao enum TipoAtributo)
 * 
 * Notas:
 * - Nenhum valor é estático porque as funcionalidades dependem de tabela a tabela
 * - Na inicialização, modificar os métodos caso necessário para encaixar com o contexto da tabela
 * 
 * @author Neo / rakRandom / Fellipe Leonardo
 */
public class CRUD 
{
    public Conexao conexao;
    public DefaultTableModel modelo;
    public String nome_tabela;
    public String[] atributos;
    public String[] tabelasFK;
    public TipoAtributo[] tiposAtributo;
    public JTextField[] campos;
    public Integer pkIndex = 0;
    public JComboBox jComboBoxPesquisa;
    public JTextField jTextFieldPesquisa;
    
    // =========================================================================
    
    public CRUD(
            Conexao conexao, 
            DefaultTableModel modelo, 
            String nome_tabela, 
            String[] atributos, 
            String[] tabelasFK, 
            TipoAtributo[] tiposAtributo,
            JTextField[] campos,
            JComboBox jComboBoxPesquisa,
            JTextField jTextFieldPesquisa
    ) {
        this.conexao = conexao;
        this.modelo = modelo;
        this.nome_tabela = nome_tabela;
        this.atributos = atributos;
        this.tabelasFK = tabelasFK;
        this.tiposAtributo = tiposAtributo;
        this.campos = campos;
        this.jComboBoxPesquisa = jComboBoxPesquisa;
        this.jTextFieldPesquisa = jTextFieldPesquisa;
        
        for (int i = 0; i < tiposAtributo.length; i++) {
            if (tiposAtributo[i] == TipoAtributo.PK) {
                pkIndex = i;
            }
        }
        
        resetarTabela();
    }
    
    // =========================================================================
    
    public String calcularInsert() {
        var sqlAtributos = atributos[0];
                    
        for (int i = 1; i < atributos.length; i++) {
            sqlAtributos += ", " + atributos[i];
        }

        var sqlValores = "null";
        if (tiposAtributo[0] != TipoAtributo.PK) {
            sqlValores = campos[0].getText();
            if (tiposAtributo[1] == TipoAtributo.String)
                sqlValores = "'" + sqlValores + "'";
        }

        for (int i = 1; i < campos.length; i++) {
            if (tiposAtributo[i] == TipoAtributo.String) {
                sqlValores += ", '" + campos[i].getText() + "'";
            } else {
                sqlValores += ", " + campos[i].getText();
            }
        }

        return "insert into " + nome_tabela + " (" + sqlAtributos + ") values (" + sqlValores + ")";
    }
    
    public String calcularSelect() {
        return "select * from " + nome_tabela + " order by " + atributos[this.pkIndex];
    }
    
    public String calcularUpdate() {
        var sqlSet = "";
                    
        if (tiposAtributo[1] == TipoAtributo.String) {
            sqlSet += atributos[1] + "='" + campos[1].getText() + "'";
        } else {
            sqlSet += atributos[1] + "=" + campos[1].getText();
        }

        for (int i = 2; i < campos.length; i++) {
            if (tiposAtributo[i] == TipoAtributo.String) {
                sqlSet += ", " + atributos[i] + "='" + campos[i].getText() + "'";
            } else {
                sqlSet += ", " + atributos[i] + "=" + campos[i].getText();
            }
        }

        var whereValue = campos[0].getText();
        if (tiposAtributo[0] == TipoAtributo.String) {
            whereValue = "'" + whereValue + "'";
        }

        return "update " + nome_tabela + " set " + sqlSet + " where " + atributos[0] + " = " + whereValue;
    }
    
    public String calcularDelete() {
        var whereValue = campos[0].getText();
        if (tiposAtributo[0] == TipoAtributo.String) {
            whereValue = "'" + whereValue + "'";
        }

        return "delete from " + nome_tabela + " where " + atributos[0] + " = " + whereValue;
    }
    
    public int verificarFK() {
        for (int i = 0; i < atributos.length; i++) {
            if (tiposAtributo[i] != TipoAtributo.FK)
                continue;
            
            String sql = "select * from " + tabelasFK[i] + " where " + atributos[i] + " = " + campos[i].getText();
            
            try {
                conexao.executarSQL(sql);

                if (!conexao.resultset.first()) {
                    return i;
                }
            } catch (SQLException e) {
                return i;
            }
        }
        
        return -1;
    }
    
    // ===================================
    
    public String calcularSQL(TipoSQL tipo) 
    {
        switch (tipo) {
            case Insert -> {
                return calcularInsert();
            }
            
            case Select -> {
                return calcularSelect();
            }
            
            case Update -> {
                return calcularUpdate();
            }
            
            case Delete -> {
                return calcularDelete();
            }
        }
        return "";
    }
    
    // =========================================================================
    
    public void novoRegistro() 
    {                                                    
        for (JTextField campo : campos) {
            campo.setText("");
        }
        
        campos[1].requestFocus();
    }                                                   
    
   public void gravar() {
        if (!validarCampos()) {
            return;
        }

        int fkInexistente = verificarFK();
        if (fkInexistente != -1) {
            JOptionPane.showMessageDialog(
                    null,
                    "FK inexistente: " + atributos[(fkInexistente)],
                    "Mensagem do Programa",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int opcao = JOptionPane.showConfirmDialog(
                null,
                "Deseja salvar os dados?",
                "Confirmar Gravação de Dados",
                JOptionPane.YES_NO_OPTION);

        if (opcao == 0) {
            try {
                String insertSql = calcularSQL(TipoSQL.Insert);
                conexao.statement.executeUpdate(insertSql);
                JOptionPane.showMessageDialog(
                        null,
                        "Gravação realizada com sucesso",
                        "Mensagem do Programa",
                        JOptionPane.INFORMATION_MESSAGE);

                conexao.executarSQL(calcularSQL(TipoSQL.Select));
                conexao.resultset.first();
                preencherTabela();
                ultimo();
            } catch (SQLException erroSql) {
                JOptionPane.showMessageDialog(
                        null,
                        "\n Erro na gravação: \n " + erroSql,
                        "Mensagem do Programa",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }                    

     public void alterar() {
        if (!validarCampos()) {
            return;
        }

        int fkInexistente = verificarFK();
        if (fkInexistente != -1) {
            JOptionPane.showMessageDialog(
                    null,
                    "FK inexistente: " + atributos[(fkInexistente)],
                    "Mensagem do Programa",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int opcao = JOptionPane.showConfirmDialog(
                null,
                "Deseja salvar as alterações?",
                "Confirmar Alteração de Dados",
                JOptionPane.YES_NO_OPTION);

        if (opcao == 0) {
            String sql;

            try {
                if (campos[0].getText().equals("")) {
                    sql = calcularSQL(TipoSQL.Insert);
                } else {
                    sql = calcularSQL(TipoSQL.Update);
                }

                conexao.statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(
                        null,
                        "Alteração realizada com sucesso",
                        "Mensagem do Programa",
                        JOptionPane.INFORMATION_MESSAGE);

                conexao.executarSQL(calcularSQL(TipoSQL.Select));
                conexao.resultset.first();
                preencherTabela();
                posicionarRegistro();
            } catch (SQLException erroSql) {
                JOptionPane.showMessageDialog(
                        null,
                        "\n Erro na alteração: \n" + erroSql,
                        "Mensagem do Programa",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }                           

    public void excluir() {
        if (campos[0].getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja excluir o registro?",
                    "Confirmar Exclusão",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.OK_OPTION) {
                String sql = calcularSQL(TipoSQL.Delete);
                int excluir = conexao.statement.executeUpdate(sql);

                if (excluir != 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Exclusão realizada com sucesso",
                            "Mensagem do Programa",
                            JOptionPane.INFORMATION_MESSAGE);

                    conexao.executarSQL(calcularSQL(TipoSQL.Select));
                    conexao.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Operação cancelada pelo usuário",
                        "Mensagem do Programa",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro na exclusão: " + e,
                    "Mensagem do Programa",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private boolean validarCampos() {
        for (JTextField campo : campos) {
            if (campo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        return true;
    }
        
    // =========================================================================
    
    public void primeiro() 
    {                                                
        try{
            conexao.resultset.first();
            mostrarDados();
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }                                               

    public void anterior() 
    {                                                
        try {
            if (!conexao.resultset.previous()) {
                conexao.resultset.next();
                return;
            }
            mostrarDados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível acessar o registro anterior",
                    "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE
            );
        }
    }                                               

    public void proximo() 
    {                                               
        try {
            if (!conexao.resultset.next()) {
                conexao.resultset.previous();
                return;
            }
            mostrarDados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível acessar o próximo registro",
                    "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE
            );
        }
    }                                              

    public void ultimo() 
    {                                              
        try{
            conexao.resultset.last();
            mostrarDados();
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o último registro", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }                
    
    // =========================================================================
    
    public String calcularPesquisa() {
        String conteudo = jTextFieldPesquisa.getText();

        if (conteudo.isBlank())
            return "select * from " + nome_tabela + " where 1=0";
        
        String sql;
        
        int selected = jComboBoxPesquisa.getSelectedIndex();
        
        if (tiposAtributo[selected] == TipoAtributo.String) {
            sql = "select * from " + nome_tabela + " where " + atributos[selected] + " like '%" + conteudo + "%'";
        }
        else {
            sql = "select * from " + nome_tabela + " where " + atributos[selected] + " = " + conteudo;
        }
        
        return sql;
    }
    
    public void pesquisar() {
        try {
            String pesquisa = calcularPesquisa();
            
            conexao.executarSQL(pesquisa);

            if (conexao.resultset.first()) {
                preencherTabela();
                posicionarRegistro();
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "Não existem dados com este paramêtro",
                        "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE); 
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, 
                    "Os dados digitados não foram localizados:\n" + erro, 
                    "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void resetarTabela() {
        conexao.executarSQL(calcularSQL(TipoSQL.Select));
        
        preencherTabela();
        posicionarRegistro();
    }

    // =========================================================================
    
    public void preencherTabela() 
    {
        modelo.setNumRows(0);
        
        try {
            conexao.resultset.beforeFirst();
            while(conexao.resultset.next()) {
                var row = new Object[campos.length];
                
                for (int i = 0; i < campos.length; i++) {
                    if (tiposAtributo[i] == TipoAtributo.Money)
                        row[i] = "R$ " + conexao.resultset.getString(atributos[i]);
                    else
                        row[i] = conexao.resultset.getString(atributos[i]);
                }
                
                modelo.addRow(row);
            }
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "\n Erro ao listar dados da tabela!!:\n"+erro,
                    "Mensagem do programa", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistro() 
    {
        try {
            conexao.resultset.first();
            mostrarDados();
            
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Não foi possível posicionar no primeiro registro: "+erro,
                    "Mensagem do Programa", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrarDados() 
    {
        try {
            for (int i = 0; i < campos.length; i++) {
                campos[i].setText(conexao.resultset.getString(atributos[i]));
            }
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Dados não localizados: \n"+erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
