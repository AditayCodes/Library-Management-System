/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.management.system;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","adisharma");
            System.out.print(c);
            
            
            // TODO code application logic here
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibraryManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LibraryManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
