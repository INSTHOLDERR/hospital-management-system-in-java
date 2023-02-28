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
public class DBConnection1 {
        public Connection newDBConnection1()
    {Connection con1=null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        
        con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/patient","root","");
       
       
        
       
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            return con1;
      
       }
    }
     
    
}
