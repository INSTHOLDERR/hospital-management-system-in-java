/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital11;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author NIKHIL
 */
public class DBConnection {
     public Connection newDBConnection()
    {Connection con=null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","");
       
        
       
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            return con;
      
       }
    }
     
}

    

