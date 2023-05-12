/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.app_gacha;

import static com.mycompany.app_gacha.Main.cont;
import static com.mycompany.app_gacha.Main.items;
import static com.mycompany.app_gacha.Main.user;
import com.mycompany.dominio.Item;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joseb
 */
public class Tienda3 extends javax.swing.JFrame {

    /**
     * Creates new form TiendaPrincipal
     */
    public Tienda3() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        String[] datos = new String[4];
        ArrayList<String> id_item = new ArrayList<String>();
        //Datos a mostrar en el jTable
        for (int i = 3; i < items.size(); i++) {
            datos[0] = String.valueOf(items.get(i).getId_item());
            datos[1] = items.get(i).getNombre();
            datos[2] = String.valueOf(items.get(i).getCantidad());
            datos[3] = "2";
            modelo.addRow(datos);
        }
        jEquipo.setModel(modelo);
        //Datos a en el jComboBox
        DefaultComboBoxModel mod = new DefaultComboBoxModel();
        int j = 0;
        for (int i = 3; i < items.size(); i++) {
            id_item.add(String.valueOf(items.get(i).getId_item()));
            mod.addElement(id_item.get(j));
            j++;
        }
        jComboItem.setSelectedItem(id_item.get(0));
        jComboItem.setModel(mod);
        jLabel3.setText("Tienes: " + user.getItems().get(2).getCantidad() + user.getItems().get(2).getNombre());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jEquipo = new javax.swing.JTable();
        jComboItem = new javax.swing.JComboBox<>();
        jComboCantidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComprar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jEquipo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 630, 310));

        jComboItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        jComboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jComboCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        jLabel1.setText("Item:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jComprar.setText("Comprar");
        jComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprarActionPerformed(evt);
            }
        });
        jPanel1.add(jComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        jButton1.setText("<-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComprarActionPerformed
        int index = jComboItem.getSelectedIndex() + 3;
        int precio = (2 * (jComboCantidad.getSelectedIndex() + 1));
        if (user.getItems().get(2).getCantidad() > 1 && (precio <= user.getItems().get(2).getCantidad())) {
            user.getItems().get(2).setCantidad(user.getItems().get(2).getCantidad() - precio);
            if (items.get(index).isStock() == false) {
                try {
                    Item it = (Item) items.get(index).clone();
                    items.get(index).setStock(true);
                    it.setId_item(cont++);
                    user.getItems().add(it);
                    JOptionPane.showMessageDialog(null, "Compra exitosa");
                    JOptionPane.showMessageDialog(null, "Nuevo item");
                    jLabel3.setText("Tienes: " + user.getItems().get(2).getCantidad() + user.getItems().get(2).getNombre());
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } else {
                for (int i = 0; i < user.getItems().size(); i++) {
                    if (user.getItems().get(i).getNombre().equals(items.get(index).getNombre())) {
                        user.getItems().get(i).setCantidad(user.getItems().get(i).getCantidad() + items.get(index).getCantidad());
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        jLabel3.setText("Tienes: " + user.getItems().get(2).getCantidad() + user.getItems().get(2).getNombre());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficientes " + user.getItems().get(2).getNombre());
        }
    }//GEN-LAST:event_jComprarActionPerformed

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
            java.util.logging.Logger.getLogger(Tienda3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboCantidad;
    private javax.swing.JComboBox<String> jComboItem;
    private javax.swing.JButton jComprar;
    private javax.swing.JTable jEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}