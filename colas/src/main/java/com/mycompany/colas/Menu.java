
package com.mycompany.colas;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {

    Queue<Integer> lista = new LinkedList<>();
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        attendNext = new javax.swing.JButton();
        searchNext = new javax.swing.JButton();
        itsEmpty = new javax.swing.JButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Atención al cliente");
        tittle.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        add.setText("Agregar a la cola");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        attendNext.setText("Atender al siguiente");
        attendNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendNextActionPerformed(evt);
            }
        });

        searchNext.setText("Consultar al siguiente");
        searchNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNextActionPerformed(evt);
            }
        });

        itsEmpty.setText("¿Está vacía?");
        itsEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itsEmptyActionPerformed(evt);
            }
        });

        search.setText("Consultar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attendNext)
                    .addComponent(searchNext)
                    .addComponent(add)
                    .addComponent(itsEmpty))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(tittle)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tittle)
                .addGap(18, 18, 18)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attendNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itsEmpty)
                .addGap(36, 36, 36)
                .addComponent(search)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
    }//GEN-LAST:event_addActionPerformed

    private void attendNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendNextActionPerformed

    private void searchNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNextActionPerformed

    private void itsEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itsEmptyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itsEmptyActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        JOptionPane.showMessageDialog(null, "Los elementos de la lista son: " + lista);
    }//GEN-LAST:event_searchActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton attendNext;
    private javax.swing.JButton itsEmpty;
    private javax.swing.JButton search;
    private javax.swing.JButton searchNext;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
