package com.mycompany.pilas;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    Pilas<String> objeto = new Pilas<>();
    String historial = "";

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        behind = new javax.swing.JButton();
        ahead = new javax.swing.JButton();
        history = new javax.swing.JButton();
        currentPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Pilas");

        behind.setText("Atrás");
        behind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                behindActionPerformed(evt);
            }
        });

        ahead.setText("Adelante");
        ahead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aheadActionPerformed(evt);
            }
        });

        history.setText("Historial");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        currentPage.setText("Página actual");
        currentPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(tittle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(behind)
                            .addComponent(history))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentPage)
                            .addComponent(ahead))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tittle)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(behind)
                    .addComponent(ahead))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(history)
                    .addComponent(currentPage))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void behindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_behindActionPerformed
        objeto.pop();
        historial+="\n"+objeto.peek();
    }//GEN-LAST:event_behindActionPerformed

    private void aheadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aheadActionPerformed
        String newPage = JOptionPane.showInputDialog("Dirigirse a la pàgina: ");
        objeto.push(newPage);
        historial += "\n"+newPage;
    }//GEN-LAST:event_aheadActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        JOptionPane.showMessageDialog(rootPane, historial);
    }//GEN-LAST:event_historyActionPerformed

    private void currentPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPageActionPerformed
        if (objeto.isEmpty()) {
            objeto.push("Index");
            historial += "\n" + "Index";
        }
        JOptionPane.showMessageDialog(rootPane, "Te encuentras en: " + objeto.peek());
    }//GEN-LAST:event_currentPageActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ahead;
    private javax.swing.JButton behind;
    private javax.swing.JButton currentPage;
    private javax.swing.JButton history;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
