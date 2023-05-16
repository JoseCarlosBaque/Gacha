/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.app_gacha;

import static com.mycompany.app_gacha.Main.*;
import com.mycompany.dominio.Personaje;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class BannerEvento1 extends javax.swing.JFrame {

    /**
     * Creates new form BannerEvento1
     */
    public BannerEvento1() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon("src\\main\\java\\images\\Banner2.png");
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(fondo);
        if (cont_free == 0) {
            JOptionPane.showMessageDialog(null, "Tienes un Multi gratis!!!!!!");
        } else if (user.getItems().size() > 0) {
            jLabel2.setText("Tienes: " + user.getItems().get(1).getCantidad() + user.getItems().get(1).getNombre());
        }
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
        jVolver = new javax.swing.JButton();
        jPersonajes = new javax.swing.JButton();
        jRates = new javax.swing.JButton();
        jSingle = new javax.swing.JButton();
        jMulti = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jVolver.setText("<-");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jPersonajes.setText("Personajes");
        jPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPersonajesActionPerformed(evt);
            }
        });
        jPanel1.add(jPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jRates.setText("%");
        jRates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRatesActionPerformed(evt);
            }
        });
        jPanel1.add(jRates, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jSingle.setText("Summon X1");
        jSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSingleActionPerformed(evt);
            }
        });
        jPanel1.add(jSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 110, 30));

        jMulti.setText("Summon X10");
        jMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMultiActionPerformed(evt);
            }
        });
        jPanel1.add(jMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 110, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 281));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        this.setVisible(false);
        mp.setVisible(true);
    }//GEN-LAST:event_jVolverActionPerformed

    private void jRatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRatesActionPerformed
        JOptionPane.showMessageDialog(null, "Probabilidad Nuevo Personaje: " + banners.get(1).getProb_nuevo() + "%\nProbabilidad de Sparking: " + banners.get(1).getProb_sp()
                + "%\nProbabilidad de Extreme: " + banners.get(1).getProb_ex() + "%\nProbabilidad de Hero: " + banners.get(1).getProb_hero() + "%");
    }//GEN-LAST:event_jRatesActionPerformed

    private void jPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPersonajesActionPerformed
        for (int i = 0; i < banner_content1.size(); i++) {
            JOptionPane.showMessageDialog(null, banner_content1.get(i).getNombre());
        }
    }//GEN-LAST:event_jPersonajesActionPerformed

    private void jSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSingleActionPerformed
        if (user.getItems().size() > 1) {
            if (user.getItems().get(1).getCantidad() >= 1) {
                int x = (int) (Math.random() * banner_content1.size());
                if (banner_content1.get(x).isConseguido() == false) {
                    try {
                        Personaje pj = (Personaje) banner_content1.get(x).clone();
                        banner_content1.get(x).setConseguido(true);
                        pj.setId_personaje(cont++);
                        user.getEquipo().add(pj);
                        JOptionPane.showMessageDialog(null, "Has conseguido a " + banner_content1.get(x).getNombre());
                    } catch (CloneNotSupportedException ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                    }
                } else {
                    for (int i = 0; i < user.getEquipo().size(); i++) {
                        if (banner_content1.get(x).getNombre().equals(user.getEquipo().get(i).getNombre())) {
                            if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 100);
                                JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                            } else if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 300);
                                JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                            } else if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 600);
                                JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                            }
                        }
                    }
                }
                user.getItems().get(1).setCantidad(user.getItems().get(1).getCantidad() - 1);
                jLabel2.setText("Te quedan: " + user.getItems().get(1).getCantidad() + user.getItems().get(1).getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "No tienes suficiente " + items.get(1).getTipo() + " Necesitas 1 o mas para tirar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente " + items.get(1).getTipo() + " Necesitas 1 o mas para tirar");
        }
    }//GEN-LAST:event_jSingleActionPerformed

    private void jMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMultiActionPerformed
        if (cont_free == 0) {
            for (int j = 0; j < 10; j++) {
                int x = (int) (Math.random() * banner_content1.size());
                if (banner_content1.get(x).isConseguido() == false) {
                    try {
                        Personaje pj = (Personaje) banner_content1.get(x).clone();
                        banner_content1.get(x).setConseguido(true);
                        pj.setId_personaje(cont++);
                        user.getEquipo().add(pj);
                        JOptionPane.showMessageDialog(null, "Has conseguido a " + banner_content1.get(x).getNombre());
                    } catch (CloneNotSupportedException ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                    }
                } else {
                    for (int i = 0; i < user.getEquipo().size(); i++) {
                        if (banner_content1.get(x).getNombre().equals(user.getEquipo().get(i).getNombre())) {
                            if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 100);
                                JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                            } else if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 300);
                                JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                            } else if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 600);
                                JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                            }
                        }
                    }
                }
            }
            cont_free++;
        } else if (user.getItems().size() > 1) {
            if (user.getItems().get(1).getCantidad() >= 50) {
                for (int j = 0; j < 10; j++) {
                    int x = (int) (Math.random() * banner_content1.size());
                    if (banner_content1.get(x).isConseguido() == false) {
                        try {
                            Personaje pj = (Personaje) banner_content1.get(x).clone();
                            banner_content1.get(x).setConseguido(true);
                            pj.setId_personaje(cont++);
                            user.getEquipo().add(pj);
                            JOptionPane.showMessageDialog(null, "Has conseguido a " + banner_content1.get(x).getNombre());
                        } catch (CloneNotSupportedException ex) {
                            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                        }
                    } else {
                        for (int i = 0; i < user.getEquipo().size(); i++) {
                            if (banner_content1.get(x).getNombre().equals(user.getEquipo().get(i).getNombre())) {
                                if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                    user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 100);
                                    JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                                } else if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                    user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 300);
                                    JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                                } else if (banner_content1.get(x).getTipo().equals(user.getEquipo().get(i).getTipo())) {
                                    user.getEquipo().get(i).setSoul(user.getEquipo().get(i).getSoul() + 600);
                                    JOptionPane.showMessageDialog(null, "Has conseguido a " + user.getEquipo().get(i).getNombre());
                                }
                            }
                        }
                    }
                }
                user.getItems().get(1).setCantidad(user.getItems().get(1).getCantidad() - 50);
                jLabel2.setText("Te quedan: " + user.getItems().get(1).getCantidad() + user.getItems().get(1).getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "No tienes suficiente " + items.get(1).getTipo() + " Necesitas 50 o mas para tirar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente " + items.get(1).getTipo() + " Necesitas 50 o mas para tirar");
        }
    }//GEN-LAST:event_jMultiActionPerformed

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
            java.util.logging.Logger.getLogger(BannerEvento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BannerEvento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BannerEvento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BannerEvento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BannerEvento1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jMulti;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPersonajes;
    private javax.swing.JButton jRates;
    private javax.swing.JButton jSingle;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
