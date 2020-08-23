/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlvattu.Controller;

/**
 *
 * @author tiencong
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class JDBCConnection {
    public static Connection getJDBCConnection() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/qlVatTuDB?autoReconnect=true&useSSL=false";
        final String user = "root";
        final String password = "Maydienhak0n";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
        public static void main(String[] args) throws SQLException {
        Connection connection = getJDBCConnection();
        
        if (connection != null) {
            System.out.println("Data connection successful");
        } else {
            System.out.println("Data connection failed");
        }
    }
}