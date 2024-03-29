import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





/**
 *
 * @author umesha
 */
public class AdminLogin extends javax.swing.JFrame {

  
    public AdminLogin() {
        initComponents();
        this.setLocation(300,100);
    }
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        al2 = new javax.swing.JLabel();
        al1 = new javax.swing.JLabel();
        at2 = new javax.swing.JPasswordField();
        at1 = new javax.swing.JTextField();
        abtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Admin Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 220, 260));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        al2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        al2.setForeground(new java.awt.Color(51, 0, 102));
        al2.setText("Password");
        jPanel1.add(al2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 174, 112, 30));

        al1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        al1.setForeground(new java.awt.Color(51, 0, 102));
        al1.setText("Admin Id");
        jPanel1.add(al1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 112, 40));

        at2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                at2ActionPerformed(evt);
            }
        });
        jPanel1.add(at2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 137, -1));

        at1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                at1ActionPerformed(evt);
            }
        });
        jPanel1.add(at1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 137, -1));

        abtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        abtn.setText("Login");
        abtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        abtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abtnActionPerformed(evt);
            }
        });
        jPanel1.add(abtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 80, 30));

        jCheckBox1.setForeground(new java.awt.Color(51, 0, 102));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 124, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 60, 80));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Welcome to");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 150, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Best POS System");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Developed by P.U.R SILVA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 250, 150, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TTT.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 320, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(716, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void at1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_at1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_at1ActionPerformed

    private void abtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abtnActionPerformed
   close();
   Connection con;
   PreparedStatement ps;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qb", "root", "");
            //ps=con.prepareStatement("SELECT `username`,`password` FROM `admin` WHERE `username`=? AND `password`=?;");
            ps=con.prepareStatement("SELECT * from admin where username=? and password=?");
            
            ps.setString(1,at1.getText());
            ps.setString(2, String.valueOf(at2.getPassword()));
            
            
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {  
            MainFrame main=new MainFrame();
            main.setVisible(true);  
           }
            else
            {
                
                 JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                 at1.setText("");
                 at2.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_abtnActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
 if(jCheckBox1.isSelected())
 {
     at2.setEchoChar((char)0);
 }
 else{
     at2.setEchoChar('*');
 } 
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Quickbill().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void at2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_at2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_at2ActionPerformed

    public static void main(String args[]) {
  
  
    

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abtn;
    private javax.swing.JLabel al1;
    private javax.swing.JLabel al2;
    private javax.swing.JTextField at1;
    private javax.swing.JPasswordField at2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
