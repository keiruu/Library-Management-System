import java.awt.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.lang.*;


public class Admin extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String clickedItem, clickedItemTitle, clickedID, loc;
    int available, borrowed2, totalBooks, totalBorrowed;

    public Admin() {
        initComponents();
        conn = dbConnection.connect();
        update.setVisible(false);
        booksPANEL.setVisible(false);
        issueBooks.setVisible(false);
        returnBooks.setVisible(false);
        addbooks.setVisible(false);
        exportPanel.setVisible(false);
        DisplayTableDashboard();
        DisplayTable();
        getTotalNumberOfBooks();
        getTotalNumberOfBooksBorrowed();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wholebody = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        exportPanel = new javax.swing.JPanel();
        btn_export = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        dm = new javax.swing.JTable();
        cb_log = new javax.swing.JComboBox<>();
        btn_clear = new javax.swing.JButton();
        addbooks = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tf_booktitle1 = new javax.swing.JTextField();
        lbl_booktitle1 = new javax.swing.JLabel();
        tf_author1 = new javax.swing.JTextField();
        lbl_author2 = new javax.swing.JLabel();
        lbl_genre2 = new javax.swing.JLabel();
        cb_genre1 = new javax.swing.JComboBox<>();
        lbl_attachedFilename1 = new javax.swing.JLabel();
        tf_isbn1 = new javax.swing.JTextField();
        lbl_isbnserial1 = new javax.swing.JLabel();
        lbl_language2 = new javax.swing.JLabel();
        tf_language1 = new javax.swing.JTextField();
        lbl_category2 = new javax.swing.JLabel();
        cb_category1 = new javax.swing.JComboBox<>();
        tf_yrPublished1 = new javax.swing.JTextField();
        lbl_yrPublished1 = new javax.swing.JLabel();
        tf_publisher1 = new javax.swing.JTextField();
        lbl_author6 = new javax.swing.JLabel();
        tf_noOfCopies1 = new javax.swing.JTextField();
        lbl_noOfCopies2 = new javax.swing.JLabel();
        lbl_copiesWarning1 = new javax.swing.JLabel();
        btn_registerbook = new javax.swing.JButton();
        btn_exit1 = new javax.swing.JButton();
        dashboardPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        total_books1 = new javax.swing.JPanel();
        lbl_totalBooks1 = new javax.swing.JLabel();
        total_books2 = new javax.swing.JPanel();
        lbl_booksBorrowed1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        borrow_history = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowHistory_table = new javax.swing.JTable();
        returnBooks = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_booksBORROW = new javax.swing.JTable();
        btn_returnBook = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        borrow_search = new javax.swing.JTextField();
        btn_borrowSearch = new javax.swing.JButton();
        catBorrow = new javax.swing.JComboBox<>();
        issueBooks = new javax.swing.JPanel();
        student2 = new javax.swing.JPanel();
        tf_searchISSUE = new javax.swing.JTextField();
        btn_searchStudent1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_booksISSUE = new javax.swing.JTable();
        student3 = new javax.swing.JPanel();
        bookDetails_Titles6 = new javax.swing.JPanel();
        lbl_bookTitle3 = new javax.swing.JLabel();
        lbl_ISBN3 = new javax.swing.JLabel();
        lbl_genre3 = new javax.swing.JLabel();
        lbl_subject3 = new javax.swing.JLabel();
        lbl_author4 = new javax.swing.JLabel();
        lbl_language3 = new javax.swing.JLabel();
        lbl_yearpublished3 = new javax.swing.JLabel();
        lbl_publisher3 = new javax.swing.JLabel();
        bookDetails_Titles7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dueDate = new com.toedter.calendar.JDateChooser();
        btn_issueBooks = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        issueDate = new com.toedter.calendar.JDateChooser();
        student4 = new javax.swing.JPanel();
        bookDetails_Titles8 = new javax.swing.JPanel();
        lbl_bookTitle4 = new javax.swing.JLabel();
        lbl_ISBN4 = new javax.swing.JLabel();
        lbl_genre4 = new javax.swing.JLabel();
        lbl_subject4 = new javax.swing.JLabel();
        lbl_author5 = new javax.swing.JLabel();
        lbl_language4 = new javax.swing.JLabel();
        lbl_yearpublished4 = new javax.swing.JLabel();
        lbl_publisher4 = new javax.swing.JLabel();
        bookDetails_Titles9 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        FULL_NAME = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        STUDENT_ID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        COURSE_STRAND = new javax.swing.JTextField();
        YEAR = new javax.swing.JComboBox<>();
        SECTION = new javax.swing.JTextField();
        update = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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
        lbl_noOfCopies1 = new javax.swing.JLabel();
        lbl_copiesWarning = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        booksPANEL = new javax.swing.JPanel();
        iconIMG = new javax.swing.JLabel();
        borrowed = new javax.swing.JPanel();
        lbl_borrowed = new javax.swing.JLabel();
        final_bookDetails = new javax.swing.JPanel();
        bookDetails_Titles2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bookDetails_Titles3 = new javax.swing.JPanel();
        lbl_bookTitle1 = new javax.swing.JLabel();
        lbl_ISBN1 = new javax.swing.JLabel();
        lbl_genre1 = new javax.swing.JLabel();
        lbl_subject1 = new javax.swing.JLabel();
        lbl_author1 = new javax.swing.JLabel();
        lbl_language1 = new javax.swing.JLabel();
        lbl_yearpublished1 = new javax.swing.JLabel();
        lbl_publisher1 = new javax.swing.JLabel();
        copiesAvailable = new javax.swing.JPanel();
        lbl_availableCopies = new javax.swing.JLabel();
        noOfCopies = new javax.swing.JPanel();
        lbl_noOfCopies = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_addBook = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        tf_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_books = new javax.swing.JTable();
        catBooks = new javax.swing.JComboBox<>();
        sidepanel = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        books = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        return_books = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        issuebooks = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        export = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        wholebody.setBackground(new java.awt.Color(255, 255, 255));
        wholebody.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        wholebody.setFocusable(false);
        wholebody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exportPanel.setBackground(new java.awt.Color(255, 255, 255));
        exportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_export.setBackground(new java.awt.Color(58, 120, 241));
        btn_export.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_export.setForeground(new java.awt.Color(255, 255, 255));
        btn_export.setText("Export to excel");
        btn_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportActionPerformed(evt);
            }
        });
        exportPanel.add(btn_export, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 640, 140, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(dm);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 860, 450));

        exportPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 920, 530));

        cb_log.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students", "Guests" }));
        cb_log.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_logItemStateChanged(evt);
            }
        });
        exportPanel.add(cb_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 140, 30));

        btn_clear.setBackground(new java.awt.Color(58, 120, 241));
        btn_clear.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear all");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        exportPanel.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 150, 50));

        body.add(exportPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 740));

        addbooks.setBackground(new java.awt.Color(255, 248, 194));
        addbooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Add new books");
        addbooks.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 50, -1, -1));

        jPanel7.setBackground(new java.awt.Color(240, 227, 176));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(58, 120, 241))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_booktitle1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel7.add(tf_booktitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 450, 31));

        lbl_booktitle1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_booktitle1.setText("Book Title");
        jPanel7.add(lbl_booktitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        tf_author1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel7.add(tf_author1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 31));

        lbl_author2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_author2.setText("Author");
        jPanel7.add(lbl_author2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbl_genre2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_genre2.setText("Genre");
        lbl_genre2.setToolTipText("");
        jPanel7.add(lbl_genre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        cb_genre1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        cb_genre1.setMaximumRowCount(11);
        cb_genre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Science Fiction", "Fantasy", "Educational", "Others" }));
        jPanel7.add(cb_genre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 220, 33));

        lbl_attachedFilename1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel7.add(lbl_attachedFilename1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, -1, -1));

        tf_isbn1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel7.add(tf_isbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 450, 31));

        lbl_isbnserial1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_isbnserial1.setText("ISBN/Serial Number");
        jPanel7.add(lbl_isbnserial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lbl_language2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_language2.setText("Language");
        jPanel7.add(lbl_language2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        tf_language1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel7.add(tf_language1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 220, 31));

        lbl_category2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_category2.setText("Subject");
        lbl_category2.setToolTipText("");
        jPanel7.add(lbl_category2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        cb_category1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        cb_category1.setMaximumRowCount(11);
        cb_category1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Works", "Philosophy", "Religion", "Social Science", "Language", "Natural Science", "Applied Science", "Arts and Recreation", "Literature", "Geography and History", "Biography", "Others" }));
        jPanel7.add(cb_category1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, 33));

        tf_yrPublished1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel7.add(tf_yrPublished1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 31));

        lbl_yrPublished1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_yrPublished1.setText("Year Published");
        jPanel7.add(lbl_yrPublished1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        tf_publisher1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel7.add(tf_publisher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 220, 31));

        lbl_author6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_author6.setText("Publisher");
        jPanel7.add(lbl_author6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        tf_noOfCopies1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        tf_noOfCopies1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_noOfCopies1KeyPressed(evt);
            }
        });
        jPanel7.add(tf_noOfCopies1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 220, 31));

        lbl_noOfCopies2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_noOfCopies2.setText("No. of Copies");
        jPanel7.add(lbl_noOfCopies2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lbl_copiesWarning1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        lbl_copiesWarning1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel7.add(lbl_copiesWarning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        addbooks.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 110, 512, 450));

        btn_registerbook.setBackground(new java.awt.Color(255, 188, 73));
        btn_registerbook.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        btn_registerbook.setForeground(new java.awt.Color(255, 255, 255));
        btn_registerbook.setText("Register Book");
        btn_registerbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerbookActionPerformed(evt);
            }
        });
        addbooks.add(btn_registerbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 578, -1, 43));

        btn_exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button.png"))); // NOI18N
        btn_exit1.setBorder(null);
        btn_exit1.setBorderPainted(false);
        btn_exit1.setContentAreaFilled(false);
        btn_exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exit1MouseExited(evt);
            }
        });
        btn_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit1ActionPerformed(evt);
            }
        });
        addbooks.add(btn_exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        body.add(addbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 600, 640));

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total_books1.setBackground(new java.awt.Color(255, 255, 255));
        total_books1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total no. of Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N

        lbl_totalBooks1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_totalBooks1.setForeground(new java.awt.Color(128, 128, 128));
        lbl_totalBooks1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout total_books1Layout = new javax.swing.GroupLayout(total_books1);
        total_books1.setLayout(total_books1Layout);
        total_books1Layout.setHorizontalGroup(
            total_books1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_books1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_totalBooks1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        total_books1Layout.setVerticalGroup(
            total_books1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_books1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_totalBooks1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(total_books1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 90));

        total_books2.setBackground(new java.awt.Color(255, 255, 255));
        total_books2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Books Borrowed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N

        lbl_booksBorrowed1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_booksBorrowed1.setForeground(new java.awt.Color(128, 128, 128));
        lbl_booksBorrowed1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout total_books2Layout = new javax.swing.GroupLayout(total_books2);
        total_books2.setLayout(total_books2Layout);
        total_books2Layout.setHorizontalGroup(
            total_books2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_books2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_booksBorrowed1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        total_books2Layout.setVerticalGroup(
            total_books2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(total_books2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_booksBorrowed1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(total_books2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 160, 90));

        dashboardPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 120));
        dashboardPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 880, 10));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(58, 120, 241));
        jLabel7.setText("Dashboard");
        dashboardPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        borrow_history.setBackground(new java.awt.Color(255, 255, 255));
        borrow_history.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N

        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        borrowHistory_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        borrowHistory_table.setGridColor(new java.awt.Color(255, 255, 255));
        borrowHistory_table.setSelectionBackground(new java.awt.Color(58, 120, 241));
        borrowHistory_table.setShowHorizontalLines(false);
        borrowHistory_table.setShowVerticalLines(false);
        jScrollPane3.setViewportView(borrowHistory_table);

        javax.swing.GroupLayout borrow_historyLayout = new javax.swing.GroupLayout(borrow_history);
        borrow_history.setLayout(borrow_historyLayout);
        borrow_historyLayout.setHorizontalGroup(
            borrow_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrow_historyLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        borrow_historyLayout.setVerticalGroup(
            borrow_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrow_historyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        dashboardPanel.add(borrow_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 790, 410));

        body.add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        returnBooks.setBackground(new java.awt.Color(255, 255, 255));
        returnBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_booksBORROW.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_booksBORROW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_booksBORROWMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_booksBORROW);

        returnBooks.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 860, 480));

        btn_returnBook.setBackground(new java.awt.Color(58, 120, 241));
        btn_returnBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_returnBook.setText("Return Book");
        btn_returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnBookActionPerformed(evt);
            }
        });
        returnBooks.add(btn_returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 643, 120, 50));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(58, 120, 241));
        jLabel24.setText("Borrow History");
        returnBooks.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        borrow_search.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        borrow_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                borrow_searchKeyReleased(evt);
            }
        });
        returnBooks.add(borrow_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 420, 40));

        btn_borrowSearch.setBackground(new java.awt.Color(58, 120, 241));
        btn_borrowSearch.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrowSearch.setText("Search");
        btn_borrowSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrowSearchActionPerformed(evt);
            }
        });
        returnBooks.add(btn_borrowSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 110, 40));

        catBorrow.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        catBorrow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Not Late", "Late" }));
        catBorrow.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                catBorrowItemStateChanged(evt);
            }
        });
        returnBooks.add(catBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 130, 40));

        body.add(returnBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 740));

        issueBooks.setBackground(new java.awt.Color(255, 255, 255));
        issueBooks.setPreferredSize(new java.awt.Dimension(932, 688));
        issueBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        student2.setBackground(new java.awt.Color(255, 255, 255));
        student2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 0, 16), new java.awt.Color(58, 120, 241))); // NOI18N
        student2.setMaximumSize(new java.awt.Dimension(393, 390));
        student2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_searchISSUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchISSUEKeyReleased(evt);
            }
        });
        student2.add(tf_searchISSUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        btn_searchStudent1.setBackground(new java.awt.Color(58, 120, 241));
        btn_searchStudent1.setForeground(new java.awt.Color(255, 255, 255));
        btn_searchStudent1.setText("search");
        btn_searchStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchStudent1ActionPerformed(evt);
            }
        });
        student2.add(btn_searchStudent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 80, 30));

        table_booksISSUE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_booksISSUE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_booksISSUEMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_booksISSUE);

        student2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 380, 210));

        issueBooks.add(student2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 440, 340));

        student3.setBackground(new java.awt.Color(255, 255, 255));
        student3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 0, 16), new java.awt.Color(58, 120, 241))); // NOI18N
        student3.setMaximumSize(new java.awt.Dimension(393, 390));
        student3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookDetails_Titles6.setBackground(new java.awt.Color(255, 255, 255));

        lbl_bookTitle3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_bookTitle3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bookTitle3.setToolTipText("");

        lbl_ISBN3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_ISBN3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_genre3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_genre3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_subject3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_subject3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_author4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_author4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_language3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_language3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_yearpublished3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_yearpublished3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_publisher3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_publisher3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout bookDetails_Titles6Layout = new javax.swing.GroupLayout(bookDetails_Titles6);
        bookDetails_Titles6.setLayout(bookDetails_Titles6Layout);
        bookDetails_Titles6Layout.setHorizontalGroup(
            bookDetails_Titles6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bookDetails_Titles6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_yearpublished3)
                    .addComponent(lbl_publisher3)
                    .addComponent(lbl_author4)
                    .addComponent(lbl_language3)
                    .addComponent(lbl_genre3)
                    .addComponent(lbl_subject3)
                    .addComponent(lbl_ISBN3)
                    .addComponent(lbl_bookTitle3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookDetails_Titles6Layout.setVerticalGroup(
            bookDetails_Titles6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_bookTitle3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ISBN3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_subject3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_genre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_language3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_author4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_publisher3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_yearpublished3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        student3.add(bookDetails_Titles6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 229));

        bookDetails_Titles7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(128, 128, 128));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Book Title:");

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(128, 128, 128));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("ISBN:");

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(128, 128, 128));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Genre:");

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(128, 128, 128));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Subject:");

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(128, 128, 128));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Author:");

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(128, 128, 128));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Language:");

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(128, 128, 128));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Year Published:");

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(128, 128, 128));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Publisher:");

        javax.swing.GroupLayout bookDetails_Titles7Layout = new javax.swing.GroupLayout(bookDetails_Titles7);
        bookDetails_Titles7.setLayout(bookDetails_Titles7Layout);
        bookDetails_Titles7Layout.setHorizontalGroup(
            bookDetails_Titles7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bookDetails_Titles7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        bookDetails_Titles7Layout.setVerticalGroup(
            bookDetails_Titles7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        student3.add(bookDetails_Titles7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        issueBooks.add(student3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 440, 280));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, 30));

        btn_issueBooks.setBackground(new java.awt.Color(58, 120, 241));
        btn_issueBooks.setForeground(new java.awt.Color(255, 255, 255));
        btn_issueBooks.setText("Issue Book");
        btn_issueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issueBooksActionPerformed(evt);
            }
        });
        jPanel2.add(btn_issueBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, 40));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setText("Due date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("Issue date");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel2.add(issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 30));

        issueBooks.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, 220));

        student4.setBackground(new java.awt.Color(255, 255, 255));
        student4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N
        student4.setMaximumSize(new java.awt.Dimension(393, 390));
        student4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookDetails_Titles8.setBackground(new java.awt.Color(255, 255, 255));

        lbl_bookTitle4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_bookTitle4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bookTitle4.setToolTipText("");

        lbl_ISBN4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_ISBN4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_genre4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_genre4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_subject4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_subject4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_author5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_author5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_language4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_language4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_yearpublished4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_yearpublished4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_publisher4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_publisher4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout bookDetails_Titles8Layout = new javax.swing.GroupLayout(bookDetails_Titles8);
        bookDetails_Titles8.setLayout(bookDetails_Titles8Layout);
        bookDetails_Titles8Layout.setHorizontalGroup(
            bookDetails_Titles8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bookDetails_Titles8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_yearpublished4)
                    .addComponent(lbl_publisher4)
                    .addComponent(lbl_author5)
                    .addComponent(lbl_language4)
                    .addComponent(lbl_genre4)
                    .addComponent(lbl_subject4)
                    .addComponent(lbl_ISBN4)
                    .addComponent(lbl_bookTitle4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookDetails_Titles8Layout.setVerticalGroup(
            bookDetails_Titles8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_bookTitle4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ISBN4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_subject4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_genre4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_language4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_author5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_publisher4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_yearpublished4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        student4.add(bookDetails_Titles8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 229));

        bookDetails_Titles9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(128, 128, 128));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Book Title:");

        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(128, 128, 128));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("ISBN:");

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(128, 128, 128));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Genre:");

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(128, 128, 128));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Subject:");

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(128, 128, 128));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Author:");

        jLabel43.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(128, 128, 128));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("Language:");

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(128, 128, 128));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Year Published:");

        jLabel45.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(128, 128, 128));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("Publisher:");

        javax.swing.GroupLayout bookDetails_Titles9Layout = new javax.swing.GroupLayout(bookDetails_Titles9);
        bookDetails_Titles9.setLayout(bookDetails_Titles9Layout);
        bookDetails_Titles9Layout.setHorizontalGroup(
            bookDetails_Titles9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bookDetails_Titles9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        bookDetails_Titles9Layout.setVerticalGroup(
            bookDetails_Titles9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        student4.add(bookDetails_Titles9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        issueBooks.add(student4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 440, 280));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrower Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 0, 16), new java.awt.Color(58, 120, 241))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(128, 128, 128));
        jLabel10.setText("Full Name");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        FULL_NAME.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(FULL_NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 320, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(128, 128, 128));
        jLabel11.setText("Student ID");
        jLabel11.setToolTipText("");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        STUDENT_ID.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(STUDENT_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 30));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(128, 128, 128));
        jLabel12.setText("Course/Strand");
        jLabel12.setToolTipText("");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(128, 128, 128));
        jLabel13.setText("Year");
        jLabel13.setToolTipText("");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(128, 128, 128));
        jLabel22.setText("Section");
        jLabel22.setToolTipText("");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        COURSE_STRAND.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(COURSE_STRAND, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 320, 30));

        YEAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12", "1st year", "2nd year", "3rd year", "4th year", "5th year", "Masters", "Doctorate" }));
        jPanel4.add(YEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 30));

        SECTION.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel4.add(SECTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 30));

        issueBooks.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 420, 390));

        body.add(issueBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 990, 740));

        update.setBackground(new java.awt.Color(255, 248, 194));
        update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 120, 241), 1, true));
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Update book");
        update.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(240, 227, 176));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(58, 120, 241))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_booktitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel3.add(tf_booktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 450, 31));

        lbl_booktitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_booktitle.setText("Book Title");
        jPanel3.add(lbl_booktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        tf_author.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel3.add(tf_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 31));

        lbl_author.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_author.setText("Author");
        jPanel3.add(lbl_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbl_genre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_genre.setText("Genre");
        lbl_genre.setToolTipText("");
        jPanel3.add(lbl_genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        cb_genre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        cb_genre.setMaximumRowCount(11);
        cb_genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "Non-Fiction", "Science Fiction", "Fantasy", "Educational", "Others" }));
        jPanel3.add(cb_genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 220, 33));

        lbl_attachedFilename.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel3.add(lbl_attachedFilename, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, -1, -1));

        tf_isbn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        tf_isbn.setName(""); // NOI18N
        jPanel3.add(tf_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 450, 31));

        lbl_isbnserial.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_isbnserial.setText("ISBN/Serial Number");
        jPanel3.add(lbl_isbnserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lbl_language.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_language.setText("Language");
        jPanel3.add(lbl_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        tf_language.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel3.add(tf_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 220, 31));

        lbl_category1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_category1.setText("Subject");
        lbl_category1.setToolTipText("");
        jPanel3.add(lbl_category1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        cb_category.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        cb_category.setMaximumRowCount(11);
        cb_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Works", "Philosophy", "Religion", "Social Science", "Language", "Natural Science", "Applied Science", "Arts and Recreation", "Literature", "Geography and History", "Biography", "Others" }));
        jPanel3.add(cb_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, 33));

        tf_yrPublished.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel3.add(tf_yrPublished, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 31));

        lbl_yrPublished.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_yrPublished.setText("Year Published");
        jPanel3.add(lbl_yrPublished, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        tf_publisher.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jPanel3.add(tf_publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 220, 31));

        lbl_author3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_author3.setText("Publisher");
        jPanel3.add(lbl_author3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        tf_noOfCopies.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        tf_noOfCopies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_noOfCopiesKeyPressed(evt);
            }
        });
        jPanel3.add(tf_noOfCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 220, 31));

        lbl_noOfCopies1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lbl_noOfCopies1.setText("No. of Copies");
        jPanel3.add(lbl_noOfCopies1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lbl_copiesWarning.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        lbl_copiesWarning.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.add(lbl_copiesWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        update.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 512, 450));

        btn_update.setBackground(new java.awt.Color(255, 188, 73));
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        update.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 133, 45));

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
        update.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        body.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 580, 650));

        booksPANEL.setBackground(new java.awt.Color(255, 255, 255));
        booksPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        booksPANEL.add(iconIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 30, -1, -1));

        borrowed.setBackground(new java.awt.Color(255, 255, 255));
        borrowed.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrowed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N

        lbl_borrowed.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_borrowed.setForeground(new java.awt.Color(128, 128, 128));
        lbl_borrowed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout borrowedLayout = new javax.swing.GroupLayout(borrowed);
        borrowed.setLayout(borrowedLayout);
        borrowedLayout.setHorizontalGroup(
            borrowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowedLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lbl_borrowed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        borrowedLayout.setVerticalGroup(
            borrowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_borrowed, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        booksPANEL.add(borrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 120, 80));

        final_bookDetails.setBackground(new java.awt.Color(255, 255, 255));
        final_bookDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N
        final_bookDetails.setMaximumSize(new java.awt.Dimension(393, 390));
        final_bookDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookDetails_Titles2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(128, 128, 128));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Book Title:");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(128, 128, 128));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("ISBN:");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(128, 128, 128));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Genre:");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(128, 128, 128));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Subject:");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(128, 128, 128));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Author:");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(128, 128, 128));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Language:");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(128, 128, 128));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Year Published:");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(128, 128, 128));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Publisher:");

        javax.swing.GroupLayout bookDetails_Titles2Layout = new javax.swing.GroupLayout(bookDetails_Titles2);
        bookDetails_Titles2.setLayout(bookDetails_Titles2Layout);
        bookDetails_Titles2Layout.setHorizontalGroup(
            bookDetails_Titles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bookDetails_Titles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        bookDetails_Titles2Layout.setVerticalGroup(
            bookDetails_Titles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        final_bookDetails.add(bookDetails_Titles2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 58, -1, -1));

        bookDetails_Titles3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_bookTitle1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_bookTitle1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bookTitle1.setToolTipText("");

        lbl_ISBN1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_ISBN1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_genre1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_genre1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_subject1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_subject1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_author1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_author1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_language1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_language1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_yearpublished1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_yearpublished1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lbl_publisher1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_publisher1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout bookDetails_Titles3Layout = new javax.swing.GroupLayout(bookDetails_Titles3);
        bookDetails_Titles3.setLayout(bookDetails_Titles3Layout);
        bookDetails_Titles3Layout.setHorizontalGroup(
            bookDetails_Titles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bookDetails_Titles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_yearpublished1)
                    .addComponent(lbl_publisher1)
                    .addComponent(lbl_author1)
                    .addComponent(lbl_language1)
                    .addComponent(lbl_genre1)
                    .addComponent(lbl_subject1)
                    .addComponent(lbl_ISBN1)
                    .addComponent(lbl_bookTitle1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookDetails_Titles3Layout.setVerticalGroup(
            bookDetails_Titles3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetails_Titles3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_bookTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ISBN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_subject1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_genre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_language1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_author1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_publisher1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_yearpublished1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        final_bookDetails.add(bookDetails_Titles3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 58, -1, 229));

        booksPANEL.add(final_bookDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 298, 390, 390));

        copiesAvailable.setBackground(new java.awt.Color(255, 255, 255));
        copiesAvailable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Copies Available", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N

        lbl_availableCopies.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_availableCopies.setForeground(new java.awt.Color(128, 128, 128));
        lbl_availableCopies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout copiesAvailableLayout = new javax.swing.GroupLayout(copiesAvailable);
        copiesAvailable.setLayout(copiesAvailableLayout);
        copiesAvailableLayout.setHorizontalGroup(
            copiesAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, copiesAvailableLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lbl_availableCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        copiesAvailableLayout.setVerticalGroup(
            copiesAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(copiesAvailableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_availableCopies, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        booksPANEL.add(copiesAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, 80));

        noOfCopies.setBackground(new java.awt.Color(255, 255, 255));
        noOfCopies.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "No. of Copies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(58, 120, 241))); // NOI18N

        lbl_noOfCopies.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lbl_noOfCopies.setForeground(new java.awt.Color(128, 128, 128));
        lbl_noOfCopies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout noOfCopiesLayout = new javax.swing.GroupLayout(noOfCopies);
        noOfCopies.setLayout(noOfCopiesLayout);
        noOfCopiesLayout.setHorizontalGroup(
            noOfCopiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noOfCopiesLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lbl_noOfCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        noOfCopiesLayout.setVerticalGroup(
            noOfCopiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfCopiesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_noOfCopies, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        booksPANEL.add(noOfCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 80));

        btn_delete.setBackground(new java.awt.Color(58, 120, 241));
        btn_delete.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.setBorderPainted(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        booksPANEL.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 70, 40));

        btn_addBook.setBackground(new java.awt.Color(58, 120, 241));
        btn_addBook.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_addBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_addBook.setText("Add new book");
        btn_addBook.setBorderPainted(false);
        btn_addBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBookActionPerformed(evt);
            }
        });
        booksPANEL.add(btn_addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 640, -1, 40));

        btn_refresh.setBackground(new java.awt.Color(58, 120, 241));
        btn_refresh.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.setBorderPainted(false);
        btn_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        booksPANEL.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 80, 40));

        btn_edit.setBackground(new java.awt.Color(58, 120, 241));
        btn_edit.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.setBorderPainted(false);
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        booksPANEL.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 70, 40));

        tf_search.setName(""); // NOI18N
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });
        booksPANEL.add(tf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 240, 30));

        btn_search.setBackground(new java.awt.Color(58, 120, 241));
        btn_search.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        booksPANEL.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 80, 30));

        table_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_books.setGridColor(new java.awt.Color(255, 255, 255));
        table_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_booksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_books);

        booksPANEL.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 470));

        catBooks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "General Works", "Philosophy", "Religion", "Social Science", "Language", "Natural Science", "Applied Science", "Arts and Recreation", "Literature", "Geography and History", "Biography", "Others", "Fiction", "Non-Fiction", "Science Fiction", "Fantasy", "Educational" }));
        catBooks.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                catBooksItemStateChanged(evt);
            }
        });
        booksPANEL.add(catBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 110, 30));

        body.add(booksPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 973, 735));

        wholebody.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        sidepanel.setBackground(new java.awt.Color(255, 248, 194));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBackground(new java.awt.Color(255, 248, 194));
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidePanelClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 120, 241));
        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        sidepanel.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 50));

        books.setBackground(new java.awt.Color(255, 248, 194));
        books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidePanelClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 120, 241));
        jLabel3.setText("Books");

        javax.swing.GroupLayout booksLayout = new javax.swing.GroupLayout(books);
        books.setLayout(booksLayout);
        booksLayout.setHorizontalGroup(
            booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        booksLayout.setVerticalGroup(
            booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepanel.add(books, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 50));

        return_books.setBackground(new java.awt.Color(255, 248, 194));
        return_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidePanelClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 120, 241));
        jLabel4.setText("Return Books");

        javax.swing.GroupLayout return_booksLayout = new javax.swing.GroupLayout(return_books);
        return_books.setLayout(return_booksLayout);
        return_booksLayout.setHorizontalGroup(
            return_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(return_booksLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        return_booksLayout.setVerticalGroup(
            return_booksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(return_booksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepanel.add(return_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 270, 50));

        issuebooks.setBackground(new java.awt.Color(255, 248, 194));
        issuebooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidePanelClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(58, 120, 241));
        jLabel5.setText("Issue Books");

        javax.swing.GroupLayout issuebooksLayout = new javax.swing.GroupLayout(issuebooks);
        issuebooks.setLayout(issuebooksLayout);
        issuebooksLayout.setHorizontalGroup(
            issuebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issuebooksLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel5)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        issuebooksLayout.setVerticalGroup(
            issuebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issuebooksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepanel.add(issuebooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 270, 50));

        logout.setBackground(new java.awt.Color(255, 248, 194));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(58, 120, 241));
        jLabel6.setText("Logout ");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel6)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepanel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 270, 50));

        jPanel5.setBackground(new java.awt.Color(255, 248, 194));

        jLabel23.setBackground(new java.awt.Color(255, 248, 194));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library-icon (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 170, 160));

        export.setBackground(new java.awt.Color(255, 248, 194));
        export.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidePanelClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(58, 120, 241));
        jLabel26.setText("Login History");

        javax.swing.GroupLayout exportLayout = new javax.swing.GroupLayout(export);
        export.setLayout(exportLayout);
        exportLayout.setHorizontalGroup(
            exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel26)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        exportLayout.setVerticalGroup(
            exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepanel.add(export, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 270, 50));

        wholebody.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wholebody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wholebody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayTable() {
        try {
            String sql = "SELECT `ISBN`, `BOOK_TITLE`, `BOOK_AUTHOR`, `CATEGORY` FROM `register_books`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_books.setModel(DbUtils.resultSetToTableModel(rs));
            table_booksISSUE.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.print("Disop");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void DisplayTableIssue() {
        try {
            String sql = "SELECT `ISBN`, `BOOK_TITLE`, `BOOK_AUTHOR`, `CATEGORY` FROM `register_books`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_booksISSUE.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void DisplayTableBorrow() {
        try {
            String sql = "SELECT `ISSUED_ID`, `ISBN`, `BOOK_TITLE`, `FULL_NAME`, `ISSUED_DATE`, `DUE_DATE`, `STATUS` FROM `issue_books`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_booksBORROW.setModel(DbUtils.resultSetToTableModel(rs));
            borrowHistory_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void DisplayTableDashboard() {
        try {
            String sql = "SELECT `ISSUED_ID`, `ISBN`, `BOOK_TITLE`, `FULL_NAME`, `ISSUED_DATE`, `DUE_DATE`, `STATUS` FROM `issue_books`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            borrowHistory_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void LateChecker(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dateobj = new java.util.Date();
        System.out.println(df.format(dateobj));
        try{
                String datee, issueID = "";
                String quer = "SELECT * FROM `issue_books`";
                
                Statement st = conn.createStatement();
                rs = st.executeQuery(quer);
                
                while (rs.next()) {
                    datee = rs.getString(7);
                    issueID = rs.getString(11);
                    String late = "Late";
                    String notlate = "Not late";
                    System.out.println(datee + "\nIss" + issueID);
                    System.out.println("compare" + df.format(dateobj).compareTo(datee));
                    if(df.format(dateobj).compareTo(datee) > 0 ){
                       String updateQuery = "UPDATE issue_books SET STATUS='" + late + "' WHERE ISSUED_ID=" + issueID;
                       Statement stt = conn.createStatement();
                       System.out.println("late");
                       stt.execute(updateQuery);
                    } else if(df.format(dateobj).compareTo(datee) < 0){
                        System.out.println("not late");
                        String updateQuery = "UPDATE issue_books SET STATUS='" + notlate + "' WHERE ISSUED_ID=" + issueID;
                       Statement stt = conn.createStatement();
                       stt.execute(updateQuery);
                    } 
   
                }
                
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    
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
                tf_noOfCopies.setEditable(true);
                lbl_copiesWarning.setText("");
    }

    private void resetLabelsAdd(){
                cb_category1.setSelectedItem("General Works");
                tf_booktitle1.setText("");
                tf_author1.setText("");
                tf_isbn1.setText("");
                tf_publisher1.setText("");
                cb_genre1.setSelectedItem("Fiction");
                tf_yrPublished1.setText("");
                tf_language1.setText("");
                tf_noOfCopies1.setText("");
                tf_noOfCopies1.setEditable(true);
                lbl_copiesWarning1.setText("");
    }
    
    private void resetLabelsBooks(){
        lbl_bookTitle1.setText("");
        lbl_author1.setText("");
        lbl_subject1.setText("");
        lbl_ISBN1.setText("");
        lbl_publisher1.setText("");
        lbl_genre1.setText("");
        lbl_yearpublished1.setText("");
        lbl_language1.setText("");
        lbl_noOfCopies.setText("");
        lbl_availableCopies.setText("");
        lbl_borrowed.setText("");
    }
    
    private void resetLabelsIssue(){
        FULL_NAME.setText("");
        COURSE_STRAND.setText("");
        SECTION.setText("");
        YEAR.setSelectedItem("Grade 7");
        STUDENT_ID.setText("");
        lbl_author4.setText("");
        lbl_bookTitle3.setText("");
        lbl_subject3.setText("");
        lbl_ISBN3.setText("");
        lbl_publisher3.setText("");
        lbl_genre3.setText("");
        lbl_yearpublished3.setText("");
        lbl_language3.setText("");
        ((JTextField)dueDate.getDateEditor().getUiComponent()).setText("");
    }
    
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            if (clickedItem != "") {
                String query = "DELETE FROM `register_books` WHERE `ISBN`=" + clickedItem;
                pst = conn.prepareStatement(query);
                pst.executeUpdate();
                btn_delete.setEnabled(false);
                btn_edit.setEnabled(false);
                resetLabelsBooks();
                clickedItem = "";
                DisplayTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBookActionPerformed
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        clickedItem = "";
        resetLabelsBooks();
        addbooks.setVisible(true);
    }//GEN-LAST:event_btn_addBookActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        DisplayTable();
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        lbl_bookTitle1.setText("");
        lbl_author1.setText("");
        lbl_subject1.setText("");
        lbl_ISBN1.setText("");
        lbl_publisher1.setText("");
        lbl_genre1.setText("");
        lbl_yearpublished1.setText("");
        lbl_language1.setText("");
        lbl_noOfCopies.setText("");
        lbl_availableCopies.setText("");
        lbl_borrowed.setText("");
    }//GEN-LAST:event_btn_refreshActionPerformed
       
    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        btn_edit.setVisible(false);
        btn_delete.setVisible(false);
        tf_search.setVisible(false);
        update.setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button-hover.png")));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button.png")));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        btn_edit.setVisible(true);
        btn_delete.setVisible(true);
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        tf_search.setVisible(true);
        update.setVisible(false);
        clickedItem = "";
        resetLabelsBooks();
        DisplayTable();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void checking(){
        try{
            String queryOne = "SELECT `ISBN` FROM `register_books`";
                Statement st = conn.createStatement();
                rs = st.executeQuery(queryOne);
                // LOOP THROUGH ALL BOOK_ID ENTRIES FROM REGISTER_BOOKS
                while (rs.next()) {
                    String isbn = rs.getString("ISBN");
                    if(tf_isbn.getText().equals(isbn)){
                        if(clickedItem.equals(isbn)){
                            //
                        }else{
                            JOptionPane.showMessageDialog(null, "There's already a book with the same ISBN");  
                        }
                    }
                }
        }catch(Exception e){
            
        }
    }
    
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            int num = Integer.parseInt(tf_noOfCopies.getText());
            if (clickedItem == "" || cb_genre.getSelectedItem().toString() == null || tf_booktitle.getText() == null || tf_author.getText() == null || tf_isbn.getText() == null || tf_publisher.getText() == null || tf_yrPublished.getText() == null || tf_language.getText() == null || tf_noOfCopies.getText() == null) {
                JOptionPane.showMessageDialog(null, "Some fields are empty!");
            } else {
                checking();          
                String query = "UPDATE `register_books` SET `BOOK_TITLE`='" + tf_booktitle.getText()
                        + "',`BOOK_AUTHOR`='" + tf_author.getText()
                        + "',`CATEGORY`='" + cb_category.getSelectedItem().toString()
                        + "',`ISBN`='" + tf_isbn.getText()
                        + "',`PUBLISHER`='" + tf_publisher.getText()
                        + "',`GENRE`='" + cb_genre.getSelectedItem().toString()
                        + "',`YEAR_PUBLISHED`='" + tf_yrPublished.getText()
                        + "',`LANGUAGE`='" + tf_language.getText()
                        + "',`COPIES`=" + tf_noOfCopies.getText()
                        + " WHERE `ISBN`=" + clickedItem;
                Statement st = conn.createStatement();
                st.execute(query);

                JOptionPane.showMessageDialog(null, "Book successfully updated!");
                resetLabels();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please check entered data again");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

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

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       Search(table_books, tf_search);   
    }//GEN-LAST:event_btn_searchActionPerformed

    private void table_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_booksMouseClicked
        try {
            btn_edit.setEnabled(true);
            btn_delete.setEnabled(true);
            clickedItem = table_books.getValueAt(table_books.getSelectedRow(), 0).toString();
           
            String queryTwo = "SELECT * FROM `register_books` WHERE `ISBN`=" + clickedItem;
            Statement st = conn.createStatement();
            rs = st.executeQuery(queryTwo);
            if (rs.next()) {
                lbl_bookTitle1.setText(rs.getString(2));
                lbl_author1.setText(rs.getString(3));
                lbl_subject1.setText(rs.getString(4));
                lbl_ISBN1.setText(rs.getString(1));
                lbl_publisher1.setText(rs.getString(5));
                lbl_genre1.setText(rs.getString(6));
                lbl_yearpublished1.setText(rs.getString(7));
                lbl_language1.setText(rs.getString(8));
                lbl_noOfCopies.setText(rs.getString(9));
                lbl_availableCopies.setText(rs.getString(10));
                lbl_borrowed.setText(rs.getString(11));
                
                tf_isbn.setText(rs.getString(1));
                tf_booktitle.setText(rs.getString(2));
                tf_author.setText(rs.getString(3));
                cb_category.setSelectedItem(rs.getString(4));
                tf_publisher.setText(rs.getString(5));
                cb_genre.setSelectedItem(rs.getString(6));
                tf_yrPublished.setText(rs.getString(7));
                tf_language.setText(rs.getString(8));
                tf_noOfCopies.setText(rs.getString(9));
            }
            rs.close();
            st.close();

            System.out.println(clickedItem);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_table_booksMouseClicked

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        Search(table_books, tf_search);   
    }//GEN-LAST:event_tf_searchKeyReleased

    private void tf_searchISSUEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchISSUEKeyReleased
        Search(table_booksISSUE, tf_searchISSUE);   
    }//GEN-LAST:event_tf_searchISSUEKeyReleased

    private void table_booksISSUEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_booksISSUEMouseClicked
        try {
            clickedItem = table_booksISSUE.getValueAt(table_booksISSUE.getSelectedRow(), 0).toString();
           
            String queryTwo = "SELECT * FROM `register_books` WHERE `ISBN`=" + clickedItem;
            Statement st = conn.createStatement();
            rs = st.executeQuery(queryTwo);
            if (rs.next()) {
                lbl_bookTitle3.setText(rs.getString(2));
                lbl_author4.setText(rs.getString(3));
                lbl_subject3.setText(rs.getString(4));
                lbl_ISBN3.setText(rs.getString(1));
                lbl_publisher3.setText(rs.getString(5));
                lbl_genre3.setText(rs.getString(6));
                lbl_yearpublished3.setText(rs.getString(7));
                lbl_language3.setText(rs.getString(8));
                
                available = Integer.parseInt(rs.getString(10));
                borrowed2 = Integer.parseInt(rs.getString(11));
            }
            rs.close();
            st.close();

            System.out.println(clickedItem);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_table_booksISSUEMouseClicked

    private void mouseexited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseexited
        Object item = evt.getSource();
        if (item == books) {
            books.setBackground(new Color(255, 248, 194));
        } else if (item == dashboard) {
            dashboard.setBackground(new Color(255, 248, 194));
        } else if (item == issuebooks) {
            issuebooks.setBackground(new Color(255, 248, 194));
        } else if (item == return_books) {
            return_books.setBackground(new Color(255, 248, 194));
        } else if (item == logout) {
            logout.setBackground(new Color(255, 248, 194));
        } else if (item == export){
            export.setBackground(new Color(255, 248, 194));
        }
    }//GEN-LAST:event_mouseexited

    private void mouseentered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseentered
        Object item = evt.getSource();
        if (item == books) {
            books.setBackground(new Color(240, 221, 160));
        } else if (item == dashboard) {
            dashboard.setBackground(new Color(240, 221, 160));
        } else if (item == issuebooks) {
            issuebooks.setBackground(new Color(240, 221, 160));
        } else if (item == return_books) {
            return_books.setBackground(new Color(240, 221, 160));
        } else if (item == logout) {
            logout.setBackground(new Color(240, 221, 160));
        } else if(item == export){
            export.setBackground(new Color(240, 221, 160));
        }
    }//GEN-LAST:event_mouseentered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        LandingPage land = new LandingPage();
        land.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void sidePanelClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidePanelClick
    Object item = evt.getSource();
        if (item == books) {
            booksPANEL.setVisible(true);
            issueBooks.setVisible(false);
            dashboardPanel.setVisible(false);
            returnBooks.setVisible(false);
            btn_edit.setEnabled(false);
            btn_delete.setEnabled(false);
            exportPanel.setVisible(false);
            DisplayTable();
            resetLabelsBooks();
        } else if (item == dashboard) {
            dashboardPanel.setVisible(true);
            booksPANEL.setVisible(false);
            issueBooks.setVisible(false);
            returnBooks.setVisible(false);
            exportPanel.setVisible(false);
            LateChecker();
            DisplayTableDashboard();
            getTotalNumberOfBooks();
            getTotalNumberOfBooksBorrowed();
        } else if (item == issuebooks) {
            booksPANEL.setVisible(false);
            issueBooks.setVisible(true);
            dashboardPanel.setVisible(false);
            returnBooks.setVisible(false);
            exportPanel.setVisible(false);
            DisplayTableIssue();
        } else if (item == return_books) {
           btn_returnBook.setEnabled(false);
           booksPANEL.setVisible(false);
           issueBooks.setVisible(false);
           dashboardPanel.setVisible(false);
           returnBooks.setVisible(true);
           exportPanel.setVisible(false);
           LateChecker();
           DisplayTableBorrow();
        } else if (item == logout) {
           LandingPage land = new LandingPage();
           land.setVisible(true);
           wholebody.setVisible(false);
           
        } else if (item == export){
           btn_returnBook.setEnabled(false);
           booksPANEL.setVisible(false);
           issueBooks.setVisible(false);
           dashboardPanel.setVisible(false);
           returnBooks.setVisible(false);
           exportPanel.setVisible(true);
           
           DisplayHistory();
        }
    }//GEN-LAST:event_sidePanelClick

    private void btn_issueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issueBooksActionPerformed
         try{
            if(FULL_NAME.getText().trim().isEmpty() || COURSE_STRAND.getText().trim().isEmpty() || SECTION.getText().trim().isEmpty() || STUDENT_ID.getText().trim().isEmpty() || issueDate.getDate().equals(null) || dueDate.getDate().equals(null)){
                JOptionPane.showMessageDialog(null,"Some fields are empty");
            } else {
                if(available <= 0){
                    JOptionPane.showMessageDialog(null,"No available copies");
                } else {    
                    clickedItem = table_booksISSUE.getValueAt(table_booksISSUE.getSelectedRow(), 0).toString();
                    clickedItemTitle = table_booksISSUE.getValueAt(table_booksISSUE.getSelectedRow(), 1).toString();
                    java.util.Date date = issueDate.getDate();
                    java.util.Date duedate = dueDate.getDate();

                    java.sql.Date issDate = new java.sql.Date(date.getTime());
                    java.sql.Date dueDate = new java.sql.Date(duedate.getTime());

                    String queryTwo = "INSERT INTO `issue_books`(FULL_NAME, COURSE, SECTION, YEAR, STUDENT_ID, ISSUED_DATE, DUE_DATE, ISBN, BOOK_TITLE, STATUS) VALUES (?,?,?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(queryTwo); 

                    pst.setString(1, FULL_NAME.getText());
                    pst.setString(2, COURSE_STRAND.getText());
                    pst.setString(3, SECTION.getText());
                    pst.setString(4, YEAR.getSelectedItem().toString());
                    pst.setString(5, STUDENT_ID.getText());
                    pst.setDate(6, issDate);
                    pst.setDate(7, dueDate);
                    pst.setString(8, clickedItem);
                    pst.setString(9, clickedItemTitle);
                    pst.setString(10, "Not late");
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Books successfully issued!");

                    String updateQuery = "UPDATE register_books SET AVAILABLE='" + ("" + (available - 1)) + "', BORROWED=" + ("" + (borrowed2 + 1)) +  " WHERE ISBN=" + clickedItem;
                    Statement st = conn.createStatement();
                    st.execute(updateQuery);
                    resetLabelsIssue();
                    ((JTextField)issueDate.getDateEditor().getUiComponent()).setText("");
                    
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_issueBooksActionPerformed

    private void table_booksBORROWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_booksBORROWMouseClicked
        btn_returnBook.setEnabled(true);
    }//GEN-LAST:event_table_booksBORROWMouseClicked

    private void btn_returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnBookActionPerformed
        try{
            clickedItem = table_booksBORROW.getValueAt(table_booksBORROW.getSelectedRow(), 1).toString();
            clickedID = table_booksBORROW.getValueAt(table_booksBORROW.getSelectedRow(), 0).toString();
            String query = "DELETE FROM `issue_books` WHERE `ISSUED_ID`=" + clickedID;
            pst = conn.prepareStatement(query);
            pst.executeUpdate();

            String queryTwo = "SELECT * FROM `register_books` WHERE `ISBN`=" + clickedItem;
            Statement st = conn.createStatement();
            rs = st.executeQuery(queryTwo);
            if (rs.next()) {                
                available = Integer.parseInt(rs.getString(10));
                borrowed2 = Integer.parseInt(rs.getString(11));
            }
            
            String updateQuery = "UPDATE register_books SET AVAILABLE='" + ("" + (available + 1)) + "', BORROWED=" + ("" + (borrowed2 - 1)) +  " WHERE ISBN=" + clickedItem;
            st.execute(updateQuery);
            
            
            JOptionPane.showMessageDialog(null,"Successfully returned!");
            btn_returnBook.setEnabled(false);
            DisplayTableBorrow();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_returnBookActionPerformed

    private void catBorrowItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_catBorrowItemStateChanged
        try{
            if(catBorrow.getSelectedItem().toString().equals("All")){
                DisplayTableBorrow();
            }else{
                String sql = "SELECT `ISSUED_ID`, `ISBN`, `BOOK_TITLE`, `FULL_NAME`, `ISSUED_DATE`, `DUE_DATE`, `STATUS` FROM `issue_books` WHERE STATUS='" + catBorrow.getSelectedItem().toString() + "'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table_booksBORROW.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_catBorrowItemStateChanged

    private void catBooksItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_catBooksItemStateChanged
        try{
            if(catBooks.getSelectedItem().toString() == "All"){
                DisplayTable();
            }else{
                String sql ="SELECT `ISBN`, `BOOK_TITLE`, `BOOK_AUTHOR`, `CATEGORY` from register_books WHERE CATEGORY like '%" + catBooks.getSelectedItem().toString() + "%'" + " OR `GENRE` like '%" + catBooks.getSelectedItem().toString() + "%'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                table_books.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_catBooksItemStateChanged

    private void tf_noOfCopies1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_noOfCopies1KeyPressed
        String value = tf_noOfCopies1.getText();
        int l = value.length();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            tf_noOfCopies1.setEditable(true);
            lbl_copiesWarning1.setText("");
        } else {
            tf_noOfCopies1.setEditable(false);
            lbl_copiesWarning1.setText("Enter only numbers");
        }
    }//GEN-LAST:event_tf_noOfCopies1KeyPressed

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
                pst.setString(1, tf_isbn1.getText());
                pst.setString(2, tf_booktitle1.getText());
                pst.setString(3, tf_author1.getText());
                pst.setString(4, cb_category1.getSelectedItem().toString());
                pst.setString(5, tf_publisher1.getText());
                pst.setString(6, cb_genre1.getSelectedItem().toString());
                pst.setString(7, tf_yrPublished1.getText());
                pst.setString(8, tf_language1.getText());
                pst.setString(9, tf_noOfCopies1.getText());
                pst.setString(10, tf_noOfCopies1.getText());
                pst.setString(11, "0");
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Book successfully registered!");

                resetLabelsAdd();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please check entered data again");
        }
    }//GEN-LAST:event_btn_registerbookActionPerformed

    private void btn_exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exit1MouseEntered
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button-hover.png")));
    }//GEN-LAST:event_btn_exit1MouseEntered

    private void btn_exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exit1MouseExited
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove-button.png")));
    }//GEN-LAST:event_btn_exit1MouseExited

    private void btn_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit1ActionPerformed
            addbooks.setVisible(false);
            DisplayTable();
    }//GEN-LAST:event_btn_exit1ActionPerformed

    private void borrow_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_borrow_searchKeyReleased
        Search(table_booksBORROW, borrow_search);   
    }//GEN-LAST:event_borrow_searchKeyReleased

    private void btn_borrowSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrowSearchActionPerformed
        Search(table_booksBORROW, borrow_search);
    }//GEN-LAST:event_btn_borrowSearchActionPerformed

    private void btn_searchStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchStudent1ActionPerformed
        Search(table_booksISSUE, tf_searchISSUE);   
    }//GEN-LAST:event_btn_searchStudent1ActionPerformed

    private void btn_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportActionPerformed
        if(dm.getRowCount() <= 0){
            JOptionPane.showMessageDialog(null, "Nothing to export");
        } else {
            JFileChooser fs = new JFileChooser(new File(""));
            fs.setDialogTitle("Save a file");
            int result = fs.showSaveDialog(null);

            if(result == JFileChooser.APPROVE_OPTION){
                File fi = fs.getSelectedFile();
                try{
                    FileWriter fw = new FileWriter(fi.getPath());
                    loc = "" + fi.getPath();
                    fw.flush();
                    fw.close();
                }catch(Exception e){

                }
            }
            if(cb_log.getSelectedItem().toString() == "Students"){
                    writetoExcel();
            }else if(cb_log.getSelectedItem().toString() == "Guests"){
                    writetoExcelTwo();
            }
        }
    }//GEN-LAST:event_btn_exportActionPerformed

    private void cb_logItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_logItemStateChanged
        try{
            String sql = "";
            if(cb_log.getSelectedItem().toString() == "Students"){
                 sql = "SELECT * FROM `librarycard`";
            }else if(cb_log.getSelectedItem().toString() == "Guests"){
                 sql = "SELECT * FROM `guest`";
            }
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            dm.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cb_logItemStateChanged

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        try {
            String query = "";
            if (cb_log.getSelectedItem().toString() == "Students") {
                query = "DELETE FROM `librarycard`";
            } else if(cb_log.getSelectedItem().toString() == "Guests"){
                query = "DELETE FROM `guest`";
            }
            
            pst = conn.prepareStatement(query);
            pst.executeUpdate();
            
            String sql = "";
            if(cb_log.getSelectedItem().toString() == "Students"){
                 sql = "SELECT `STUDENT_NAME`, `SCHOOL_ID`, `YEAR_AND_COURSE`, `PURPOSE` FROM `librarycard`";
            }else if(cb_log.getSelectedItem().toString() == "Guests"){
                 sql = "SELECT `GUEST_NAME`, `AGE`, `SCHOOL`, `CONTACT`, `EMAIL`, `PURPOSE` FROM `guest`";
            }
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            dm.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_clearActionPerformed
    
    private void DisplayHistory() {
        try {
            String sql = "SELECT * FROM `librarycard`";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            dm.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private String getCellValue(int x, int y){
        return dm.getValueAt(x, y).toString();
    }
    
    private void writetoExcel(){
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet();
        
        //Load the data to treemap
        TreeMap<String,Object[]> data = new TreeMap<>();
        
        //Add excel column headers
        data.put("-1", new Object[]{dm.getColumnName(0), dm.getColumnName(1), dm.getColumnName(2), dm.getColumnName(3), dm.getColumnName(4), dm.getColumnName(5)});
        
        //Adding rows and cells
        for(int i = 0; i < dm.getRowCount(); i++){
            data.put(Integer.toString(i), new Object[]{getCellValue(i, 0), getCellValue(i, 1), getCellValue(i, 2), getCellValue(i, 3), getCellValue(i, 4), getCellValue(i, 5)});  
        }
        
        //Write to excel
        Set<String> ids = data.keySet();
        XSSFRow row;
        int rowID = 0;
        
        for(String key: ids){
            row = ws.createRow(rowID++);
            
            //Get data as per key
            Object[] values = data.get(key);
            int cellID = 0;
            for(Object o: values){
                Cell cell = row.createCell(cellID++);
                cell.setCellValue(o.toString());
            }
        }
        
        //Write to filesystem
        try{
            FileOutputStream fos = new FileOutputStream(new File(loc + ".xlsx"));
            wb.write(fos);
            fos.close();
            
            JOptionPane.showMessageDialog(null, "File saved!");
        }catch(Exception e){
            
        }
    }
    
    private void writetoExcelTwo(){
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet();
        
        //Load the data to treemap
        TreeMap<String,Object[]> data = new TreeMap<>();
        
        //Add excel column headers
        data.put("-1", new Object[]{dm.getColumnName(0), dm.getColumnName(1), dm.getColumnName(2), dm.getColumnName(3), dm.getColumnName(4), dm.getColumnName(5), dm.getColumnName(6), dm.getColumnName(7)});
        
        //Adding rows and cells
        for(int i = 0; i < dm.getRowCount(); i++){
            data.put(Integer.toString(i), new Object[]{getCellValue(i, 0), getCellValue(i, 1), getCellValue(i, 2), getCellValue(i, 3), getCellValue(i, 4), getCellValue(i, 5), getCellValue(i, 6), getCellValue(i, 7)});  
        }
        
        //Write to excel
        Set<String> ids = data.keySet();
        XSSFRow row;
        int rowID = 0;
        
        for(String key: ids){
            row = ws.createRow(rowID++);
            
            //Get data as per key
            Object[] values = data.get(key);
            int cellID = 0;
            for(Object o: values){
                Cell cell = row.createCell(cellID++);
                cell.setCellValue(o.toString());
            }
        }
        
        //Write to filesystem
        try{
            FileOutputStream fos = new FileOutputStream(new File(loc + ".xlsx"));
            wb.write(fos);
            fos.close();
            
            JOptionPane.showMessageDialog(null, "File saved!");
        }catch(Exception e){
            
        }
    }
    
    private void getTotalNumberOfBooks(){
        try{
            Statement s = conn.createStatement();
                ResultSet r = s.executeQuery("SELECT COUNT(*) AS rowcount FROM `register_books`");
                r.next();
                int count = r.getInt("rowcount");
                r.close();
            lbl_totalBooks1.setText("" + count);
        }catch(Exception e){
            
        }
    }
    
    private void getTotalNumberOfBooksBorrowed(){
        try{
                Statement s = conn.createStatement();
                ResultSet r = s.executeQuery("SELECT COUNT(*) AS rowcount FROM `issue_books`");
                r.next();
                int count = r.getInt("rowcount");
                r.close();
                
            lbl_booksBorrowed1.setText("" + count);
        }catch(Exception e){
            
        }
    }
    
    private void Search(JTable table, JTextField searchbar){     
        try {    
            String se = searchbar.getText();
            String sql = "SELECT `ISBN`, `BOOK_TITLE`, `BOOK_AUTHOR`, `CATEGORY` FROM register_books WHERE BOOK_TITLE LIKE '%" + se + "%' OR BOOK_AUTHOR LIKE '%" + se + "%'";
            ResultSet rs = pst.executeQuery(sql);                 
            table.setModel(DbUtils.resultSetToTableModel(rs));       
        }catch (Exception e){                                  
            JOptionPane.showMessageDialog(null, e);             
        }      
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField COURSE_STRAND;
    private javax.swing.JTextField FULL_NAME;
    private javax.swing.JTextField SECTION;
    private javax.swing.JTextField STUDENT_ID;
    private javax.swing.JComboBox<String> YEAR;
    private javax.swing.JPanel addbooks;
    private javax.swing.JPanel body;
    private javax.swing.JPanel bookDetails_Titles2;
    private javax.swing.JPanel bookDetails_Titles3;
    private javax.swing.JPanel bookDetails_Titles6;
    private javax.swing.JPanel bookDetails_Titles7;
    private javax.swing.JPanel bookDetails_Titles8;
    private javax.swing.JPanel bookDetails_Titles9;
    private javax.swing.JPanel books;
    private javax.swing.JPanel booksPANEL;
    private javax.swing.JTable borrowHistory_table;
    private javax.swing.JPanel borrow_history;
    private javax.swing.JTextField borrow_search;
    private javax.swing.JPanel borrowed;
    private javax.swing.JButton btn_addBook;
    private javax.swing.JButton btn_borrowSearch;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_exit1;
    private javax.swing.JButton btn_export;
    private javax.swing.JButton btn_issueBooks;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_registerbook;
    private javax.swing.JButton btn_returnBook;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_searchStudent1;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> catBooks;
    private javax.swing.JComboBox<String> catBorrow;
    private javax.swing.JComboBox<String> cb_category;
    private javax.swing.JComboBox<String> cb_category1;
    private javax.swing.JComboBox<String> cb_genre;
    private javax.swing.JComboBox<String> cb_genre1;
    private javax.swing.JComboBox<String> cb_log;
    private javax.swing.JPanel copiesAvailable;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JTable dm;
    private com.toedter.calendar.JDateChooser dueDate;
    private javax.swing.JPanel export;
    private javax.swing.JPanel exportPanel;
    private javax.swing.JPanel final_bookDetails;
    private javax.swing.JLabel iconIMG;
    private javax.swing.JPanel issueBooks;
    private com.toedter.calendar.JDateChooser issueDate;
    private javax.swing.JPanel issuebooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_ISBN1;
    private javax.swing.JLabel lbl_ISBN3;
    private javax.swing.JLabel lbl_ISBN4;
    private javax.swing.JLabel lbl_attachedFilename;
    private javax.swing.JLabel lbl_attachedFilename1;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_author1;
    private javax.swing.JLabel lbl_author2;
    private javax.swing.JLabel lbl_author3;
    private javax.swing.JLabel lbl_author4;
    private javax.swing.JLabel lbl_author5;
    private javax.swing.JLabel lbl_author6;
    private javax.swing.JLabel lbl_availableCopies;
    private javax.swing.JLabel lbl_bookTitle1;
    private javax.swing.JLabel lbl_bookTitle3;
    private javax.swing.JLabel lbl_bookTitle4;
    private javax.swing.JLabel lbl_booksBorrowed1;
    private javax.swing.JLabel lbl_booktitle;
    private javax.swing.JLabel lbl_booktitle1;
    private javax.swing.JLabel lbl_borrowed;
    private javax.swing.JLabel lbl_category1;
    private javax.swing.JLabel lbl_category2;
    private javax.swing.JLabel lbl_copiesWarning;
    private javax.swing.JLabel lbl_copiesWarning1;
    private javax.swing.JLabel lbl_genre;
    private javax.swing.JLabel lbl_genre1;
    private javax.swing.JLabel lbl_genre2;
    private javax.swing.JLabel lbl_genre3;
    private javax.swing.JLabel lbl_genre4;
    private javax.swing.JLabel lbl_isbnserial;
    private javax.swing.JLabel lbl_isbnserial1;
    private javax.swing.JLabel lbl_language;
    private javax.swing.JLabel lbl_language1;
    private javax.swing.JLabel lbl_language2;
    private javax.swing.JLabel lbl_language3;
    private javax.swing.JLabel lbl_language4;
    private javax.swing.JLabel lbl_noOfCopies;
    private javax.swing.JLabel lbl_noOfCopies1;
    private javax.swing.JLabel lbl_noOfCopies2;
    private javax.swing.JLabel lbl_publisher1;
    private javax.swing.JLabel lbl_publisher3;
    private javax.swing.JLabel lbl_publisher4;
    private javax.swing.JLabel lbl_subject1;
    private javax.swing.JLabel lbl_subject3;
    private javax.swing.JLabel lbl_subject4;
    private javax.swing.JLabel lbl_totalBooks1;
    private javax.swing.JLabel lbl_yearpublished1;
    private javax.swing.JLabel lbl_yearpublished3;
    private javax.swing.JLabel lbl_yearpublished4;
    private javax.swing.JLabel lbl_yrPublished;
    private javax.swing.JLabel lbl_yrPublished1;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel noOfCopies;
    private javax.swing.JPanel returnBooks;
    private javax.swing.JPanel return_books;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPanel student2;
    private javax.swing.JPanel student3;
    private javax.swing.JPanel student4;
    private javax.swing.JTable table_books;
    private javax.swing.JTable table_booksBORROW;
    private javax.swing.JTable table_booksISSUE;
    private javax.swing.JTextField tf_author;
    private javax.swing.JTextField tf_author1;
    private javax.swing.JTextField tf_booktitle;
    private javax.swing.JTextField tf_booktitle1;
    private javax.swing.JTextField tf_isbn;
    private javax.swing.JTextField tf_isbn1;
    private javax.swing.JTextField tf_language;
    private javax.swing.JTextField tf_language1;
    private javax.swing.JTextField tf_noOfCopies;
    private javax.swing.JTextField tf_noOfCopies1;
    private javax.swing.JTextField tf_publisher;
    private javax.swing.JTextField tf_publisher1;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_searchISSUE;
    private javax.swing.JTextField tf_yrPublished;
    private javax.swing.JTextField tf_yrPublished1;
    private javax.swing.JPanel total_books1;
    private javax.swing.JPanel total_books2;
    private javax.swing.JPanel update;
    private javax.swing.JPanel wholebody;
    // End of variables declaration//GEN-END:variables
}
