import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.lang.*;

public class Excel extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String loc = ""; 
    DefaultTableModel dm = new DefaultTableModel();
    
    public Excel() {
        conn = dbConnection.connect();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        exc = new javax.swing.JTable();
        export = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(exc);

        export.setText("display");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        jButton1.setText("export");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(export, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        exc.setModel(getData());
    }//GEN-LAST:event_exportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        writetoExcel();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private DefaultTableModel getData() {
        dm.addColumn("STUDENT NAME");
        dm.addColumn("STUDENT ID");
        dm.addColumn("YEAR AND COURSE");
        dm.addColumn("PURPOSE");
        
        try {
            String sql = "SELECT `STUDENT_NAME`, `SCHOOL_ID`, `YEAR_AND_COURSE`, `PURPOSE` FROM `librarycard`";
            Statement s = conn.prepareStatement(sql);
            rs = s.executeQuery(sql);
            
            while(rs.next()){
                String name = rs.getString(1);
                String id = rs.getString(2);
                String yr = rs.getString(3);
                String purpose = rs.getString(4);
                
                String[] rowdata = {name, id, yr, purpose};
                dm.addRow(rowdata);
            }
            
            return dm;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return null;
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
        data.put("-1", new Object[]{dm.getColumnName(0), dm.getColumnName(1), dm.getColumnName(2), dm.getColumnName(3)});
        
        //Adding rows and cells
        for(int i = 0; i < dm.getRowCount(); i++){
            data.put(Integer.toString(i), new Object[]{getCellValue(i, 0), getCellValue(i, 1), getCellValue(i, 2), getCellValue(i, 3)});  
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
        }catch(Exception e){
            
        }
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Excel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable exc;
    private javax.swing.JButton export;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
