
import java.sql.Connection;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.awt.HeadlessException;
import java.beans.Statement;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author waski
 */
public class ConnectionDb {
    static final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/cyrildatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String user = "admin";
    static final String pass = "admin";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection connectDatabase(){
        try{
            Class.forName(jdbc_driver);
        }catch (ClassNotFoundException cnf) {
            
        }try{
            conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }catch(HeadlessException e){
            
        }
            return conn;
    }
}
