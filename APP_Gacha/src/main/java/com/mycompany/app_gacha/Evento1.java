/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.app_gacha;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author joseb
 */
public class Evento1 extends javax.swing.JFrame {

    /**
     * Creates new form Evento1
     */
    public Evento1() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon("src\\main\\java\\images\\Evento.jpg");
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(fondo);
        jLabel2.setText(Main.eventos.get(1).getNombre());
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Mstery Dark Foe", "Dark Nightmare", "Black Harbinger of Destruccion", "God-Transcending Battle", "Rose-Tinted Plot", "Searing Rose-Colored Fury", "Rage of the Proud Father-Son Duo", "The Ultimate Power of a God", "Fusion in Blue", "Last Judgment...Or Last Hope", "Sublime Blue!", "Human Sin and Divine Failure", "Ultimate Battle!", "A New Hope", "Miraculous World-Protecting Power!" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jVolver.setText("<-");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 281));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 296, 220, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        this.setVisible(false);
        mp.setVisible(true);
    }//GEN-LAST:event_jVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Evento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evento1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
