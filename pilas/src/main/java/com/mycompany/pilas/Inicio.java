package com.mycompany.pilas;

import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    private Pilas<String> historial = new Pilas<>();
    private Pilas<String> adelante = new Pilas<>();
    private String paginaActual;

    public Inicio() {
        initComponents();
        ahead.setEnabled(true);
        behind.setEnabled(true);
        paginaActual = "Inicio";
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
        if (!historial.isEmpty()) {
            adelante.push(paginaActual);
            paginaActual = historial.pop();
        }else{
            JOptionPane.showMessageDialog(null, "No hay más páginas atrás");
        }
    }//GEN-LAST:event_behindActionPerformed

    private void aheadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aheadActionPerformed
         JOptionPane.showInputDialog("Ingresar nombre del apartado: ");
         if (!historial.isEmpty()) {
            historial.push(paginaActual);
            paginaActual = adelante.pop();
        }else{
            JOptionPane.showMessageDialog(null, "No hay más páginas adelante");
        }
    }//GEN-LAST:event_aheadActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        historial.imprimir();
    }//GEN-LAST:event_historyActionPerformed

    private void currentPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPageActionPerformed
        JOptionPane.showMessageDialog(null, "Página actual: " + paginaActual);
    }//GEN-LAST:event_currentPageActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    /*
    mport javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HistorialNavegacion extends javax.swing.JFrame {
    private Pila<String> historial = new Pila<>();
    private Pila<String> adelante = new Pila<>();
    private String paginaActual;

    public HistorialNavegacion() {
        initComponents();
        btnAdelante.setEnabled(false);
        btnAtras.setEnabled(false);
        paginaActual = "Inicio"; // Página inicial
        actualizarTexto();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        JLabel jLabel1 = new JLabel("Simulador de Historial de Navegación");
        JButton btnAtras = new JButton("Atrás");
        JButton btnAdelante = new JButton("Adelante");
        JButton btnHistorial = new JButton("Historial Completo");
        JButton btnMostrarActual = new JButton("Mostrar Actual");
        JTextArea areaActual = new JTextArea(5, 30);
        areaActual.setEditable(false);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!historial.isEmpty()) {
                    adelante.push(paginaActual);
                    paginaActual = historial.pop();
                    actualizarTexto();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay más páginas atrás.");
                }
            }
        });

        btnAdelante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!adelante.isEmpty()) {
                    historial.push(paginaActual);
                    paginaActual = adelante.pop();
                    actualizarTexto();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay más páginas adelante.");
                }
            }
        });

        btnHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                historial.imprimir();
            }
        });

        btnMostrarActual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Página Actual: " + paginaActual);
            }
        });

        // Layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnAtras)
                    .addComponent(btnAdelante)
                    .addComponent(btnHistorial)
                    .addComponent(btnMostrarActual))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addComponent(btnAtras)
                .addComponent(btnAdelante)
                .addComponent(btnHistorial)
                .addComponent(btnMostrarActual)
        );

        pack();
    }

    private void actualizarTexto() {
        // Aquí puedes actualizar el área de texto o cualquier otro componente que necesites
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialNavegacion().setVisible(true);
            }
        });
    }
}
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ahead;
    private javax.swing.JButton behind;
    private javax.swing.JButton currentPage;
    private javax.swing.JButton history;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
