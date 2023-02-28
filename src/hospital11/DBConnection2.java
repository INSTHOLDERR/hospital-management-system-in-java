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
public class DBConnection2 {
     public Connection newDBConnection2()
    {Connection con2=null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        
        con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
       
        
       
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            return con2;
      
       }
    }
     
    
}
