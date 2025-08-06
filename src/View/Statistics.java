package View;
import DAO.BookDAO;
import DAO.IssueBookDAO;
import DAO.MemberDAO;
import DAO.ReturnDAO;
import DAO.StatisticsDAO;
import Model.IssueBook;
import Model.ReturnBook;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class Statistics extends javax.swing.JFrame {

  private IssueBookDAO issueBookDAO;
   private ReturnDAO returnDAO;
   private MemberDAO memberDAO; 
   private BookDAO bookDAO;  
   private StatisticsDAO statisticsDAO; 

   public Statistics() {
      initComponents();
      
      
      bookDAO = new BookDAO();  
      issueBookDAO = new IssueBookDAO();
      returnDAO = new ReturnDAO();
      memberDAO = new MemberDAO();  
      statisticsDAO = new StatisticsDAO();  
      
      loadIssuedBookDetails();  
      loadReturnedBookDetails();  
   }



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Issued Book Details");

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "Member Name", "Book ID", "Book Name", "Issued Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Returned Book Details");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "Member Name", "Book ID", "Book Name", "Returned Date", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/red-x-mark-transparent-background-3.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel2)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

private void loadIssuedBookDetails() {
      
      List<IssueBook> issuedBooks = statisticsDAO.getAllIssuedBooks();

      
      loadIssuedBookDetails(issuedBooks, jTable1);  
   }

private void loadReturnedBookDetails() {
      
      List<ReturnBook> returnedBooks = statisticsDAO.getAllReturnedBooks();

      
      loadReturnedBookDetails(returnedBooks, jTable2);  
   }


   
    private void loadIssuedBookDetails(List<IssueBook> bookList, JTable table) {
      DefaultTableModel model = (DefaultTableModel) table.getModel();
      model.setRowCount(0);  

      for (IssueBook issueBook : bookList) {
         Object[] row = new Object[6];

        
         int memberID = issueBook.getMemberID();
         String memberName = memberDAO.getMemberName(memberID);

         
         String bookID = issueBook.getBookID();
         String bookName = bookDAO.getBookName(bookID); 

         
         row[0] = memberID;
         row[1] = memberName;
         row[2] = bookID;
         row[3] = bookName;
         row[4] = (issueBook.getIssueDate() != null) ? issueBook.getIssueDate().toString() : "N/A";
         row[5] = (issueBook.getDueDate() != null) ? "Returned" : "Issued";

         model.addRow(row);
      }
   }

   private void loadReturnedBookDetails(List<ReturnBook> bookList, JTable table) {
      DefaultTableModel model = (DefaultTableModel) table.getModel();
      model.setRowCount(0);  

      for (ReturnBook returnBook : bookList) {
         Object[] row = new Object[6];

         
         int memberID = returnBook.getMemberID();
         String memberName = memberDAO.getMemberName(memberID);

         
         String bookID = returnBook.getBookID();
         String bookName = bookDAO.getBookName(bookID);  

         
         row[0] = memberID;
         row[1] = memberName;
         row[2] = bookID;
         row[3] = bookName;
         row[4] = (returnBook.getReturnDate() != null) ? returnBook.getReturnDate().toString() : "N/A";
         row[5] = "Returned";  

         model.addRow(row);
      }
   }

    public static void main(String args[]) {
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (Exception ex) {
         java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }

      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Statistics().setVisible(true);
         }
      });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

  

  
}



