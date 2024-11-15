

package com.mycompany.ordenararegloarbolbinario;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class OrdenarAregloArbolBinario {
    /*valores menores a izquierda y mayores a la derecha
    se recorre inOrden
    busque eficiente por O(Log n)*/
    
    Nodo raiz;

     
    public OrdenarAregloArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        
      if (valor < actual.getValor()) {
            actual.setIzquierda(insertarRecursivo(actual.getIzquierda(), valor));
        } else if (valor > actual.getValor()) {
            actual.setDerecha(insertarRecursivo(actual.getDerecha(), valor));
        }

        return actual;
    }

    public void recorrerInOrden() {
        ArrayList<Integer> arrPrint = new ArrayList();
        recorrerInOrdenRecursivo(raiz, arrPrint);
        JOptionPane.showMessageDialog(null, arrPrint.toString());
    }

    private void recorrerInOrdenRecursivo(Nodo nodo, ArrayList<Integer> arrPrint) {
        
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.getIzquierda(), arrPrint);
            arrPrint.add(nodo.getValor());
            recorrerInOrdenRecursivo(nodo.getDerecha(), arrPrint);
        }
    }
}
