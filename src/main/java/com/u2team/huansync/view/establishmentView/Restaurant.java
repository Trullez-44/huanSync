/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.u2team.huansync.view.establishmentView;

import com.u2team.huansync.establishment.model.Establishment;
import com.u2team.huansync.view.activityView.AlertDelete;
import com.u2team.huansync.view.activityView.Successful;
import javax.swing.JOptionPane;

/**
 *
 * @author NICOLAS RUIZ
 */
public class Restaurant extends javax.swing.JFrame {

    /**
     * Creates new form Restaurant
     */
    public Restaurant() {
        initComponents();
    }

    private boolean validateFields() {
        if (txtManager.getText().trim().isEmpty() || txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You must complete all fields", "Validation error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tblRestaurants = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCreateRestaurant = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtManager = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnMakeOrder = new javax.swing.JButton();
        btnInventoIngred = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 148, 50));

        tblRestaurants.setBackground(new java.awt.Color(255, 223, 142));

        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Manager"
            }
        ));
        tblRestaurants.setViewportView(jTable1);

        btnCreateRestaurant.setBackground(new java.awt.Color(8, 69, 106));
        btnCreateRestaurant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateRestaurant.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateRestaurant.setText("Create");
        btnCreateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRestaurantActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(8, 69, 106));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(255, 223, 142));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setText("Name:");

        txtManager.setBackground(new java.awt.Color(255, 223, 142));
        txtManager.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtManager.setForeground(new java.awt.Color(0, 0, 0));
        txtManager.setText("Manager:");

        btnUpdate.setBackground(new java.awt.Color(8, 69, 106));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");

        btnDelete.setBackground(new java.awt.Color(8, 69, 106));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnMakeOrder.setBackground(new java.awt.Color(8, 69, 106));
        btnMakeOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMakeOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnMakeOrder.setText("Make Order");
        btnMakeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeOrderActionPerformed(evt);
            }
        });

        btnInventoIngred.setBackground(new java.awt.Color(8, 69, 106));
        btnInventoIngred.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInventoIngred.setForeground(new java.awt.Color(255, 255, 255));
        btnInventoIngred.setText(" Ingredients Inventory");
        btnInventoIngred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoIngredActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(144, 19, 33));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESTAURANT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCreateRestaurant)
                                .addGap(34, 34, 34)
                                .addComponent(btnUpdate)
                                .addGap(28, 28, 28)
                                .addComponent(btnDelete))
                            .addComponent(txtManager, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMakeOrder)
                        .addGap(30, 30, 30)
                        .addComponent(btnInventoIngred, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addComponent(tblRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtManager, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateRestaurant)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMakeOrder)
                            .addComponent(btnInventoIngred)))
                    .addComponent(tblRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        EstablishmentView establishment = new EstablishmentView();
        establishment.setVisible(true);
        establishment.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        AlertDelete alertDelete = new AlertDelete();
        alertDelete.setVisible(true);
        alertDelete.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnMakeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeOrderActionPerformed
        OrderMenu order = new OrderMenu();
        order.setVisible(true);
        order.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnMakeOrderActionPerformed

    private void btnInventoIngredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoIngredActionPerformed
        Ingredients inventoryIngredients = new Ingredients();
        inventoryIngredients.setVisible(true);
        inventoryIngredients.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnInventoIngredActionPerformed

    private void btnCreateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRestaurantActionPerformed
        if (validateFields()) {
            Successful successful = new Successful();
            successful.setVisible(true);
            successful.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnCreateRestaurantActionPerformed

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
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateRestaurant;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInventoIngred;
    private javax.swing.JButton btnMakeOrder;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tblRestaurants;
    private javax.swing.JTextField txtManager;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
