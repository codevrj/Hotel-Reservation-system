/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author VIRAJ
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        btn_mangeRoom = new javax.swing.JButton();
        btn_checkIn = new javax.swing.JButton();
        btn_cusCheckout = new javax.swing.JButton();
        btn_cusDetails = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mangeRoom.setBackground(new java.awt.Color(153, 153, 153));
        btn_mangeRoom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_mangeRoom.setForeground(new java.awt.Color(0, 0, 0));
        btn_mangeRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-key (1).png"))); // NOI18N
        btn_mangeRoom.setText("MANAGE ROOM");
        btn_mangeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mangeRoomActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mangeRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 330, 100));

        btn_checkIn.setBackground(new java.awt.Color(153, 153, 153));
        btn_checkIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_checkIn.setForeground(new java.awt.Color(0, 0, 0));
        btn_checkIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-user-male.png"))); // NOI18N
        btn_checkIn.setText("CUSTOMER CHECK IN");
        btn_checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkInActionPerformed(evt);
            }
        });
        getContentPane().add(btn_checkIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 340, 100));

        btn_cusCheckout.setBackground(new java.awt.Color(153, 153, 153));
        btn_cusCheckout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cusCheckout.setForeground(new java.awt.Color(0, 0, 0));
        btn_cusCheckout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel-chekc-out.png"))); // NOI18N
        btn_cusCheckout.setText("CUSTOMER CHECK OUT");
        btn_cusCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cusCheckoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cusCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, 100));

        btn_cusDetails.setBackground(new java.awt.Color(153, 153, 153));
        btn_cusDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cusDetails.setForeground(new java.awt.Color(0, 0, 0));
        btn_cusDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informatics.png"))); // NOI18N
        btn_cusDetails.setText("CUSTOMER DETAILS ");
        btn_cusDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cusDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cusDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 340, 100));

        btn_close.setBackground(new java.awt.Color(51, 51, 51));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_25px.png"))); // NOI18N
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 30, 30));

        btn_logout.setBackground(new java.awt.Color(0, 0, 0));
        btn_logout.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Log Out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 490, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/01.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to LogOut?","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        
                int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close?","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_mangeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mangeRoomActionPerformed
        
        setVisible(false);
        new manageroom().setVisible(true);
    }//GEN-LAST:event_btn_mangeRoomActionPerformed

    private void btn_checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkInActionPerformed
        //
        setVisible(false);
        new customerChecking().setVisible(true);
    }//GEN-LAST:event_btn_checkInActionPerformed

    private void btn_cusCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cusCheckoutActionPerformed
        
        setVisible(false);
        new Checkout().setVisible(true);
    }//GEN-LAST:event_btn_cusCheckoutActionPerformed

    private void btn_cusDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cusDetailsActionPerformed
        setVisible(false);
        new Detailbill().setVisible(true);
    }//GEN-LAST:event_btn_cusDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_checkIn;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_cusCheckout;
    private javax.swing.JButton btn_cusDetails;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_mangeRoom;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
