/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import Logins.Login;
import java.awt.Color;
import javax.swing.JLabel;
import Logins.Add;
/**
 *
 * @author Nanda
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    boolean state = false;
    public Home() {
        initComponents();
        jRunningIcon.setVisible(false);
        jDisplayItems.setText("0 Items in the Machine");
        jDisplayWeight.setText("0 Kgs");
        int machineCapacity = 7;
        jStop.setVisible(false);
        jAddItem.setVisible(false);
        jStart.setVisible(false);
        if (state = false)
        {
            jOnOff.setText("ON");
            jOnOff.setBackground(Color.green);
        }
    }

   public Home(String para)
   {
       initComponent();
       jDisplayItems.setText(para);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jStart = new javax.swing.JButton();
        jStop = new javax.swing.JButton();
        jDisplayItems = new javax.swing.JTextField();
        jOnOff = new javax.swing.JToggleButton();
        jRunningIcon = new javax.swing.JLabel();
        jAddItem = new javax.swing.JButton();
        jDisplayWeight = new javax.swing.JTextField();
        jCommentOn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO THULASI WASHING MACHINE");

        jLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLogout.setForeground(new java.awt.Color(255, 153, 153));
        jLogout.setText("LOGOUT");
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Washing Machine 1 (Max Capacity : 10 kgs)");

        jStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jStart.setText("Start");
        jStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartActionPerformed(evt);
            }
        });

        jStop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jStop.setText("Stop");
        jStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStopActionPerformed(evt);
            }
        });

        jDisplayItems.setEditable(false);
        jDisplayItems.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDisplayItems.setToolTipText("");
        jDisplayItems.setEnabled(false);
        jDisplayItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisplayItemsActionPerformed(evt);
            }
        });

        jOnOff.setBackground(new java.awt.Color(102, 255, 102));
        jOnOff.setText("ON");
        jOnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOnOffActionPerformed(evt);
            }
        });

        jRunningIcon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRunningIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nanda\\Desktop\\82.gif")); // NOI18N

        jAddItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jAddItem.setText("Add Item");
        jAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddItemActionPerformed(evt);
            }
        });

        jDisplayWeight.setEditable(false);
        jDisplayWeight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDisplayWeight.setToolTipText("");
        jDisplayWeight.setEnabled(false);
        jDisplayWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisplayWeightActionPerformed(evt);
            }
        });

        jCommentOn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCommentOn.setText("Please Press \"ON\" to start the machine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRunningIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(135, 135, 135)
                        .addComponent(jOnOff))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jStart, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jStop)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDisplayItems, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDisplayWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCommentOn)
                .addGap(207, 207, 207))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jOnOff))
                    .addComponent(jRunningIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDisplayItems, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDisplayWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jCommentOn)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)))
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLogout))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLogout)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartActionPerformed
        // TODO add your handling code here:
        jRunningIcon.setVisible(true);
        jStart.setVisible(false);
        jStop.setVisible(true);
        jAddItem.setVisible(true);
    }//GEN-LAST:event_jStartActionPerformed

    private void jStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStopActionPerformed
        // TODO add your handling code here:
        jRunningIcon.setVisible(false);
        jStop.setVisible(false);
        jStart.setVisible(true);
    }//GEN-LAST:event_jStopActionPerformed

    private void jDisplayItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisplayItemsActionPerformed

    private void jOnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOnOffActionPerformed
        // TODO add your handling code here:
        if(state = true)
        {
            jOnOff.setText("OFF");
            state = false;
            jOnOff.setBackground(Color.red);
            jStart.setVisible(true);
            jCommentOn.setVisible(false);
        }
    }//GEN-LAST:event_jOnOffActionPerformed

    private void jAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddItemActionPerformed
        // TODO add your handling code here:
        Add item = new Add();
        item.setVisible(true);
    }//GEN-LAST:event_jAddItemActionPerformed

    private void jDisplayWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisplayWeightActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddItem;
    private javax.swing.JLabel jCommentOn;
    private javax.swing.JTextField jDisplayItems;
    private javax.swing.JTextField jDisplayWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogout;
    private javax.swing.JToggleButton jOnOff;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jRunningIcon;
    private javax.swing.JButton jStart;
    private javax.swing.JButton jStop;
    // End of variables declaration//GEN-END:variables

    private void initComponent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
