
package com.mycompany.ejercicioarbolbinario;


public class Nodo {
   private int age;
   private String name;
   private String gender;
   private Nodo izquierda;
   private Nodo derecha;

    public Nodo(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.derecha = null;
        this.izquierda = null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
}
