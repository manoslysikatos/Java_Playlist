/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import db.Database;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.UIManager;
import tests.DemoBasics;

/**
 *
 * @author manoslysi
 */
public class FirstPages extends javax.swing.JFrame {
    static Connection conn= Database.getConn();
    static Statement st;
    static ResultSet rs;
    public boolean isUser=false;
    private static String username;
    
    /**
     * Creates new form FirstPages
     */
    public FirstPages() {
        initComponents();
    }

    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        LoginPage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ConfirmBtn = new javax.swing.JButton();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NotificationBar = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();
        SignUpPage = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        UsernameField2 = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        PasswordField2 = new javax.swing.JPasswordField();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        NotificationField = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new java.awt.CardLayout());

        LoginPage.setLayout(null);

        jLabel1.setFont(new java.awt.Font("FreeSans", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MusicHub");
        LoginPage.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 100);

        jLabel2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");
        LoginPage.add(jLabel2);
        jLabel2.setBounds(0, 90, 600, 18);

        jLabel3.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        LoginPage.add(jLabel3);
        jLabel3.setBounds(0, 160, 600, 18);

        jButton1.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        LoginPage.add(jButton1);
        jButton1.setBounds(180, 230, 80, 30);

        ConfirmBtn.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        ConfirmBtn.setText("Confirm");
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });
        LoginPage.add(ConfirmBtn);
        ConfirmBtn.setBounds(320, 230, 100, 30);

        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });
        UsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameFieldKeyPressed(evt);
            }
        });
        LoginPage.add(UsernameField);
        UsernameField.setBounds(180, 110, 240, 30);

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });
        LoginPage.add(PasswordField);
        PasswordField.setBounds(180, 180, 240, 30);

        jLabel5.setFont(new java.awt.Font("FreeSans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("First Time Here? Sign Up now!!");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        LoginPage.add(jLabel5);
        jLabel5.setBounds(180, 300, 220, 15);

        jLabel6.setFont(new java.awt.Font("FreeSans", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Enter as a guest");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel6KeyPressed(evt);
            }
        });
        LoginPage.add(jLabel6);
        jLabel6.setBounds(180, 330, 220, 15);

        NotificationBar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NotificationBar.setForeground(new java.awt.Color(255, 51, 51));
        LoginPage.add(NotificationBar);
        NotificationBar.setBounds(180, 270, 250, 20);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/texture-990104_1920.jpg"))); // NOI18N
        BackgroundImage.setText("jLabel1");
        BackgroundImage.setPreferredSize(new java.awt.Dimension(600, 400));
        LoginPage.add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 600, 400);

        getContentPane().add(LoginPage, "card2");

        SignUpPage.setLayout(null);

        jLabel7.setFont(new java.awt.Font("FreeSans", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MusicHub");
        SignUpPage.add(jLabel7);
        jLabel7.setBounds(0, 80, 320, 90);

        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("Username");
        SignUpPage.add(jLabel8);
        jLabel8.setBounds(330, 50, 270, 17);

        jLabel9.setForeground(new java.awt.Color(153, 153, 255));
        jLabel9.setText("E-mail");
        SignUpPage.add(jLabel9);
        jLabel9.setBounds(330, 120, 260, 17);

        jLabel10.setForeground(new java.awt.Color(153, 153, 255));
        jLabel10.setText("Password");
        SignUpPage.add(jLabel10);
        jLabel10.setBounds(330, 180, 260, 17);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("Password");
        SignUpPage.add(jLabel11);
        jLabel11.setBounds(330, 240, 250, 18);
        SignUpPage.add(UsernameField2);
        UsernameField2.setBounds(330, 70, 220, 30);
        SignUpPage.add(EmailField);
        EmailField.setBounds(330, 140, 220, 30);
        SignUpPage.add(PasswordField2);
        PasswordField2.setBounds(330, 200, 220, 30);
        SignUpPage.add(ConfirmPasswordField);
        ConfirmPasswordField.setBounds(330, 260, 220, 30);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        SignUpPage.add(jButton2);
        jButton2.setBounds(330, 310, 80, 29);

        jButton3.setText("Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        SignUpPage.add(jButton3);
        jButton3.setBounds(450, 310, 94, 29);

        NotificationField.setForeground(new java.awt.Color(153, 153, 255));
        SignUpPage.add(NotificationField);
        NotificationField.setBounds(50, 190, 230, 140);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/texture-990104_1920.jpg"))); // NOI18N
        SignUpPage.add(jLabel12);
        jLabel12.setBounds(0, 0, 690, 400);

        getContentPane().add(SignUpPage, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        String sdf = null;
        String username = UsernameField.getText();
        String password = PasswordField.getText();
        NotificationBar.setText("Processing the credentials");
        try {
            st = conn.createStatement();
            StringBuilder select =  new StringBuilder("SELECT COUNT(*) FROM USERS WHERE USERID=\'");
            select.append(username);
            select.append("\' AND PASSWORD=\'");
            select.append(password);
            select.append("\'");
            String select1 = select.toString();
            //String select = "SELECT COUNT(*) FROM TESTABLE WHERE USERID=\"" + username "\" AND PASSWORD=\"" +password "\"";
            rs = st.executeQuery(select1);
          /*  while (rs.next()) {
                String result = rs.getString(key);
               System.out.println(result);
            }*/
            while(rs.next()){
                sdf = rs.getString("COUNT(*)");
                System.out.println(sdf);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Couldn't display results");
            System.err.println(e);
        }
        if(sdf.isEmpty()){
            NotificationBar.setText("Something went terribly wrong");
        }else if(sdf.equals("0")){
            NotificationBar.setText("Invalid Username or Password");
        }else if(sdf.equals("1")){
            NotificationBar.setText("Valid Username or Password");
            this.username = username;
            try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Couldn't load Nimbus");
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        GUI_USER tmp= new GUI_USER();
        /*
        tmp.setUsername(FirstPages.getUsername());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)screenSize.getWidth();
        int y = (int)screenSize.getHeight();
        */
        tmp.setExtendedState(JFrame.MAXIMIZED_BOTH); 
tmp.setUndecorated(true);
//.setVisible(true);
        tmp.setVisible(true);
        DemoBasics.closeFirstPages(this);
            
            //GUI_USER tmp =  new GUI_USER();
            //tmp.username = username;
            //tmp.setVisible(tr);
            
            //MainPage.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmBtnActionPerformed

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Database.Disconnect();
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        LoginPage.setVisible(false);
        SignUpPage.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SignUpPage.setVisible(false);
        NotificationField.setText("");
        UsernameField.setText("");
        EmailField.setText("");
        PasswordField2.setText("");
        ConfirmPasswordField.setText("");
        LoginPage.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String username = UsernameField2.getText();
        String password = PasswordField2.getText();
        String email = EmailField.getText();
        int test;
        String sdf = null;
        try {
            
            
            st = conn.createStatement();
            StringBuilder select =  new StringBuilder("SELECT COUNT(*) FROM USERS WHERE USERID=\'");
            select.append(username);
            select.append("\'");
            String select1 = select.toString();
            //String select = "SELECT COUNT(*) FROM TESTABLE WHERE USERID=\"" + username "\" AND PASSWORD=\"" +password "\"";
            try{
                rs = st.executeQuery(select1);
                
            }catch(Exception e){
                NotificationField.setText("You have disconnected from the database");
            }
                /*  while (rs.next()) {
                String result = rs.getString(key);
               System.out.println(result);
            }*/
            while(rs.next()){
                sdf = rs.getString("COUNT(*)");
                if(!sdf.equals("0")){
                    NotificationField.setText("That username already exists");
                    return;
                }
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Couldn't display results");
            System.err.println(e);
        }
        
        
        
        if(!EmailField.getText().contains("@")){
            NotificationField.setText("Invalid E-mail");
            return;
        }
        
        if(!PasswordField2.getText().equals(ConfirmPasswordField.getText())){
            NotificationField.setText("Passwords don't match");
            return;
        }else if(PasswordField2.getText().equals("") || ConfirmPasswordField.getText().equals("")){
            NotificationField.setText("Please enter a password");
            return;
        }
        
        try {
            st = conn.createStatement();
            StringBuilder select =  new StringBuilder("INSERT INTO USERS VALUES('");
            select.append(username);
            select.append("','");
            select.append(password);
            select.append("','");
            select.append(email);
            select.append("')");
            String select1 = select.toString();
            test = st.executeUpdate(select1);
            if(test==0){
                System.out.println("Please Try later");
            }
            //rs.close();
        } catch (Exception e) {
            System.err.println(e);
        }   
        
        SignUpPage.setVisible(false);
        LoginPage.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6KeyPressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        isUser = false;
        GUI tmp = new GUI();// TODO add your handling code here:
        tmp.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void UsernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            PasswordField.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            PasswordField.requestFocus();
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldKeyPressed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            UsernameField.requestFocus();
        }
        
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String sdf = null;
        String username = UsernameField.getText();
        String password = PasswordField.getText();
        NotificationBar.setText("Processing the credentials");
        try {
            st = conn.createStatement();
            StringBuilder select =  new StringBuilder("SELECT COUNT(*) FROM USERS WHERE USERID=\'");
            select.append(username);
            select.append("\' AND PASSWORD=\'");
            select.append(password);
            select.append("\'");
            String select1 = select.toString();
            //String select = "SELECT COUNT(*) FROM TESTABLE WHERE USERID=\"" + username "\" AND PASSWORD=\"" +password "\"";
            rs = st.executeQuery(select1);
          /*  while (rs.next()) {
                String result = rs.getString(key);
               System.out.println(result);
            }*/
            while(rs.next()){
                sdf = rs.getString("COUNT(*)");
                
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Couldn't display results");
            System.err.println(e);
        }
        if(sdf.isEmpty()){
            NotificationBar.setText("Something went terribly wrong");
        }else if(sdf.equals("0")){
            NotificationBar.setText("Invalid Username or Password");
        }else if(sdf.equals("1")){
            NotificationBar.setText("Valid Username or Password");
            this.username = username;
            try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Couldn't load Nimbus");
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        GUI_USER tmp= new GUI_USER();
        tmp.setUsername(FirstPages.getUsername());
        tmp.setVisible(true);
        DemoBasics.closeFirstPages(this);
            
            //GUI_USER tmp =  new GUI_USER();
            //tmp.username = username;
            //tmp.setVisible(tr);
            
            //MainPage.setVisible(true);
        }  
        }   // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(FirstPages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               FirstPages tmp = new FirstPages();
                tmp.setSize(600,400);
                tmp.setResizable(false);
                tmp.setVisible(true);
            }
        });
    }
    
    public void runFirstPages() {
               FirstPages tmp = new FirstPages();
                tmp.setSize(600,400);
                tmp.setResizable(false);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int)screenSize.getWidth()/2;
                int y = (int)screenSize.getHeight()/ 2;  
                x -= 300;
                y -= 200;
                //Set the new frame location  
                tmp.setLocation(x, y);  
                tmp.setVisible(true);
            }
    
    public static String getUsername(){
        return username;
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JPanel LoginPage;
    private javax.swing.JLabel NotificationBar;
    private javax.swing.JLabel NotificationField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPasswordField PasswordField2;
    private javax.swing.JPanel SignUpPage;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JTextField UsernameField2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}