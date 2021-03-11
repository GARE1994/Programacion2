/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ni.edu.uni.programacion2;

import com.mycompany.ni.edu.uni.programacion2.views.panels.PnlCalculadora;
import java.awt.BorderLayout;

/**
 *
 * @author Sistemas-12
 */
public class starframe extends javax.swing.JFrame {
    
    private PnlCalculadora pnlCalculadora;

    /**
     * Creates new form starframe
     */
    public starframe() {

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

        PnlButtons = new javax.swing.JPanel();
        btncalculadora = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyApp");
        getContentPane().setLayout(new java.awt.BorderLayout(3, 2));

        PnlButtons.setBackground(new java.awt.Color(255, 204, 204));
        PnlButtons.setPreferredSize(new java.awt.Dimension(120, 100));
        PnlButtons.setLayout(new java.awt.GridLayout(3, 0, 0, 8));

        btncalculadora.setFont(new java.awt.Font("Yu Gothic Medium", 3, 14)); // NOI18N
        btncalculadora.setText("Calculadora");
        btncalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculadoraActionPerformed(evt);
            }
        });
        PnlButtons.add(btncalculadora);

        jButton2.setText("jButton2");
        PnlButtons.add(jButton2);

        jButton3.setText("jButton3");
        PnlButtons.add(jButton3);

        getContentPane().add(PnlButtons, java.awt.BorderLayout.LINE_START);

        PnlContent.setBackground(new java.awt.Color(255, 255, 255));
        PnlContent.setLayout(new java.awt.BorderLayout(5, 5));
        getContentPane().add(PnlContent, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculadoraActionPerformed
        if (pnlCalculadora == null) {
            pnlCalculadora = new PnlCalculadora();
        }
        if (PnlContent.getComponentCount() > 0 ) {
            PnlContent.remove(0);
        }
        PnlContent.add(pnlCalculadora, BorderLayout.CENTER); 
        
        this.validate();
        
        //setVisible(true);
    }//GEN-LAST:event_btncalculadoraActionPerformed

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
            java.util.logging.Logger.getLogger(starframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(starframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(starframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(starframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new starframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlButtons;
    private javax.swing.JPanel PnlContent;
    private javax.swing.JButton btncalculadora;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
