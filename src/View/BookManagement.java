package View;

import DAO.BookDAO;
import Model.Book;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;

public class BookManagement extends javax.swing.JFrame {
    private BookDAO bookDAO;
    private DefaultTableModel tableModel;

    public BookManagement() {
        bookDAO = new BookDAO(); 
        initComponents(); 
        tableModel = new DefaultTableModel(new Object[]{"Book ID", "Book Name", "Author Name", "Published Year", "Price", "Genre"}, 0);
        tableBooks.setModel(tableModel); 
        loadBooks(); 
    }
    
    public List<Book> getBookList() {
    return bookDAO.getAllBooks();
}


 private void loadBooks() {
    List<Book> books = bookDAO.loadActiveBooks(); 
    tableModel.setRowCount(0); 
    for (Book book : books) {
        tableModel.addRow(new Object[]{
            book.getBookID(),
            book.getBookName(),
            book.getAuthorName(),
            book.getPublishedYear(),
            book.getPrice(),
            book.getGenre()
        });
    }
}



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 120, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        txtSearch.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 155, 30));

        btnSearch.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCHCS\\Desktop\\LMSystem\\Icon 1\\Icon 1\\search.png")); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 110, -1));

        tableBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author Name", "Published Year", "Price", "Genre"
            }
        ));
        jScrollPane1.setViewportView(tableBooks);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 893, 261));

        btnAdd.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 80, -1));

        btnEdit.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 90, -1));

        btnDelete.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 80, -1));

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddBook addBookDialog = new AddBook(this);
        addBookDialog.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed
    
    public void onBookAdded() {
        loadBooks(); 
    }
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         int selectedRow = tableBooks.getSelectedRow();
        if (selectedRow != -1) {
            String bookID = tableBooks.getValueAt(selectedRow, 0).toString();
            
            EditBook editBookDialog = new EditBook(this, bookID);
            editBookDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a book to edit.");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tableBooks.getSelectedRow();
    if (selectedRow != -1) {
        String bookID = tableBooks.getValueAt(selectedRow, 0).toString();
         int confirm = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to mark this book as inactive?", 
            "Confirm Inactivation", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            
            bookDAO.markBookAsInactive(bookID);
            
             loadBooks();  
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a book to mark as inactive.");
    }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchTerm = txtSearch.getText().toLowerCase(); 
        List<Book> books = bookDAO.getAllBooks(); 
        tableModel.setRowCount(0); 
        
        for (Book book : books) {
            
            if (book.getBookID().toLowerCase().contains(searchTerm) ||
                book.getBookName().toLowerCase().contains(searchTerm) ||
                book.getAuthorName().toLowerCase().contains(searchTerm) ||
                String.valueOf(book.getPublishedYear()).contains(searchTerm) ||
                book.getGenre().toLowerCase().contains(searchTerm)) {
                tableModel.addRow(new Object[]{
                    book.getBookID(),
                    book.getBookName(),
                    book.getAuthorName(),
                    book.getPublishedYear(),
                    book.getPrice(),
                    book.getGenre()
                });
            }
        }

        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No books found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBooks;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}