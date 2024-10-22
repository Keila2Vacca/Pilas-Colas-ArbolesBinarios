package com.mycompany.colas;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Colas {

    Queue<Integer> lista;

    public Colas(Queue<String> lista) {
        lista = new LinkedList<>();
    }
    
    public void agregarCliente(){
        int elemento = validateIntInput(JOptionPane.showInputDialog("Ingrese el número del elemento"));
        lista.add(elemento);
    }
    
    public int validateIntInput(String str) {
        while (isNumber(str) == false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero:");
        }
        return Integer.parseInt(str);
    }

    public static boolean isNumber(String strNum) {
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

}
