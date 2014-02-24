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

import Forms.Insert;
public class Book 
{

     int isbn;  
     String bookName;
     String autherFirstName;
     String autherLastName;
    
        Book RightChild;
        Book LeftChild;
        
         private javax.swing.JTable jTable5;

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
                    StringBuilder result = new StringBuilder();
                    //String NEW_LINE = System.getProperty("line.separator");
                  
                    //result.append(this.getClass().getName() + "\t");
                    
                    /*result.append("\t" + bookName);
                    result.append("\t" + autherFirstName);
                    result.append("\t" + autherLastName);
                    result.append("\t" + isbn);
              
    //Note that Collections and Maps also override toString

                    return result.toString();*/
                    	return bookName+"\t"+autherFirstName+"\t"+autherLastName+"\t" + isbn;
		}
}
