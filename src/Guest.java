import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Guest extends javax.swing.JFrame {

    Connection conn = null;
    public Guest() {
        initComponents();
        conn = dbConnection.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        clogin = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        gnumber = new javax.swing.JTextField();
        gname = new javax.swing.JTextField();
        gschool = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gage = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gbrowse = new javax.swing.JRadioButton();
        gread = new javax.swing.JRadioButton();
        gmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lbl_warningguest = new javax.swing.JLabel();
        lbl_warningguest1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 248, 194));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clogin.setBackground(new java.awt.Color(255, 248, 194));
        clogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login.png"))); // NOI18N
        clogin.setBorder(null);
        clogin.setBorderPainted(false);
        clogin.setContentAreaFilled(false);
        clogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cloginMouseExited(evt);
            }
        });
        clogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cloginActionPerformed(evt);
            }
        });
        jPanel2.add(clogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 120, 50));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button.png"))); // NOI18N
        btn_exit.setBorder(null);
        btn_exit.setBorderPainted(false);
        btn_exit.setContentAreaFilled(false);
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel2.setText("Guest's log");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 240, 70));

        jPanel1.setBackground(new java.awt.Color(240, 227, 176));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 53, -1));

        gnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gnumberKeyPressed(evt);
            }
        });
        jPanel1.add(gnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 95, 169, -1));
        jPanel1.add(gname, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 11, 169, -1));

        gschool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gschoolActionPerformed(evt);
            }
        });
        jPanel1.add(gschool, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 69, 169, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Age*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 41, 53, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("School/Organization*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 130, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact Number*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 130, -1));

        gage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gageActionPerformed(evt);
            }
        });
        gage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gageKeyPressed(evt);
            }
        });
        jPanel1.add(gage, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 38, 169, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Purpose*");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 130, -1));

        gbrowse.setBackground(new java.awt.Color(255, 255, 255));
        gbrowse.setText("Browse");
        jPanel1.add(gbrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 183, 80, -1));

        gread.setBackground(new java.awt.Color(255, 255, 255));
        gread.setText("Read/Research");
        jPanel1.add(gread, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 183, 126, -1));
        jPanel1.add(gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 121, 169, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 130, -1));

        lbl_warningguest.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl_warningguest.setForeground(new java.awt.Color(255, 51, 51));
        lbl_warningguest.setToolTipText("");
        jPanel1.add(lbl_warningguest, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 70, 40));

        lbl_warningguest1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl_warningguest1.setForeground(new java.awt.Color(255, 51, 51));
        lbl_warningguest1.setToolTipText("");
        jPanel1.add(lbl_warningguest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 390, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Address-book-icon_1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 140, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gschoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gschoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gschoolActionPerformed

    private void cloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cloginActionPerformed
        try {
            if (gname.getText().trim().isEmpty() || gschool.getText().trim().isEmpty() ||
                gnumber.getText().trim().isEmpty() || gage.getText().isEmpty() || gmail.getText().trim().isEmpty()) { 
                JOptionPane.showMessageDialog(null, "Some fields are empty");
            }else {
                JOptionPane.showMessageDialog(null, "Login recorded!");

                String sqlconn = "INSERT INTO `guest`(`GUEST_NAME`, `AGE`, `SCHOOL`, `CONTACT`, `EMAIL`, `PURPOSE`) VALUES (?,?,?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sqlconn);

                pstmt.setString(1, gname.getText());
                pstmt.setString(2, gage.getText());
                pstmt.setString(3, gschool.getText());
                pstmt.setString(4, gnumber.getText());
                pstmt.setString(5, gmail.getText());
                if (gbrowse.isSelected()) {
                    pstmt.setString(6, "Browse");
                } else if (gread.isSelected()) {
                    pstmt.setString(6, "Read/Research");
                } else {
                    pstmt.setString(6, "");
                }
                pstmt.executeUpdate();

                gname.setText(null);
                gschool.setText(null);
                gage.setText(null);
                gnumber.setText(null);
                gmail.setText(null);
                gbrowse.setSelected(false);
                gread.setSelected(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cloginActionPerformed

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button-hover.png")));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button.png")));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed

        setVisible(false);
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void gageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gageActionPerformed

    private void cloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloginMouseEntered
        clogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login-hover.png")));
    }//GEN-LAST:event_cloginMouseEntered

    private void cloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloginMouseExited
        clogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login.png")));
    }//GEN-LAST:event_cloginMouseExited

    private void gageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gageKeyPressed
        String value = gage.getText();
            int l = value.length();
            if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
               gage.setEditable(true);
               lbl_warningguest.setText("");
            } else {
               gage.setEditable(false);
               lbl_warningguest.setText("Numbers only");
            }
    }//GEN-LAST:event_gageKeyPressed

    private void gnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gnumberKeyPressed
        String value = gnumber.getText();
            int l = value.length();
            if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
               gnumber.setEditable(true);
               lbl_warningguest1.setText("");
            } else {
               gnumber.setEditable(false);
               lbl_warningguest1.setText("Numbers only");
            }
    }//GEN-LAST:event_gnumberKeyPressed

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
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton clogin;
    private javax.swing.JTextField gage;
    private javax.swing.JRadioButton gbrowse;
    private javax.swing.JTextField gmail;
    private javax.swing.JTextField gname;
    private javax.swing.JTextField gnumber;
    private javax.swing.JRadioButton gread;
    private javax.swing.JTextField gschool;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_warningguest;
    private javax.swing.JLabel lbl_warningguest1;
    // End of variables declaration//GEN-END:variables
}
