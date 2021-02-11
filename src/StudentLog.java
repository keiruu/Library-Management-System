import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class StudentLog extends javax.swing.JFrame {

   
    
     Connection conn = null;
    public StudentLog() {
        conn = dbConnection.connect();
        initComponents();
           
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        borrow = new javax.swing.JRadioButton();
        reread = new javax.swing.JRadioButton();
        browse = new javax.swing.JRadioButton();
        Sname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yearc = new javax.swing.JTextField();
        Sid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 248, 194));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(255, 204, 102));
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login.png"))); // NOI18N
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 130, 40));

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
        jPanel2.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(240, 227, 176));

        borrow.setBackground(new java.awt.Color(255, 255, 255));
        borrow.setText("Borrow");
        borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowActionPerformed(evt);
            }
        });
        borrow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                borrowKeyPressed(evt);
            }
        });

        reread.setBackground(new java.awt.Color(255, 255, 255));
        reread.setText("Read/Research");
        reread.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        reread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rereadActionPerformed(evt);
            }
        });
        reread.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rereadKeyPressed(evt);
            }
        });

        browse.setBackground(new java.awt.Color(255, 255, 255));
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        browse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                browseKeyPressed(evt);
            }
        });

        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year and Course*");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student's Name*");

        yearc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearcActionPerformed(evt);
            }
        });

        Sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SidActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID*");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Purpose*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Sid, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(browse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reread)
                .addGap(24, 24, 24)
                .addComponent(borrow)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yearc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)))
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(yearc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrow)
                    .addComponent(browse)
                    .addComponent(reread))
                .addGap(16, 16, 16))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 320, 210));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 26)); // NOI18N
        jLabel1.setText("Student's log");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 180, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student-id-icon (1).png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
         try {
            if (Sname.getText().trim().isEmpty() ||yearc.getText().trim().isEmpty() || Sid.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "SOMETHING IS EMPTY");

            } else if (borrow.isSelected() || browse.isSelected() ||  reread.getText() != null) {

                JOptionPane.showMessageDialog(null, "Login recorded!");

                String sqlconn = "INSERT INTO `librarycard`(`STUDENT_NAME`, `SCHOOL_ID`, `YEAR_AND_COURSE`, `PURPOSE`) VALUES(?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sqlconn);

                pstmt.setString(1, Sname.getText());
                pstmt.setString(2, yearc.getText());
                pstmt.setString(3, Sid.getText());
                if (borrow.isSelected()) {
                    pstmt.setString(4, borrow.getText());
                 
                } else if (browse.isSelected()) {
                    pstmt.setString(4, browse.getText());
                } else if (reread.isSelected()) {
                    pstmt.setString(4, reread.getText());
                
                }
                pstmt.executeUpdate();
               
                Sname.setText(null);
                Sid.setText(null);
                yearc.setText(null);
                borrow.setSelected(false);
                browse.setSelected(false);
                reread.setSelected(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_loginActionPerformed
    }
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

    private void SidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SidActionPerformed

    private void yearcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearcActionPerformed

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

    private void browseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_browseKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String B=browse.getText();
        }
    }//GEN-LAST:event_browseKeyPressed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_browseActionPerformed

    private void rereadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rereadKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String B=reread.getText();
        }

    }//GEN-LAST:event_rereadKeyPressed

    private void rereadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rereadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rereadActionPerformed

    private void borrowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_borrowKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String B = borrow.getText();
        }
    }//GEN-LAST:event_borrowKeyPressed

    private void borrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrowActionPerformed

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login-hover.png")));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
         login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-login.png")));
    }//GEN-LAST:event_loginMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Sid;
    private javax.swing.JTextField Sname;
    private javax.swing.JRadioButton borrow;
    private javax.swing.JRadioButton browse;
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JRadioButton reread;
    private javax.swing.JTextField yearc;
    // End of variables declaration//GEN-END:variables

}
