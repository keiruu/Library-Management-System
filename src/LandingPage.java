
public class LandingPage extends javax.swing.JFrame {

    
    public LandingPage() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        btn_exit = new javax.swing.JButton();
        btn_guest = new javax.swing.JButton();
        pic_landingpage = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_library = new javax.swing.JLabel();
        lbl_system = new javax.swing.JLabel();
        lbl_system1 = new javax.swing.JLabel();
        pic_landingpage2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        btn_guest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-admin.png"))); // NOI18N
        btn_guest.setBorder(null);
        btn_guest.setBorderPainted(false);
        btn_guest.setContentAreaFilled(false);
        btn_guest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guestMouseExited(evt);
            }
        });
        btn_guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guestActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 120, 40));

        pic_landingpage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/landingpage_picture.png"))); // NOI18N
        jPanel1.add(pic_landingpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 504, 313));

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login.png"))); // NOI18N
        btn_login.setBorder(null);
        btn_login.setBorderPainted(false);
        btn_login.setContentAreaFilled(false);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loginMouseExited(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 120, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_library.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        lbl_library.setForeground(new java.awt.Color(12, 24, 115));
        lbl_library.setText("Library");
        jPanel2.add(lbl_library, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbl_system.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        lbl_system.setForeground(new java.awt.Color(12, 24, 115));
        lbl_system.setText("Management");
        jPanel2.add(lbl_system, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lbl_system1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        lbl_system1.setForeground(new java.awt.Color(12, 24, 115));
        lbl_system1.setText("System");
        jPanel2.add(lbl_system1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        pic_landingpage2.setBackground(new java.awt.Color(255, 248, 194));
        pic_landingpage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wvsu_logo.png"))); // NOI18N
        jPanel1.add(pic_landingpage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // ACTION BUTTONS
    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button-hover.png")));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button.png")));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login-hover.png")));
    }//GEN-LAST:event_btn_loginMouseEntered

    private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
         btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login.png")));
    }//GEN-LAST:event_btn_loginMouseExited

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guestActionPerformed
        Adminpage ad = new Adminpage();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_guestActionPerformed

    private void btn_guestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guestMouseExited
        btn_guest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-admin.png")));
    }//GEN-LAST:event_btn_guestMouseExited

    private void btn_guestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guestMouseEntered
        btn_guest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-admin-hover.png")));
    }//GEN-LAST:event_btn_guestMouseEntered

    
    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_guest;
    private javax.swing.JButton btn_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lbl_library;
    private javax.swing.JLabel lbl_system;
    private javax.swing.JLabel lbl_system1;
    private javax.swing.JLabel pic_landingpage;
    private javax.swing.JLabel pic_landingpage2;
    // End of variables declaration//GEN-END:variables
}
