package com.mycompany.ejercicioarbolbinario;

import javax.swing.JOptionPane;

public class EjercicioArbolBinario {
    
    //el propuesto por WhatsApp

    private Nodo raiz;

    public EjercicioArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int age, String name, String gender) {
        Nodo nuevoNodo = new Nodo(age, name, gender);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            insertarRecursivo(raiz, nuevoNodo);
        }
    }

    public void insertarRecursivo(Nodo actual, Nodo nuevoNodo) {
        if (nuevoNodo.getAge() >= 18) {
            if (actual.getIzquierda() == null) {
                actual.setIzquierda(nuevoNodo);
            } else {
                insertarRecursivo(actual.getIzquierda(), nuevoNodo);
            }
        } else {
            if (actual.getDerecha()== null) {
                actual.setDerecha(nuevoNodo);
            } else {
                insertarRecursivo(actual.getDerecha(), nuevoNodo);
            }
        }
    }

    public void imprimirInOrder(Nodo nodo) {
        if (nodo != null) {
            imprimirInOrder(nodo.getIzquierda());
            JOptionPane.showMessageDialog(null, 
            "Nombre: " + nodo.getName() + "\n"
            + "Edad: " + nodo.getAge() + "\n"
            + "Sexo: " + nodo.getGender());
            imprimirInOrder(nodo.getDerecha());
        }
    }
    
    public void imprimir(){
        imprimirInOrder(raiz);
    }
}
