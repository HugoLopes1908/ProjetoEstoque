/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hugo Lopes
 */
public class Conexao {
    
    public Connection getConexao()
    {
        try {
            Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/projetoestoque?serverTimezone=UTC",//linha de conexão;
               "root",//usuario do Mysql;
               ""//senha do Mysql;
        );
            return conn;
            
            } 
        catch (Exception e) {
            System.out.println("Erro ao conectar"+e.getMessage());
            return null;
            }
    }
    
    
    
   
}
