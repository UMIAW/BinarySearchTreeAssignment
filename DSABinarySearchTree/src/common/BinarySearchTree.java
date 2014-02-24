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
  public boolean Delete(int key)
 {
  Book focusNode =root;
  Book Parent = root;
  
  boolean isLeftChild = true;
  
  while(focusNode.isbn != key)
  {
   Parent = focusNode;
   
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
    root=focusNode.RightChild;
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
 
 public Book grtReplcementNode(Book ReplaceNode)
 {
  
  Book ReplacementParent = ReplaceNode;
  Book Replacement = ReplaceNode;
  
  Book focusNode =ReplaceNode.RightChild;
  
  while(focusNode != null)
  {
   ReplacementParent=Replacement;
   
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
 //End of delete

//End of Delete method

//Traversal
    

 //End of traversal   
      

}
