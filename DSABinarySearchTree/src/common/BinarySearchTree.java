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

public class BinarySearchTree {

    //ArrayList<Book> dataList = new ArrayList<Book>();

    public Book root;

    public void InsertNode(Book b) {
        int Isbn = b.getIsbn();

        if (root==null) {
            
            root = b;

        } else {
            Book focusNode = root;
            Book Parent;

            while (true) {
                Parent = focusNode;
                if (Isbn < focusNode.getIsbn()) {
                    focusNode = focusNode.LeftChild;
                    if (focusNode == null) {
                        Parent.LeftChild = b;
                        return;
                    }
                } else {
                    focusNode = focusNode.RightChild;
                    if (focusNode == null) {
                        Parent.RightChild = b;
                        return;
                    }
                }
            }
        }
    }

    public void PreorderTraversTree(Book focusNode) {

        if (focusNode != null) {
            System.out.println(focusNode);
            PreorderTraversTree(focusNode.LeftChild);
            PreorderTraversTree(focusNode.RightChild);
        }
    }

}
