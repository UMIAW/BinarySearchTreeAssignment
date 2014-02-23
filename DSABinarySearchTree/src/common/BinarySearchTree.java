/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
/**
 *
 * @author IsuKay
 */
//import java.util.ArrayList;

import java.sql.*;
import javax.swing.*;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BinarySearchTree {
    
  public Book root;
  Connection conn ;
  ResultSet rs= null;
  
  //ArrayList<Book> dataList = new ArrayList<Book>();

    public void InsertNode(Book b) 
    {
        int Isbn = b.getIsbn();
        if (root == null) 
        {            
            root = b;
        } 
        else 
        {
            Book focusNode = root;
            Book Parent;

            while (true) 
            {
                Parent = focusNode;
                if (Isbn < focusNode.getIsbn()) 
                {
                    focusNode = focusNode.LeftChild;
                    if (focusNode == null) 
                    {
                        Parent.LeftChild = b;
                        return;
                    }
                } else 
                {
                    focusNode = focusNode.RightChild;
                    if (focusNode == null) 
                    {
                        Parent.RightChild = b;
                        return;
                    }
                }
            }
        }
    }

    public void PreorderTraversTree(Book focusNode) {

        if (focusNode != null) 
        {
            System.out.println(focusNode);
            PreorderTraversTree(focusNode.LeftChild);
            PreorderTraversTree(focusNode.RightChild);
        }
    }
    
      //Insert data to data base 
    public void GetDataFromdatabase()
    {
        BinarySearchTree theTree = new BinarySearchTree();
        
        int isbn;
        String bookname;
        String AuthorFname;
        String AuthorLname;
        
        try
        {
            /*Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/umiaw_bookstore";
            String Uname = "root";
            String pwd = "";
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/umiaw_bookstore");
            Connection conn = DriverManager.getConnection(url,Uname,pwd);*/
  
            Statement st=conn.createStatement();
            String query="SELECT * FROM bookdetails";
            rs=st.executeQuery(query);
        
            while(rs.next())
            {
                isbn=Integer.parseInt(rs.getString("ISBN"));
                bookname=rs.getString("BookName");            
                AuthorFname=rs.getString("AuthourFirstname");
                AuthorLname=rs.getString("AuthourLastname");
            }
            theTree.PreorderTraversTree(theTree.root); 
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }
    }

}
