/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @authored by Demons
 */
public class DBConnection {
    
     
    
    Connection conn = null;
    
    public static Connection ConnecrDb()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","root");
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
            
    }
    
    
    
}
