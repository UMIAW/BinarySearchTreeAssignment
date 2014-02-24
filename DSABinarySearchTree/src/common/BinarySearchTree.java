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

public class BinarySearchTree {
    
  public Book root;

//Insert part comes here
  
  
//End of Insert Method
    
 //Find node comes here
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



//Delete part comes here

//End of Delete method

//Traversal
    

 //End of traversal   
      

}
