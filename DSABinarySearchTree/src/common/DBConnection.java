/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wathsala
 */
public class DBConnection {
     public Connection connection = null;
    
    public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch(ClassNotFoundException e)
                {
                   
                }
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","root");
            
        }
        catch(SQLException e)
        {
            System.out.println("Connection Faild");
            e.printStackTrace();
        }
        if(connection !=null)
        {
            System.out.println("You made it");
        }
        else
        {
            System.out.println("You faild to make connection");
        }
        return connection;
    }
    
    
    
}
