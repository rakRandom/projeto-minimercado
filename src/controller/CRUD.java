/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.db.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class CRUD {
    public Conexao conexao;
    public DefaultTableModel modelo;
    public String nome_tabela;
    public String[] atributos;
    public TipoAtributo[] tiposAtributo;
    public JTextField[] campos;
    public Integer pkIndex = 0;
    
    public CRUD(
            Conexao conexao, 
            DefaultTableModel modelo, 
            String nome_tabela, 
            String[] atributos, 
            TipoAtributo[] tiposAtributo,
            JTextField[] campos
    ) {
        this.conexao = conexao;
        this.modelo = modelo;
        this.nome_tabela = nome_tabela;
        this.atributos = atributos;
        this.tiposAtributo = tiposAtributo;
        this.campos = campos;
        
        for (int i = 0; i < tiposAtributo.length; i++) {
            if (tiposAtributo[i] == TipoAtributo.PK) {
                pkIndex = i;
            }
        }
        
        conexao.executarSQL("select * from " + nome_tabela + " order by " + atributos[0]);
        
        preencherTabela();
        posicionarRegistro();
    }
    
    public void novoRegistro() {                                                    
        for (JTextField campo : campos) {
            campo.setText("");
        }
        
        campos[1].requestFocus();
    }                                                   
    
    public void gravar() {                                              
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja salvar os dados?", "Confirmar Gravação de Dados", JOptionPane.YES_NO_OPTION);
        
        if(opcao == 0) {
            try {
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
                    
                String insertSql = "insert into " + nome_tabela + " (" + sqlAtributos + ") values (" + sqlValores + ")";
                conexao.statement.executeUpdate(insertSql);
                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                conexao.executarSQL("select * from " + nome_tabela + " order by " + atributos[this.pkIndex]);
                conexao.resultset.first();
                preencherTabela();
                ultimo();
            } catch(SQLException erroSql) {
                JOptionPane.showMessageDialog( null, "\n Erro na gravação: \n " +erroSql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }                                             

    public void alterar() {                                               
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja salvar as alterações?", "Confirmar Alteração de Dados", JOptionPane.YES_NO_OPTION);
        
        if(opcao == 0) {
            String sql;

            try {
                if(campos[0].getText().equals("")) {
                    var sqlAtributos = atributos[0];
                    
                    for (int i = 1; i < atributos.length; i++) {
                        sqlAtributos += ", " + atributos[i];
                    }
                    
                    var sqlValores = "'" + campos[0].getText() + "'";
                    
                    for (int i = 1; i < campos.length; i++) {
                        if (tiposAtributo[i] == TipoAtributo.String) {
                            sqlValores += ", '" + campos[i].getText() + "'";
                        } else {
                            sqlValores += ", " + campos[i].getText();
                        }
                    }
                    
                    sql = "insert into " + nome_tabela + " (" + sqlAtributos + ") values (" + sqlValores + ")";
                } else {
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
                    
                    sql = "update " + nome_tabela + " set " + sqlSet + " where " + atributos[0] + " = " + whereValue;
                }

                conexao.statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

                conexao.executarSQL("select * from " + nome_tabela + " order by " + atributos[0]);
                conexao.resultset.first();
                preencherTabela();
                posicionarRegistro();
            } catch(SQLException erroSql) {
                JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n" +erroSql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }                                              

    public void excluir() {                                               
        try {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
                
            if (resposta == JOptionPane.OK_OPTION) {
                var whereValue = campos[0].getText();
                if (tiposAtributo[0] == TipoAtributo.String) {
                    whereValue = "'" + whereValue + "'";
                }
                
                String sql = "delete from " + nome_tabela + " where " + atributos[0] + " = " + whereValue;
                int excluir = conexao.statement.executeUpdate(sql);
                    
                if (excluir == 1) {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        
                    conexao.executarSQL("select * from " + nome_tabela + " order by " + atributos[0]);
                    conexao.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão: " +excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }                                              

    public void excluir(String sql) {                                               
        try {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
                
            if (resposta == JOptionPane.OK_OPTION) {
                int excluir = conexao.statement.executeUpdate(sql);
                    
                if (excluir == 1) {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        
                    conexao.executarSQL("select * from " + nome_tabela + " order by " + atributos[0]);
                    conexao.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão: " +excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }                                              
    
    public void primeiro() {                                                
        try{
            conexao.resultset.first();
            mostrarDados();
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }                                               

    public void anterior() {                                                
        try{
            conexao.resultset.previous();
            mostrarDados();
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o registro anterior", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }                                               

    public void proximo() {                                               
        try{
            conexao.resultset.next();
            mostrarDados();
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o registro seguinte", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }                                              

    public void ultimo() {                                              
        try{
            conexao.resultset.last();
            mostrarDados();
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o último registro", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }                                             

    public void preencherTabela() {
        modelo.setNumRows(0);
        
        try {
            conexao.resultset.beforeFirst();
            while(conexao.resultset.next()) {
                var row = new Object[campos.length];
                
                for (int i = 0; i < campos.length; i++) {
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
    
    public void posicionarRegistro() {
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
    
    public void mostrarDados() {
        try {
            for (int i = 0; i < campos.length; i++) {
                campos[i].setText(conexao.resultset.getString(atributos[i]));
            }
        }catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Dados não localizados: \n"+erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
