package View;

import javax.swing.JOptionPane;
import View.AddBook; 


public class Menu extends javax.swing.JFrame {
private BookManagement bookManagement; 

    public Menu() {
        initComponents();
        this.bookManagement = new BookManagement(); 
        setTitle("Admin Menu");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMemberManagement = new javax.swing.JButton();
        btnBookManagement = new javax.swing.JButton();
        btnIssueBook = new javax.swing.JButton();
        btnReturnBook = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1238, 674));
        setSize(new java.awt.Dimension(1238, 674));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMemberManagement.setBackground(new java.awt.Color(204, 204, 204));
        btnMemberManagement.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        btnMemberManagement.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCHCS\\Desktop\\LMSystem\\Icon 1\\Icon 1\\member-add-on-300x300.png")); // NOI18N
        btnMemberManagement.setText("Member \nManagement");
        btnMemberManagement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMemberManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberManagementActionPerformed(evt);
            }
        });
        getContentPane().add(btnMemberManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 320, 60));

        btnBookManagement.setBackground(new java.awt.Color(204, 204, 204));
        btnBookManagement.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        btnBookManagement.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCHCS\\Desktop\\LMSystem\\Icon 1\\Icon 1\\New book.png")); // NOI18N
        btnBookManagement.setText("Book Management");
        btnBookManagement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBookManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookManagementActionPerformed(evt);
            }
        });
        getContentPane().add(btnBookManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, 60));

        btnIssueBook.setBackground(new java.awt.Color(204, 204, 204));
        btnIssueBook.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        btnIssueBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCHCS\\Desktop\\LMSystem\\Icon 1\\Icon 1\\issue.png")); // NOI18N
        btnIssueBook.setText("Issue Book");
        btnIssueBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnIssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 320, 60));

        btnReturnBook.setBackground(new java.awt.Color(204, 204, 204));
        btnReturnBook.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        btnReturnBook.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCHCS\\Desktop\\LMSystem\\Icon 1\\Icon 1\\return-book-1-560407.png")); // NOI18N
        btnReturnBook.setText("Return Book");
        btnReturnBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 320, 60));

        btnStatistics.setBackground(new java.awt.Color(204, 204, 204));
        btnStatistics.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        btnStatistics.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCHCS\\Desktop\\LMSystem\\Icon 1\\Icon 1\\Statics.png")); // NOI18N
        btnStatistics.setText("Statistics");
        btnStatistics.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });
        getContentPane().add(btnStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 320, 60));

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCHCS\\Desktop\\LMSystem\\Icon 1\\Icon 1\\exit.png")); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 160, 50));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/menu.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setMaximumSize(new java.awt.Dimension(1238, 674));
        jLabel1.setMinimumSize(new java.awt.Dimension(1238, 674));
        jLabel1.setPreferredSize(new java.awt.Dimension(1238, 674));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, -10, 1250, 530));
        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
                                          
    
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);


    if (confirm == JOptionPane.YES_OPTION) {
        
        new LoginView().setVisible(true); 
        this.dispose(); 
    }

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnMemberManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberManagementActionPerformed
        new MemberManagement().setVisible(true);
    }//GEN-LAST:event_btnMemberManagementActionPerformed

    private void btnBookManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookManagementActionPerformed
        new BookManagement().setVisible(true);

    }//GEN-LAST:event_btnBookManagementActionPerformed

    private void btnIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBookActionPerformed
         new IssueBooks().setVisible(true);
    }//GEN-LAST:event_btnIssueBookActionPerformed

    private void btnReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBookActionPerformed
       new ReturnBooks().setVisible(true);
    }//GEN-LAST:event_btnReturnBookActionPerformed

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
        new Statistics().setVisible(true);
    }//GEN-LAST:event_btnStatisticsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookManagement;
    private javax.swing.JButton btnIssueBook;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMemberManagement;
    private javax.swing.JButton btnReturnBook;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

   
       
}
