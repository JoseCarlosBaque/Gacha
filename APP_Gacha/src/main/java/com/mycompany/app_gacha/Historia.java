/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.app_gacha;

import static com.mycompany.app_gacha.Main.cont_lvl;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class Historia extends javax.swing.JFrame {

    /**
     * Creates new form Historia
     */
    public Historia() {
        initComponents();
        this.setLocationRelativeTo(null);
        //[500, 281]
        ImageIcon imagen = new ImageIcon("src\\main\\java\\images\\Historia.png");
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(fondo);
        jLabel2.setText(Main.eventos.get(0).getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jComboNiveles = new javax.swing.JComboBox<>();
        jVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPlay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboNiveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dimensional Distorsion", "After the Tournament...", "Pursuing Mercenary Tao", "Unrivaled Assasin", "Reinvestigation", "Invasion of the Warrior Race", "Premonition of Doom", "Ghost Town Investigation", "Mysterious Ki", "New Enemy", "Malicious Android: Cell", "Squad Leader", "World´s Greatest Teacher", "Telekinetic Threat", "Clever Krilin", "Turtle School Trial Lesson", "Revenge of Crane School", "Crane School Pride", "Fierce Fight for Honor", "Alien Warior Encounter" }));
        jPanel4.add(jComboNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jVolver.setText("<-");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        jPanel4.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 281));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 180, 20));

        jPlay.setText("Play");
        jPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayActionPerformed(evt);
            }
        });
        jPanel4.add(jPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        this.setVisible(false);
        mp.setVisible(true);
    }//GEN-LAST:event_jVolverActionPerformed

    private void jPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayActionPerformed
        Nivel lvl = new Nivel();
        switch (jComboNiveles.getSelectedIndex()) {
            case 0:
                cont_lvl = 1;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 1:
                cont_lvl = 2;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 2:
                cont_lvl = 3;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 3:
                cont_lvl = 4;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 4:
                cont_lvl = 5;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 5:
                cont_lvl = 6;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 6:
                cont_lvl = 7;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 7:
                cont_lvl = 8;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 8:
                cont_lvl = 9;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 9:
                cont_lvl = 10;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 10:
                cont_lvl = 11;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 11:
                cont_lvl = 12;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 12:
                cont_lvl = 13;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 13:
                cont_lvl = 14;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 14:
                cont_lvl = 15;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 15:
                cont_lvl = 16;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 16:
                cont_lvl = 17;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 17:
                cont_lvl = 18;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 18:
                cont_lvl = 19;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            case 19:
                cont_lvl = 20;
                this.setVisible(false);
                lvl.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jPlayActionPerformed

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
            java.util.logging.Logger.getLogger(Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboNiveles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jPlay;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
