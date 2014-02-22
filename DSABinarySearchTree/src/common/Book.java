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
public class Book {
    
    Book RightChild;
    Book LeftChild;
    
    private int isbn;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutherFirstName() {
        return autherFirstName;
    }

    public void setAutherFirstName(String autherFirstName) {
        this.autherFirstName = autherFirstName;
    }

    public String getAutherLastName() {
        return autherLastName;
    }

    public void setAutherLastName(String autherLastName) {
        this.autherLastName = autherLastName;
    }
    
    private String category;
    
    private String bookName;
    
    private String autherFirstName;
    
    private String autherLastName;   
    
    public String toString()
		{
                   
			return isbn+" "+category+ " by "+bookName+" "+autherFirstName+" " + autherLastName;

		}
      
    
}
