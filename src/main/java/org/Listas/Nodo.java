package org.Listas;

public class Nodo {
    int Dato;
    Nodo enlace;

    public Nodo(int x) {
        Dato = x;
        enlace = null;
    }

    public Nodo(int x, Nodo n){
        Dato = x;
        enlace = n;
    }

    public int getDato(){
        return Dato;
    }

    public Nodo getEnlace(){
        return enlace;
    }

    public void setEnlace(Nodo n){
        enlace = n;
    }


}

