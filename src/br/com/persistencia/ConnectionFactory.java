
package br.com.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class ConnectionFactory {
    //String de conexao
    private static final String STR_CONEXAO ="jdbc:mysql://localhost:3306/";
    //Nome do banco de datos
    private static final String DATA_BASE = "representacao";
    //Usuario do MySql
    private static final String USER ="root";
    //senha do MySql
    private static final String PASSWORD ="";
    
// Abre a Conexao com o banco
    public static Connection getConection(){
        try {
            return DriverManager.getConnection(STR_CONEXAO+DATA_BASE,USER,PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao realizar conexao"+ ex);
        }
        return null;
    }
//Metodo que fecha a conexao
     public static void closeConnection(Connection con)throws SQLException{
            if(con != null){
                con.close();
            } 
        }
//Metodo que fecha o Statement
        public static void closeConnection(Connection con, Statement stmt)throws SQLException{
            if (stmt != null){
                stmt.close();
            }
            closeConnection(con);
        }
        
//Metodo que fecha o ResultSet
        public static void closeConnection(Connection con, Statement stmt,ResultSet rs)throws SQLException{
            if (rs != null){
                rs.close();
            }
            closeConnection(con, stmt);
        }


}