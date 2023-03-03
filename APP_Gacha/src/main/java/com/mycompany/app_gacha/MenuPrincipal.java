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
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Codigo para poner una imagen de fondo
        //"D:\\1º DAW\\Programación\\CEEP\\Github_Local\\Gacha\\APP_Gacha\\src\\main\\java\\images\\Login.png" Ruta Absoluta
        ImageIcon imagen = new ImageIcon("src\\main\\java\\images\\Login.png");//Ruta Relativa
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(fondo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jItemEquipo = new javax.swing.JMenuItem();
        jItemPersonaje = new javax.swing.JMenuItem();
        jItemEntrenar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jItemHistoria = new javax.swing.JMenuItem();
        jItemEvento1 = new javax.swing.JMenuItem();
        jItemEvento2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jItemBannerHistoria = new javax.swing.JMenuItem();
        jItemBannerEspecial1 = new javax.swing.JMenuItem();
        jItemBannerEspecial2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setMaximumSize(new java.awt.Dimension(200, 183));

        jMenu1.setText("Menu");

        jItemEquipo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jItemEquipo.setText("Equipo");
        jItemEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemEquipoActionPerformed(evt);
            }
        });
        jMenu1.add(jItemEquipo);

        jItemPersonaje.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jItemPersonaje.setText("Personajes");
        jItemPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemPersonajeActionPerformed(evt);
            }
        });
        jMenu1.add(jItemPersonaje);

        jItemEntrenar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jItemEntrenar.setText("Entrenar");
        jItemEntrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemEntrenarActionPerformed(evt);
            }
        });
        jMenu1.add(jItemEntrenar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Eventos");

        jItemHistoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jItemHistoria.setText("Historia");
        jItemHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemHistoriaActionPerformed(evt);
            }
        });
        jMenu2.add(jItemHistoria);

        jItemEvento1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jItemEvento1.setText("Evento 1");
        jItemEvento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemEvento1ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemEvento1);

        jItemEvento2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jItemEvento2.setText("Evento 2");
        jItemEvento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemEvento2ActionPerformed(evt);
            }
        });
        jMenu2.add(jItemEvento2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Banners");

        jItemBannerHistoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jItemBannerHistoria.setText("Banner Inicial");
        jItemBannerHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBannerHistoriaActionPerformed(evt);
            }
        });
        jMenu3.add(jItemBannerHistoria);

        jItemBannerEspecial1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jItemBannerEspecial1.setText("Banner de Evento 1");
        jItemBannerEspecial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBannerEspecial1ActionPerformed(evt);
            }
        });
        jMenu3.add(jItemBannerEspecial1);

        jItemBannerEspecial2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jItemBannerEspecial2.setText("Banner de Evento 2");
        jItemBannerEspecial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBannerEspecial2ActionPerformed(evt);
            }
        });
        jMenu3.add(jItemBannerEspecial2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jItemEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemEquipoActionPerformed
        this.setVisible(false);
        Equipo team = new Equipo();
        team.setVisible(true);
    }//GEN-LAST:event_jItemEquipoActionPerformed

    private void jItemPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemPersonajeActionPerformed
        this.setVisible(false);
        Coleccion lista = new Coleccion();
        lista.setVisible(true);
    }//GEN-LAST:event_jItemPersonajeActionPerformed

    private void jItemEntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemEntrenarActionPerformed
        this.setVisible(false);
        Entrenar entrenamiento = new Entrenar();
        entrenamiento.setVisible(true);
    }//GEN-LAST:event_jItemEntrenarActionPerformed

    private void jItemBannerHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBannerHistoriaActionPerformed
        this.setVisible(false);
        BannerInicial bannerIni = new BannerInicial();
        bannerIni.setVisible(true);
    }//GEN-LAST:event_jItemBannerHistoriaActionPerformed

    private void jItemBannerEspecial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBannerEspecial2ActionPerformed
        this.setVisible(false);
        BannerEvento2 banner2 = new BannerEvento2();
        banner2.setVisible(true);
    }//GEN-LAST:event_jItemBannerEspecial2ActionPerformed

    private void jItemHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemHistoriaActionPerformed
        this.setVisible(false);
        Historia history = new Historia();
        history.setVisible(true);
    }//GEN-LAST:event_jItemHistoriaActionPerformed

    private void jItemEvento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemEvento1ActionPerformed
        this.setVisible(false);
        Evento1 event1 = new Evento1();
        event1.setVisible(true);
    }//GEN-LAST:event_jItemEvento1ActionPerformed

    private void jItemEvento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemEvento2ActionPerformed
        this.setVisible(false);
        Evento2 event2 = new Evento2();
        event2.setVisible(true);
    }//GEN-LAST:event_jItemEvento2ActionPerformed

    private void jItemBannerEspecial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBannerEspecial1ActionPerformed
        this.setVisible(false);
        BannerEvento1 banner1 = new BannerEvento1();
        banner1.setVisible(true);
    }//GEN-LAST:event_jItemBannerEspecial1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jItemBannerEspecial1;
    private javax.swing.JMenuItem jItemBannerEspecial2;
    private javax.swing.JMenuItem jItemBannerHistoria;
    private javax.swing.JMenuItem jItemEntrenar;
    private javax.swing.JMenuItem jItemEquipo;
    private javax.swing.JMenuItem jItemEvento1;
    private javax.swing.JMenuItem jItemEvento2;
    private javax.swing.JMenuItem jItemHistoria;
    private javax.swing.JMenuItem jItemPersonaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
