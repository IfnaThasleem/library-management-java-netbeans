/*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        txtBookName = new javax.swing.JTextField();
        txtAuthorName = new javax.swing.JTextField();
        txtPublishedYear = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxGenre = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Author Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Published Year:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtBookID.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPanel1.add(txtBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 251, -1));

        txtBookName.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPanel1.add(txtBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 251, -1));

        txtAuthorName.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPanel1.add(txtAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 251, -1));

        txtPublishedYear.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPanel1.add(txtPublishedYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 251, -1));

        btnAdd.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCHCS\\Desktop\\LMSystem\\Icon 1\\Icon 1\\save-icon--1.png")); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 90, 30));

        btnCancel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/red-x-mark-transparent-background-3.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 90, 30));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txtPrice.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 251, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        comboBoxGenre.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        comboBoxGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Folk", "Dictionary", "Encyclopedia", "Text Books", "Magazine", "Novel", " " }));
        jPanel1.add(comboBoxGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 251, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String bookID = txtBookID.getText().trim();
        String bookName = txtBookName.getText().trim();
        String authorName = txtAuthorName.getText().trim();
        String publishedYearStr = txtPublishedYear.getText().trim();
        String priceStr = txtPrice.getText().trim();
        String genre = comboBoxGenre.getSelectedItem().toString();

        if (bookID.isEmpty() || bookName.isEmpty() || authorName.isEmpty() || publishedYearStr.isEmpty() || priceStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int publishedYear = Integer.parseInt(publishedYearStr);
            double price = Double.parseDouble(priceStr);
            
            // Use the BookDAO to add the book
            bookDAO.addBook(bookID, bookName, authorName, publishedYear, price, genre);
            JOptionPane.showMessageDialog(this, "Book added successfully.");
            this.dispose(); // Close the AddBook window
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values for Year and Price.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed
    
    // Sample method to save the book data
    private boolean addBook(String bookID, String bookName, String authorName, int year, double price, String genre) {
        // Logic to save book information (e.g., to database or file)
        // Return true if save is successful, otherwise false.
        return true; // Placeholder for actual save logic
    }
    
    
    public static void main(String args[]) {
// Assuming you have a BookManagement class defined
    BookManagement bookManagement = new BookManagement(); // Create an instance of BookManagement
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new AddBook(bookManagement).setVisible(true); // Pass the instance to the AddBook constructor
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> comboBoxGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPublishedYear;
    // End of variables declaration//GEN-END:variables
}*/
package View;

import DAO.BookDAO; 
import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddBook extends javax.swing.JFrame {
    private BookManagement bookManagement;
    private BookDAO bookDAO;

    public AddBook(BookManagement bookManagement) {
        this.bookManagement = bookManagement;
        this.bookDAO = new BookDAO(); 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBookID = new javax.swing.JTextField();
        txtBookName = new javax.swing.JTextField();
        txtAuthorName = new javax.swing.JTextField();
        txtPublishedYear = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxGenre = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel1.setText("Book ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel2.setText("Book Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel3.setText("Author Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel4.setText("Published Year:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtBookID.setFont(new java.awt.Font("sansserif", 1, 12));
        jPanel1.add(txtBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 251, -1));

        txtBookName.setFont(new java.awt.Font("sansserif", 1, 12));
        jPanel1.add(txtBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 251, -1));

        txtAuthorName.setFont(new java.awt.Font("sansserif", 1, 12));
        jPanel1.add(txtAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 251, -1));

        txtPublishedYear.setFont(new java.awt.Font("sansserif", 1, 12));
        jPanel1.add(txtPublishedYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 251, -1));

        btnAdd.setFont(new java.awt.Font("sansserif", 1, 14));
        btnAdd.setText("Add");
        btnAdd.addActionListener(this::btnAddActionPerformed);
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 85, -1));

        btnCancel.setFont(new java.awt.Font("sansserif", 1, 14));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(evt -> this.dispose());
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel5.setText("Price:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txtPrice.setFont(new java.awt.Font("sansserif", 1, 12));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 251, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel6.setText("Genre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        comboBoxGenre.setFont(new java.awt.Font("sansserif", 1, 12));
        comboBoxGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Folk", "Dictionary", "Encyclopedia", "Text Books", "Magazine", "Novel" }));
        jPanel1.add(comboBoxGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 251, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        String bookID = txtBookID.getText().trim();
        String bookName = txtBookName.getText().trim();
        String authorName = txtAuthorName.getText().trim();
        String publishedYearStr = txtPublishedYear.getText().trim();
        String priceStr = txtPrice.getText().trim();
        String genre = comboBoxGenre.getSelectedItem().toString();

        if (bookID.isEmpty() || bookName.isEmpty() || authorName.isEmpty() || publishedYearStr.isEmpty() || priceStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int publishedYear = Integer.parseInt(publishedYearStr);
            double price = Double.parseDouble(priceStr);

            
            bookDAO.addBook(bookID, bookName, authorName, publishedYear, price, genre);
            JOptionPane.showMessageDialog(this, "Book added successfully.");

            
            bookManagement.onBookAdded();

            this.dispose(); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values for Year and Price.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        BookManagement bookManagement = new BookManagement();
        java.awt.EventQueue.invokeLater(() -> new AddBook(bookManagement).setVisible(true));
    }

                
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> comboBoxGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPublishedYear;
             
}

