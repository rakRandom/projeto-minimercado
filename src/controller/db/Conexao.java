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
    public Statement statement;
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
            conexao.close();
        }
        catch (SQLException fechar) { }
    }
    
    public void executarSQL(String sql) {
        try {
            statement = conexao.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
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
