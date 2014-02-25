/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @authored by Demons
 */
public class Book 
{

     int isbn;  
     String bookName;
     String autherFirstName;
     String autherLastName;
    
        Book RightChild;
        Book LeftChild;
        
      

		// Create Constructor For assign values
		Book(int isbn , String bookName, String autherFirstName, String autherLastName)
		{
			this.isbn=isbn;                   
			this.bookName = bookName;
                        this.autherFirstName=autherFirstName;
			this.autherLastName = autherLastName;

		}

		public String toString()
		{              
                    	return bookName+"\t"+autherFirstName+"\t"+autherLastName+"\t" + isbn;
		}
}
