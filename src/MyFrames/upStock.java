package MyFrames;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.logging.log4j.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author umesha
 */
public class upStock extends javax.swing.JFrame {

    public upStock() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/07_plus-20.png"))); // NOI18N
        jButton1.setText("Get Report");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 160, 50));

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sale Report");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 600, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/del.png"))); // NOI18N
        jButton2.setText("Clear Database");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 160, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/update.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 630, 500));

        setSize(new java.awt.Dimension(625, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qb", "root", "");

    String billSql = "SELECT * FROM bill";
    String salesReportSql = "SELECT * FROM salesreport";
    PreparedStatement billPst = conn.prepareStatement(billSql);
    PreparedStatement salesReportPst = conn.prepareStatement(salesReportSql);

    ResultSet billResultSet = billPst.executeQuery();
    ResultSet salesReportResultSet = salesReportPst.executeQuery();

    XSSFWorkbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Table Data");

   
    ResultSetMetaData billMetaData = billResultSet.getMetaData();
    int billColumnCount = billMetaData.getColumnCount();
    Row billHeaderRow = sheet.createRow(0);
    for (int i = 1; i <= billColumnCount; i++) {
        String columnName = billMetaData.getColumnName(i);
        billHeaderRow.createCell(i - 1).setCellValue(columnName);
    }

   
    int billRowNum = 1;
    while (billResultSet.next()) {
        Row row = sheet.createRow(billRowNum++);
        for (int i = 1; i <= billColumnCount; i++) {
            Object value = billResultSet.getObject(i);
            Cell cell = row.createCell(i - 1);
            if (value instanceof Number) {
                cell.setCellValue(((Number) value).doubleValue());
            } else {
                cell.setCellValue(value != null ? value.toString() : "");
            }
        }
    }

    
    int salesReportRowNum = billRowNum + 1;

    
    ResultSetMetaData salesReportMetaData = salesReportResultSet.getMetaData();
    int salesReportColumnCount = salesReportMetaData.getColumnCount();
    Row salesReportHeaderRow = sheet.createRow(salesReportRowNum++);
    for (int i = 1; i <= salesReportColumnCount; i++) {
        String columnName = salesReportMetaData.getColumnName(i);
        salesReportHeaderRow.createCell(i - 1).setCellValue(columnName);
    }

    
    while (salesReportResultSet.next()) {
        Row row = sheet.createRow(salesReportRowNum++);
        for (int i = 1; i <= salesReportColumnCount; i++) {
            Object value = salesReportResultSet.getObject(i);
            Cell cell = row.createCell(i - 1);
            if (value instanceof Number) {
                cell.setCellValue(((Number) value).doubleValue());
            } else {
                cell.setCellValue(value != null ? value.toString() : "");
            }
        }
    }

    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    String formattedDate = currentDate.format(formatter);
    String fileName = formattedDate + ".xlsx";

    try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
        workbook.write(outputStream);
    }
    JOptionPane.showMessageDialog(this, "Data exported successfully to Excel.");

    billResultSet.close();
    salesReportResultSet.close();
    billPst.close();
    salesReportPst.close();
    conn.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e);
}


        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qb", "root", "");
            String clearData = "DELETE FROM bill"; // Corrected SQL query

            PreparedStatement billPst = conn.prepareStatement(clearData);

            int rowsAffected = billPst.executeUpdate(); // Use executeUpdate() for DELETE queries

            JOptionPane.showMessageDialog(this, "Rows deleted: " + rowsAffected);

            billPst.close();
            conn.close();
    } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
    }

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new upStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
