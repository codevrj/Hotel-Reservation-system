
import javax.swing.JOptionPane;
import java.sql.*;
import project.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIRAJ
 */
public class forgotpassword extends javax.swing.JFrame {

    /**
     * Creates new form forgotpassword
     */
    public forgotpassword() {
        initComponents();
    }
    String email;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_SecQuestion = new javax.swing.JTextField();
        txt_answer = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_signUp = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        NewPasswrd = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 396));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-mail");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Security Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Answer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        txt_email.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 236, -1));

        txt_SecQuestion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(txt_SecQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 236, -1));

        txt_answer.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(txt_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 236, -1));

        btn_save.setBackground(new java.awt.Color(204, 204, 255));
        btn_save.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        btn_signUp.setBackground(new java.awt.Color(255, 255, 204));
        btn_signUp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_signUp.setText("Sign Up");
        btn_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signUpActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        btn_login.setBackground(new java.awt.Color(204, 255, 204));
        btn_login.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        btn_search.setBackground(new java.awt.Color(204, 255, 255));
        btn_search.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(java.awt.SystemColor.text);
        jLabel5.setText("RECOVER PASSWORD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_25px.png"))); // NOI18N
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 20, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 98, -1, -1));
        getContentPane().add(NewPasswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 230, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Abstract background 01.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        
                        int a=JOptionPane.showConfirmDialog(null, "Are you really want to close","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        int check=0;
        email=txt_email.getText();
        
        if(email.equals(""))
        {
            check=1; 
            JOptionPane.showMessageDialog(null,"Email is required");
        }
        else{
            ResultSet rs=selectdt.getData("select*from users where email='"+email+"'");
            try
            {
                if(rs.next())
                {
                    check=1;
                    txt_email.setEditable(false);
                    txt_SecQuestion.setEditable(false);
                    txt_SecQuestion.setText(rs.getString(4));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
                    
        }
        if(check==0)
        {
             JOptionPane.showMessageDialog(null,"Incorrect email");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        int check=0;
        String securityQuestion=txt_SecQuestion.getText();
        String answer=txt_answer.getText();
        String newpassword=NewPasswrd.getText();
        
        if(answer.equals("")||newpassword.equals(""))
        {
            check=1;
            JOptionPane.showMessageDialog(null,"All fields are required");
        }
        else
        {
            ResultSet rs=selectdt.getData("select*from users where email='"+email+"' and securityQuestion='"+securityQuestion+"'and answer='"+answer+"'");
            try
            {
                if(rs.next())
                {
                    check=1;
                    Insert_Update_Delete.setData("update users set password='"+newpassword+"'where email='"+email+"'", "Password set successful");            
                    setVisible(false);
                    new forgotpassword().setVisible(true);
                }
            }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
            }
        }
        if(check==0)
        {
            JOptionPane.showMessageDialog(null,"Incorrect answer");
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signUpActionPerformed
         setVisible(false);
         new Sighup().setVisible(true);
    }//GEN-LAST:event_btn_signUpActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField NewPasswrd;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_signUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_SecQuestion;
    private javax.swing.JTextField txt_answer;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
