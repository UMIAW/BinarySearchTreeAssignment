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


    public void InsertNode(int Isbn ,String Title, String Fname, String Lname) 
    {
       Book newNode = new Book(Isbn,Title,Fname,Lname);
        if (root == null) 
        {            
            root=newNode;
        } 
        else 
        {
            Book focusNode = root;
            Book Parent;

            while (true) 
            {
                Parent = focusNode;
                if (Isbn < focusNode.isbn) 
                {
                    focusNode = focusNode.LeftChild;
                    if (focusNode == null) 
                    {
                        Parent.LeftChild = newNode;
                        return;
                    }
                } else 
                {
                    focusNode = focusNode.RightChild;
                    if (focusNode == null) 
                    {
                        Parent.RightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
public Book FindNode(int isbn)
   {
       Book focusNode = root;
       
       while(focusNode.isbn != isbn)
       {
           if(isbn < focusNode.isbn)
           {
               focusNode = focusNode.LeftChild;

           }
           else
           {
               focusNode = focusNode.RightChild;
           }
           if(focusNode==null)
           {
               return null;
           }
          
       }
       return focusNode;
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
        
    }

}
