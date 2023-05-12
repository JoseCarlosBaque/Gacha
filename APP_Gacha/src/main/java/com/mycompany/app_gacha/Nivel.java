/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.app_gacha;

import static com.mycompany.app_gacha.Main.*;
import com.mycompany.dominio.Item;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joseb
 */
public class Nivel extends javax.swing.JFrame {

    /**
     * Creates new form Niveles
     */
    public Nivel() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel mod = new DefaultComboBoxModel();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("TAG");
        modelo.addColumn("Tipo");
        String[] datos = new String[3];
        ArrayList<String> id_personaje = new ArrayList<String>();
        for (int i = 0; i < user.getEquipo().size(); i++) {
            //Datos a mostrar en el jTable
            if (i == 6) {
                break;
            }
            datos[0] = user.getEquipo().get(i).getNombre();
            datos[1] = user.getEquipo().get(i).getTitulo();
            datos[2] = user.getEquipo().get(i).getTipo();
            modelo.addRow(datos);
            //Datos a en el jComboBox
            id_personaje.add(String.valueOf(i + 1));
            mod.addElement(id_personaje.get(i));
        }
        jEquipo.setModel(modelo);
        jPosicion.setSelectedItem(id_personaje.get(0));
        jPosicion.setModel(mod);
        if (cont_lvl >= 1 && cont_lvl <= 5) {
            jLive.setValue(250);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\N17.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 6 && cont_lvl <= 10) {
            jLive.setValue(500);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\N18.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 11 && cont_lvl <= 15) {
            jLive.setValue(750);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\N17yN18.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 16 && cont_lvl <= 20) {
            jLive.setValue(1000);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\Cell.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 21 && cont_lvl <= 25) {
            jLive.setValue(1250);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\Zamasu.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 26 && cont_lvl <= 30) {
            jLive.setValue(1500);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\GokuBackRose.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 31 && cont_lvl <= 35) {
            jLive.setValue(1750);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\Zamasu(Fusion).jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 36 && cont_lvl <= 40) {
            jLive.setValue(2000);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\Zamasu(Corrompido).jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 41 && cont_lvl <= 45) {
            jLive.setValue(2000);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\Jiren.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 46 && cont_lvl <= 50) {
            jLive.setValue(2000);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\Goku UI.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 51 && cont_lvl <= 55) {
            jLive.setValue(2000);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\JirenFP.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        } else if (cont_lvl >= 56 && cont_lvl <= 60) {
            jLive.setValue(2000);
            ImageIcon enemy_img = new ImageIcon("src\\main\\java\\images\\Goku MUI.jpg");
            Icon enemy = new ImageIcon(enemy_img.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            jLabel1.setIcon(enemy);
        }
        ImageIcon imagen = new ImageIcon("src\\main\\java\\images\\Strike.png");
        Icon strike = new ImageIcon(imagen.getImage().getScaledInstance(jStrike.getWidth(), jStrike.getHeight(), Image.SCALE_DEFAULT));
        jStrike.setIcon(strike);
        ImageIcon imagen1 = new ImageIcon("src\\main\\java\\images\\Blast.png");
        Icon blast = new ImageIcon(imagen1.getImage().getScaledInstance(jBlast.getWidth(), jBlast.getHeight(), Image.SCALE_DEFAULT));
        jBlast.setIcon(blast);
        ImageIcon imagen2 = new ImageIcon("src\\main\\java\\images\\Green.png");
        Icon green = new ImageIcon(imagen2.getImage().getScaledInstance(jGreen.getWidth(), jGreen.getHeight(), Image.SCALE_DEFAULT));
        jGreen.setIcon(green);
        ImageIcon imagen3 = new ImageIcon("src\\main\\java\\images\\SA.png");
        Icon SA = new ImageIcon(imagen3.getImage().getScaledInstance(jSA.getWidth(), jSA.getHeight(), Image.SCALE_DEFAULT));
        jSA.setIcon(SA);
        ImageIcon imagen4 = new ImageIcon("src\\main\\java\\images\\USA.png");
        Icon USA = new ImageIcon(imagen4.getImage().getScaledInstance(jUSA.getWidth(), jUSA.getHeight(), Image.SCALE_DEFAULT));
        jUSA.setIcon(USA);
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
        jStrike = new javax.swing.JButton();
        jBlast = new javax.swing.JButton();
        jGreen = new javax.swing.JButton();
        jSA = new javax.swing.JButton();
        jUSA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEquipo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLive = new javax.swing.JProgressBar();
        jPosicion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jVolver.setText("<-");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 49, -1));

        jStrike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStrikeActionPerformed(evt);
            }
        });
        jPanel1.add(jStrike, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 40, 60));

        jBlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlastActionPerformed(evt);
            }
        });
        jPanel1.add(jBlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 40, 60));

        jGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGreenActionPerformed(evt);
            }
        });
        jPanel1.add(jGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 40, 60));

        jSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSAActionPerformed(evt);
            }
        });
        jPanel1.add(jSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 40, 60));

        jUSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUSAActionPerformed(evt);
            }
        });
        jPanel1.add(jUSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 40, 60));

        jEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jEquipo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 180, 260));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 220, 380));
        jPanel1.add(jLive, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 220, 10));

        jPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel1.add(jPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 40, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        if (cont_lvl >= 1 && cont_lvl <= 20) {
            Historia h1 = new Historia();
            this.setVisible(false);
            h1.setVisible(true);
        } else if (cont_lvl >= 21 && cont_lvl <= 40) {
            Evento1 e1 = new Evento1();
            this.setVisible(false);
            e1.setVisible(true);
        } else if (cont_lvl >= 41 && cont_lvl <= 60) {
            Evento2 e2 = new Evento2();
            this.setVisible(false);
            e2.setVisible(true);
        }
    }//GEN-LAST:event_jVolverActionPerformed

    private void jStrikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStrikeActionPerformed
        jLive.setValue(jLive.getValue() - user.getEquipo().get(jPosicion.getSelectedIndex()).calculo_danio(0));
        if (jLive.getValue() <= 0 && cont_lvl <= 20) {
            if (items.get(0).isStock() == false) {
                try {
                    Item it = (Item) items.get(0).clone();
                    items.get(0).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(0).getNombre())) {
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(0).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 20 && cont_lvl <= 40) {
            if (items.get(1).isStock() == false) {
                try {
                    Item it = (Item) items.get(1).clone();
                    items.get(1).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(1).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(1).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 40 && cont_lvl <= 60) {
            if (items.get(2).isStock() == false) {
                try {
                    Item it = (Item) items.get(2).clone();
                    items.get(2).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(2).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(2).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        }
    }//GEN-LAST:event_jStrikeActionPerformed

    private void jBlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlastActionPerformed
        jLive.setValue(jLive.getValue() - user.getEquipo().get(jPosicion.getSelectedIndex()).calculo_danio(1));
        if (jLive.getValue() <= 0 && cont_lvl <= 20) {
            if (items.get(0).isStock() == false) {
                try {
                    Item it = (Item) items.get(0).clone();
                    items.get(0).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(0).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(0).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 20 && cont_lvl <= 40) {
            if (items.get(1).isStock() == false) {
                try {
                    Item it = (Item) items.get(1).clone();
                    items.get(1).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(1).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(1).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 40 && cont_lvl <= 60) {
            if (items.get(2).isStock() == false) {
                try {
                    Item it = (Item) items.get(2).clone();
                    items.get(2).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(2).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(2).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        }
    }//GEN-LAST:event_jBlastActionPerformed

    private void jGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGreenActionPerformed
        jLive.setValue(jLive.getValue() - user.getEquipo().get(jPosicion.getSelectedIndex()).calculo_danio(2));
        if (jLive.getValue() <= 0 && cont_lvl <= 20) {
            if (items.get(0).isStock() == false) {
                try {
                    Item it = (Item) items.get(0).clone();
                    items.get(0).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(0).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(0).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 20 && cont_lvl <= 40) {
            if (items.get(1).isStock() == false) {
                try {
                    Item it = (Item) items.get(1).clone();
                    items.get(1).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(1).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(1).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 40 && cont_lvl <= 60) {
            if (items.get(2).isStock() == false) {
                try {
                    Item it = (Item) items.get(2).clone();
                    items.get(2).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(2).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(2).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        }
    }//GEN-LAST:event_jGreenActionPerformed

    private void jSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSAActionPerformed
        jLive.setValue(jLive.getValue() - user.getEquipo().get(jPosicion.getSelectedIndex()).calculo_danio(3));
        if (jLive.getValue() <= 0 && cont_lvl <= 20) {
            if (items.get(0).isStock() == false) {
                try {
                    Item it = (Item) items.get(0).clone();
                    items.get(0).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(0).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(0).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 20 && cont_lvl <= 40) {
            if (items.get(1).isStock() == false) {
                try {
                    Item it = (Item) items.get(1).clone();
                    items.get(1).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(1).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(1).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 40 && cont_lvl <= 60) {
            if (items.get(2).isStock() == false) {
                try {
                    Item it = (Item) items.get(2).clone();
                    items.get(2).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(2).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(2).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        }
    }//GEN-LAST:event_jSAActionPerformed

    private void jUSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUSAActionPerformed
        jLive.setValue(jLive.getValue() - user.getEquipo().get(jPosicion.getSelectedIndex()).calculo_danio(4));
        if (jLive.getValue() <= 0 && cont_lvl <= 20) {
            if (items.get(0).isStock() == false) {
                try {
                    Item it = (Item) items.get(0).clone();
                    items.get(0).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(0).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(0).getNombre() + ": X" + items.get(0).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(0).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 20 && cont_lvl <= 40) {
            if (items.get(1).isStock() == false) {
                try {
                    Item it = (Item) items.get(1).clone();
                    items.get(1).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(1).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(1).getNombre() + ": X" + items.get(1).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(1).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        } else if (jLive.getValue() <= 0 && cont_lvl > 40 && cont_lvl <= 60) {
            if (items.get(2).isStock() == false) {
                try {
                    Item it = (Item) items.get(2).clone();
                    items.get(2).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                    JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(2).getNombre())) {
                        JOptionPane.showMessageDialog(null, "Has matado el enemigo");
                        JOptionPane.showMessageDialog(null, "Has recibido los siguientes objetos " + items.get(2).getNombre() + ": X" + items.get(2).getCantidad());
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(2).getCantidad());
                    }
                }
            }
            MenuPrincipal mp = new MenuPrincipal();
            this.setVisible(false);
            mp.setVisible(true);
        }
    }//GEN-LAST:event_jUSAActionPerformed

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
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlast;
    private javax.swing.JTable jEquipo;
    private javax.swing.JButton jGreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jLive;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jPosicion;
    private javax.swing.JButton jSA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jStrike;
    private javax.swing.JButton jUSA;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
