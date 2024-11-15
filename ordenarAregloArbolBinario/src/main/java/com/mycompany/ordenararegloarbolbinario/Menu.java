package com.mycompany.ordenararegloarbolbinario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    OrdenarAregloArbolBinario arbol = new OrdenarAregloArbolBinario();

    Random random = new Random();
    ArrayList<Integer> arreglo = new ArrayList();
    int generated;

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        add = new javax.swing.JButton();
        tree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Ejercicio");

        search.setText("Consultar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        add.setText("Agregar ");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        tree.setText("Árbol");
        tree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittle)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(tree)
                .addGap(35, 35, 35)
                .addComponent(search)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tittle)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(add)
                    .addComponent(tree))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        arbol.recorrerInOrden();
    }//GEN-LAST:event_searchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int amount = validateIntInput(JOptionPane.showInputDialog(rootPane, "Ingrese la cantidad de valores a agregar al arreglo:"));

        for (int i = 0; i < amount; i++) {
            do {
                generated = (random.nextInt(99) + 1);
            } while (generated % 2 != 0);
            arreglo.add(generated);
        }
        JOptionPane.showMessageDialog(null, "Valores agregados con éxito");
    }//GEN-LAST:event_addActionPerformed

    private void treeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treeActionPerformed
         long startTime = new Date().getTime();
        for (Integer integer : arreglo) {
            arbol.insertar(integer);
        }
        long finishTime = new Date().getTime();
        JOptionPane.showMessageDialog(null, "Esta acción tardó "+ (finishTime-startTime) +" milisegundos en realizarse");
    }//GEN-LAST:event_treeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public int validateIntInput(String str) {
        while (isNumeric(str) == false) {
            str = JOptionPane.showInputDialog(rootPane, "Ingrese un número ENTERO válido (sin espacios):");
        }
        return Integer.parseInt(str);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton search;
    private javax.swing.JLabel tittle;
    private javax.swing.JButton tree;
    // End of variables declaration//GEN-END:variables
}
