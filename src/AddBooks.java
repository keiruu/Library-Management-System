import java.lang.reflect.InvocationTargetException;
import javax.swing.*;
import java.sql.*;
import java.lang.reflect.Method;  
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddBooks extends javax.swing.JFrame {
    
    // SQL CONNECTION
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int num = 0;
    int philNumber = 0, generalNumber = 0;
    
    
    public AddBooks() {
        initComponents();
        conn = dbConnection.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tf_booktitle = new javax.swing.JTextField();
        lbl_booktitle = new javax.swing.JLabel();
        tf_author = new javax.swing.JTextField();
        lbl_author = new javax.swing.JLabel();
        lbl_genre = new javax.swing.JLabel();
        cb_genre = new javax.swing.JComboBox<>();
        lbl_attachedFilename = new javax.swing.JLabel();
        tf_isbn = new javax.swing.JTextField();
        lbl_isbnserial = new javax.swing.JLabel();
        lbl_language = new javax.swing.JLabel();
        tf_language = new javax.swing.JTextField();
        lbl_category1 = new javax.swing.JLabel();
        cb_category = new javax.swing.JComboBox<>();
        tf_yrPublished = new javax.swing.JTextField();
        lbl_yrPublished = new javax.swing.JLabel();
        tf_publisher = new javax.swing.JTextField();
        lbl_author3 = new javax.swing.JLabel();
        tf_noOfCopies = new javax.swing.JTextField();
        lbl_noOfCopies = new javax.swing.JLabel();
        lbl_copiesWarning = new javax.swing.JLabel();
        btn_registerbook = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 248, 194));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Add new books");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(240, 227, 176));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(58, 120, 241))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_booktitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel2.add(tf_booktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 450, 31));

        lbl_booktitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_booktitle.setText("Book Title");
        jPanel2.add(lbl_booktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        tf_author.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel2.add(tf_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 31));

        lbl_author.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_author.setText("Author");
        jPanel2.add(lbl_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbl_genre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_genre.setText("Genre");
        lbl_genre.setToolTipText("");
        jPanel2.add(lbl_genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        cb_genre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        cb_genre.setMaximumRowCount(11);
        cb_genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Science Fiction", "Fantasy", "Educational", "Others" }));
        jPanel2.add(cb_genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 220, 33));

        lbl_attachedFilename.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel2.add(lbl_attachedFilename, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, -1, -1));

        tf_isbn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel2.add(tf_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 450, 31));

        lbl_isbnserial.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_isbnserial.setText("ISBN/Serial Number");
        jPanel2.add(lbl_isbnserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lbl_language.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_language.setText("Language");
        jPanel2.add(lbl_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        tf_language.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel2.add(tf_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 220, 31));

        lbl_category1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_category1.setText("Subject");
        lbl_category1.setToolTipText("");
        jPanel2.add(lbl_category1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        cb_category.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        cb_category.setMaximumRowCount(11);
        cb_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Works", "Philosophy", "Religion", "Social Science", "Language", "Natural Science", "Applied Science", "Arts and Recreation", "Literature", "Geography and History", "Biography", "Others" }));
        jPanel2.add(cb_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, 33));

        tf_yrPublished.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel2.add(tf_yrPublished, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 31));

        lbl_yrPublished.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_yrPublished.setText("Year Published");
        jPanel2.add(lbl_yrPublished, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        tf_publisher.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel2.add(tf_publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 220, 31));

        lbl_author3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_author3.setText("Publisher");
        jPanel2.add(lbl_author3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        tf_noOfCopies.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        tf_noOfCopies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_noOfCopiesKeyPressed(evt);
            }
        });
        jPanel2.add(tf_noOfCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 220, 31));

        lbl_noOfCopies.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_noOfCopies.setText("No. of Copies");
        jPanel2.add(lbl_noOfCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lbl_copiesWarning.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        lbl_copiesWarning.setForeground(new java.awt.Color(255, 102, 102));
        jPanel2.add(lbl_copiesWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 110, 512, 450));

        btn_registerbook.setBackground(new java.awt.Color(255, 188, 73));
        btn_registerbook.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        btn_registerbook.setForeground(new java.awt.Color(255, 255, 255));
        btn_registerbook.setText("Register Book");
        btn_registerbook.setAutoscrolls(true);
        btn_registerbook.setBorderPainted(false);
        btn_registerbook.setDefaultCapable(false);
        btn_registerbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerbookActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registerbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 578, -1, 43));

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
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void resetLabels(){
                cb_category.setSelectedItem("General Works");
                lbl_attachedFilename.setText("");
                tf_booktitle.setText("");
                tf_author.setText("");
                tf_isbn.setText("");
                tf_publisher.setText("");
                cb_genre.setSelectedItem("Fiction");
                tf_yrPublished.setText("");
                tf_language.setText("");
                tf_noOfCopies.setText("");
    }  
    
    private void checking(){
        try{
            String queryOne = "SELECT `ISBN` FROM `register_books`";
                Statement st = conn.createStatement();
                rs = st.executeQuery(queryOne);
                // LOOP THROUGH ALL BOOK_ID ENTRIES FROM REGISTER_BOOKS
                while (rs.next()) {
                    String isbn = rs.getString("ISBN");
                    if(tf_isbn.getText().equals(isbn)){
                        JOptionPane.showMessageDialog(null, "There's already a book with the same ISBN");  
                    }
                }
        }catch(Exception e){
            
        }
    }
    
    //Action performed when clicking register button
    private void btn_registerbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerbookActionPerformed
        try{
            if(cb_genre.getSelectedItem().toString() == null || tf_booktitle.getText() == null || tf_author.getText() == null || tf_isbn.getText() == null || tf_publisher.getText() == null || tf_yrPublished.getText() == null || tf_language.getText() == null || tf_noOfCopies.getText() == null){
                    JOptionPane.showMessageDialog(null, "Some fields are empty");                
            }else {
                checking();
                // insert queries
                String query = "INSERT INTO `register_books`(`ISBN`, `BOOK_TITLE`, `BOOK_AUTHOR`, `CATEGORY`, `PUBLISHER`, `GENRE`, `YEAR_PUBLISHED`, `LANGUAGE`, `COPIES`, `AVAILABLE`, `BORROWED`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                pst = conn.prepareStatement(query); 
                               
                // Send current selected to the database
                pst.setString(1, tf_isbn.getText());
                pst.setString(2, tf_booktitle.getText());
                pst.setString(3, tf_author.getText());
                pst.setString(4, cb_category.getSelectedItem().toString());
                pst.setString(5, tf_publisher.getText());
                pst.setString(6, cb_genre.getSelectedItem().toString());
                pst.setString(7, tf_yrPublished.getText());
                pst.setString(8, tf_language.getText());
                pst.setString(9, tf_noOfCopies.getText());
                pst.setString(10, tf_noOfCopies.getText());
                pst.setString(11, "0");
                pst.executeUpdate();
                
                
                JOptionPane.showMessageDialog(null, "Book successfully registered!");
                
                resetLabels();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please check entered data again");
        }
    }//GEN-LAST:event_btn_registerbookActionPerformed

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button-hover.png")));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button.png")));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        try {
            Class c = Class.forName("Admin");
            Object o = c.newInstance();
            Method m =c.getDeclaredMethod("DisplayTable");
            m.setAccessible(true);
            m.invoke(o, null);
            setVisible(false);
           // dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    private void tf_noOfCopiesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_noOfCopiesKeyPressed
        String value = tf_noOfCopies.getText();
            int l = value.length();
            if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
               tf_noOfCopies.setEditable(true);
               lbl_copiesWarning.setText("");
            } else {
               tf_noOfCopies.setEditable(false);
               lbl_copiesWarning.setText("Enter only numbers");
            }
    }//GEN-LAST:event_tf_noOfCopiesKeyPressed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBooks().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_registerbook;
    private javax.swing.JComboBox<String> cb_category;
    private javax.swing.JComboBox<String> cb_genre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_attachedFilename;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_author3;
    private javax.swing.JLabel lbl_booktitle;
    private javax.swing.JLabel lbl_category1;
    private javax.swing.JLabel lbl_copiesWarning;
    private javax.swing.JLabel lbl_genre;
    private javax.swing.JLabel lbl_isbnserial;
    private javax.swing.JLabel lbl_language;
    private javax.swing.JLabel lbl_noOfCopies;
    private javax.swing.JLabel lbl_yrPublished;
    private javax.swing.JTextField tf_author;
    private javax.swing.JTextField tf_booktitle;
    private javax.swing.JTextField tf_isbn;
    private javax.swing.JTextField tf_language;
    private javax.swing.JTextField tf_noOfCopies;
    private javax.swing.JTextField tf_publisher;
    private javax.swing.JTextField tf_yrPublished;
    // End of variables declaration//GEN-END:variables
}
