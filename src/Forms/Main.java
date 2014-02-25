/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

/**
 *
 * @authored by Demons
 */

import java.sql.*;
import common.Book;
import common.BinarySearchTree;
import common.DBConnection;
import java.lang.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    ResultSet rs= null;   
    Connection connection = null;
    PreparedStatement pst = null;
    
     BinarySearchTree theTree = new BinarySearchTree();
    
    public Main() {
        initComponents();
        connection = DBConnection.ConnecrDb();
        show_data();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bookstore?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bookdetailsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bookdetails b");
        bookdetailsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bookdetailsQuery.getResultList();
        bookdetailsQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bookdetails b");
        bookdetailsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bookdetailsQuery1.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        P_search = new javax.swing.JPanel();
        txt_findisbn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        b_print = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ch_name = new javax.swing.JCheckBox();
        ch_isbn = new javax.swing.JCheckBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        P_insert = new javax.swing.JPanel();
        isbn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AFname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ALname = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        insert3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_Delete = new javax.swing.JTextField();
        bt_delete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDeleteDetails = new javax.swing.JTable();
        chkISBN = new javax.swing.JCheckBox();
        ch_BookName = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        bt_ref = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ch_EntireRow = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        P_search.setBackground(new java.awt.Color(255, 255, 255));
        P_search.setMaximumSize(new java.awt.Dimension(32700, 32767));

        jLabel7.setText("Search by ISBN / Name");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        b_print.setText("Print");
        b_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_printActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bookdetailsList, jTable5);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${isbn}"));
        columnBinding.setColumnName("ISBN");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bookName}"));
        columnBinding.setColumnName("Book Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${authorFName}"));
        columnBinding.setColumnName("Author First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${authorLName}"));
        columnBinding.setColumnName("AuthorSurname");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane5.setViewportView(jTable5);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search and Print");

        ch_name.setText("Search By Name");

        ch_isbn.setText("Search By ISBN");

        javax.swing.GroupLayout P_searchLayout = new javax.swing.GroupLayout(P_search);
        P_search.setLayout(P_searchLayout);
        P_searchLayout.setHorizontalGroup(
            P_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_searchLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_searchLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_findisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search)
                        .addGap(61, 61, 61))
                    .addGroup(P_searchLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(ch_isbn)
                        .addGap(169, 169, 169)
                        .addComponent(ch_name)
                        .addGap(239, 239, 239)
                        .addComponent(b_print)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(41, 41, 41))))
            .addGroup(P_searchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        P_searchLayout.setVerticalGroup(
            P_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_findisbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_isbn)
                    .addComponent(ch_name)
                    .addComponent(b_print)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search and Print", P_search);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        P_insert.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ISBN Code");

        jLabel5.setText("First Name");

        jLabel3.setText("Book Name");

        jLabel6.setText("Surname");

        jLabel4.setText("Author");

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        insert3.setText("Insert");
        insert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Insert Book");

        javax.swing.GroupLayout P_insertLayout = new javax.swing.GroupLayout(P_insert);
        P_insert.setLayout(P_insertLayout);
        P_insertLayout.setHorizontalGroup(
            P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_insertLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_insertLayout.createSequentialGroup()
                        .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_insertLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AFname, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALname, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bName, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        P_insertLayout.setVerticalGroup(
            P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_insertLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_insertLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_insertLayout.createSequentialGroup()
                        .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_insertLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(bName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(7, 7, 7)
                                .addGroup(P_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ALname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(P_insertLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
            .addGroup(P_insertLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(insert3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Insert Book", P_insert);

        jTabbedPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Delete by ISBN/Name");

        bt_delete.setText("Delete");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bookdetailsList1, jTableDeleteDetails);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${isbn}"));
        columnBinding.setColumnName("ISBN");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bookName}"));
        columnBinding.setColumnName("Book Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${authorFName}"));
        columnBinding.setColumnName("Author First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${authorLName}"));
        columnBinding.setColumnName("Author Surname");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(jTableDeleteDetails);

        chkISBN.setText("Delete By ISBN");
        chkISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkISBNActionPerformed(evt);
            }
        });

        ch_BookName.setText("Delete By Name");
        ch_BookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_BookNameActionPerformed(evt);
            }
        });

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bt_ref.setText("Refresh");
        bt_ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_refActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Delete Book");

        ch_EntireRow.setText("Entire Record");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(chkISBN)
                        .addGap(92, 92, 92)
                        .addComponent(ch_BookName)
                        .addGap(64, 64, 64)
                        .addComponent(ch_EntireRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_ref)
                        .addGap(39, 39, 39)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_delete)
                        .addGap(202, 202, 202)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(bt_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkISBN)
                        .addComponent(ch_BookName)
                        .addComponent(ch_EntireRow))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_ref)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Delete Book", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane2)
                    .addComponent(jTabbedPane1)
                    .addComponent(jTabbedPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3)
                .addGap(6, 6, 6))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:

        int Isbn=0;

        if(txt_findisbn.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter ISBN key that you want to search","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if(ch_isbn.isSelected())
            {
                Isbn = Integer.parseInt(txt_findisbn.getText().toString());
                JOptionPane.showMessageDialog(null,"\n"+theTree.findNode(Isbn),"Searched Node",JOptionPane.PLAIN_MESSAGE);
            }
            else if(ch_name.isSelected())
            {
                try
                {
                    String BookName=txt_findisbn.getText();
                    String searchdata=txt_findisbn.getText();
                    Statement st=connection.createStatement();

                    String query="SELECT ISBN FROM bookdetails WHERE BookName='"+BookName+"'";
                    rs=st.executeQuery(query);

                    Isbn=Integer.parseInt(rs.getString("ISBN"));

                    JOptionPane.showMessageDialog(null,"\n"+theTree.findNode(Isbn),"Searched Node",JOptionPane.PLAIN_MESSAGE);

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please select the option that you want to search the book details","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_searchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txt_findisbn.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void b_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_printActionPerformed
        // TODO add your handling code here:
        if(txt_findisbn.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter key word or name of the book that you want to print","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            findData();
        }

    }//GEN-LAST:event_b_printActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        show_data();
        update_table();

    }//GEN-LAST:event_viewActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void insert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert3ActionPerformed
        // TODO add your handling code here:
        if(isbn.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter ISBN key","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try
            {
                String sql = "insert into bookdetails(ISBN,BookName,AuthorFName,AuthorLName) values(?,?,?,?)";
                pst = connection.prepareStatement(sql);
                pst.setString(1,isbn.getText());
                pst.setString(2,bName.getText());
                pst.setString(3,AFname.getText());
                pst.setString(4,ALname.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null,"Saved");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_insert3ActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        try
        {

            String QrySearchValue=null;
            String ColumnName=null;
            int row=0;
            if(chkISBN.isSelected())
            {
                ColumnName="ISBN";
                QrySearchValue=txt_Delete.getText();
            }
            if(ch_EntireRow.isSelected())
            {
                row=jTableDeleteDetails.getSelectedRow();
                if(row != -1)
                {
                    ColumnName="ISBN";

                    QrySearchValue =(jTableDeleteDetails.getModel().getValueAt(row, 1).toString());

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please select a record which you want to delete");
                    return;
                }
            }
            if(ch_BookName.isSelected())
            {
                ColumnName="Bookname";
                QrySearchValue=txt_Delete.getText();
            }

            int input = JOptionPane.showOptionDialog(null, "Are you sure you want delete this", "The title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION)
            {

                theTree.Delete(Integer.parseInt(QrySearchValue));
                System.out.println("\nSearch for deleted ISBN "+txt_Delete.getText()+" is exist or not");
                int deleisbn = Integer.parseInt(txt_Delete.getText());
                System.out.println(theTree.findNode(deleisbn));

                String query="DELETE FROM bookdetails WHERE "+ColumnName+"='"+QrySearchValue+"'";
                pst=connection.prepareStatement(query);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record has been deleted successfully");
                txt_Delete.setText("");
                
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_bt_deleteActionPerformed

    private void chkISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkISBNActionPerformed

    private void ch_BookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_BookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_BookNameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txt_Delete.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bt_refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_refActionPerformed
        // TODO add your handling code here:
        refresh_table();
    }//GEN-LAST:event_bt_refActionPerformed

     public void findData()
    {
                try
                {                           
                    Statement st=connection.createStatement();
                    String search = txt_findisbn.getText();
                    String query="SELECT ISBN,BookName,AuthorFName,AuthorLName FROM bookdetails WHERE BookName LIKE CONCAT('%','"+search+"','%')";
                    rs=st.executeQuery(query);
                    jTable5.setModel(DbUtils.resultSetToTableModel(rs));               
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }  
    }
     
     public void update_table()
    {
        try
        {
            Statement st=connection.createStatement();
            String query="SELECT ISBN,BookName,AuthorFName,AuthorLName FROM bookdetails";
            rs=st.executeQuery(query);
            jTable5.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null, e);
        }  
        
    }
     public void refresh_table()
     {
         try
        {
            Statement st=connection.createStatement();
            String query="SELECT ISBN,BookName,AuthorFName,AuthorLName FROM bookdetails";
            rs=st.executeQuery(query);           
            jTableDeleteDetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null, e);
        }  
     }
     
     public void show_data() 
    {
        int isbn;
        String bookname;
        String AuthorFname;
        String AuthorLname;
        
        try
        {        
            Statement st=connection.createStatement();
            String query="SELECT * FROM bookdetails";
            rs=st.executeQuery(query);
        
            while(rs.next())
            {
                isbn=Integer.parseInt(rs.getString("ISBN"));
                bookname=rs.getString("BookName");            
                AuthorFname=rs.getString("AuthorFName");
                AuthorLname=rs.getString("AuthorLName");                
                theTree.InsertNode(isbn,bookname,AuthorFname,AuthorLname);
            }  
            System.out.println("\n");
            System.out.println("Data collection according to Binary Search Tree");
             System.out.println("----------------------------------------------------\n");
           theTree.PreorderTraversTree(theTree.root); 
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }       
    }
     
     public void clear()
    {
            ALname.setText("");
            AFname.setText("");
            bName.setText("");
            isbn.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AFname;
    private javax.swing.JTextField ALname;
    private javax.swing.JPanel P_insert;
    private javax.swing.JPanel P_search;
    private javax.swing.JTextField bName;
    private javax.swing.JButton b_print;
    private java.util.List<Forms.Bookdetails> bookdetailsList;
    private java.util.List<Forms.Bookdetails> bookdetailsList1;
    private javax.persistence.Query bookdetailsQuery;
    private javax.persistence.Query bookdetailsQuery1;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_ref;
    private javax.swing.JCheckBox ch_BookName;
    private javax.swing.JCheckBox ch_EntireRow;
    private javax.swing.JCheckBox ch_isbn;
    private javax.swing.JCheckBox ch_name;
    private javax.swing.JCheckBox chkISBN;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton insert3;
    private javax.swing.JTextField isbn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTableDeleteDetails;
    private javax.swing.JButton search;
    private javax.swing.JTextField txt_Delete;
    private javax.swing.JTextField txt_findisbn;
    private javax.swing.JButton view;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
