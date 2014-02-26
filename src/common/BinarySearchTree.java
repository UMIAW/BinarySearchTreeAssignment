/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
/**
 *
 * @authored By Demons
 */
import java.sql.*;
import javax.swing.*;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BinarySearchTree {
    
  public Book root;

    /***********************Insert part comes here********************************/
  
    public void InsertNode(int Isbn ,String Title, String Fname, String Lname) 
    {
       Book newNode = new Book(Isbn,Title,Fname,Lname);
       //Check whether the binary search tree is empty or not
       
        if (root == null) 
        {            
            root=newNode;
        } 
        else 
        {
            Book focusNode = root;
            Book Parent;
            //Find the place to inpurt new node
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
//End of Insert Method
    
/***********************Find node part comes here*******************************/
    
public Book findNode(int isbn)
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
//End of findnode part

/*************************Delete part comes here********************************/

public boolean Delete(int key)
{
        Book focusNode =root;
        Book Parent = root;
  
        boolean isLeftChild = true;
  
        while(focusNode.isbn != key)
        {
            Parent = focusNode;
            
            //Check that the focus node have left child or Right child
            if(key < focusNode.isbn)
            {
                isLeftChild = true;  
                
                focusNode = focusNode.LeftChild;
            }
            else
            {
                isLeftChild = false;
                
                focusNode = focusNode.RightChild;
            }
            
            if(focusNode == null)
            {
                return false;
            }
        }
        //Check whether the focusNode have left and right child
        //Tree blanacing part starts here
        if(focusNode.LeftChild == null &&  focusNode.RightChild == null)
        {
            if(focusNode == null)
            {
                root = null;
            }
            else if(isLeftChild)
            {
                Parent.LeftChild = null;
            }
            else 
            {
                Parent.RightChild = null; 
            }
        }
        else if(focusNode.RightChild == null)
        {
            if(focusNode == root)
            {
                root = focusNode.LeftChild;
            }
            else if(isLeftChild)
            {
                Parent.LeftChild = focusNode.LeftChild;
            }
            else
            {
                Parent.RightChild = focusNode.LeftChild;
            }
        } 
        else if(focusNode.LeftChild == null)
        {
            if(focusNode == root)
            {
                root = focusNode.RightChild;
            }
            else if(isLeftChild)
            {
                Parent.LeftChild = focusNode.RightChild;
            }
            else
            {
                Parent.RightChild = focusNode.LeftChild;
            }
        }
        else 
        {
            //Call the grtReplacementNode method to replace the delete node
            Book Replacement = grtReplcementNode(focusNode);
   
            if(focusNode == root)
            {
                root = Replacement;
            }
            else if(isLeftChild)
            {
                Parent.LeftChild = Replacement;
            }
            else
            {
                Parent.RightChild = Replacement;
            }
                Replacement.LeftChild = focusNode.LeftChild;
            }
            return true;
        } 
        //If we delete ISBN key from tree, we have to balance the tree
        public Book grtReplcementNode(Book ReplaceNode)
        {
  
            Book ReplacementParent = ReplaceNode;
            Book Replacement = ReplaceNode; 
            Book focusNode = ReplaceNode.RightChild;
  
            while(focusNode != null)
            {
                ReplacementParent = Replacement;
                Replacement = focusNode; 
                focusNode = focusNode.LeftChild;   
            }
            if(Replacement != ReplaceNode.RightChild)
            {
                ReplacementParent.LeftChild = Replacement.RightChild;  
                Replacement.RightChild = ReplaceNode.RightChild;
            }
  
            return Replacement; 
        }

//End of Delete method

/********************************Traversal**************************************/    
 public void PreorderTraversTree(Book focusNode) {

        if (focusNode != null) 
        {
            System.out.println(focusNode);
            PreorderTraversTree(focusNode.LeftChild);
            PreorderTraversTree(focusNode.RightChild);
        }
    }
}
//End of traversal   