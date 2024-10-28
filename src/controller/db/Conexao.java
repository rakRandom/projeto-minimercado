package controller.db;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Fellipe Leonardo
 */
public class Conexao {
    final private String driver = "com.mysql.cj.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/minimercado";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public PreparedStatement preparedStatement;
    public ResultSet resultset;
    
    public boolean conectar() {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
        }
        catch (ClassNotFoundException | SQLException e) {
            result = false;
        }
        return result;
    }
    
    public void desconectar() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        catch (SQLException fechar) { 
            JOptionPane.showMessageDialog(
                    null, 
                    "Erro ao fechar conexão!\nErro: " + fechar, 
                    "Banco de Dados", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void executarSQL(String sql, Object... params) {
        try {
            preparedStatement = conexao.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            
            // Preencher os parâmetros
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }

            resultset = preparedStatement.executeQuery();
        }
        catch (SQLException excecao) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Erro no comando SQL!\nErro: " + excecao, 
                    "Banco de Dados", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
