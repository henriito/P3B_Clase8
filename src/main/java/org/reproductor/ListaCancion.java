package org.reproductor;

import org.Listas.Nodo;

import java.util.Scanner;

public class ListaCancion {
    public NodoMusic primero;

    public ListaCancion(){
        primero = null;
    }

    private Cancion cancion(){
        System.out.println("Ingrese nombre de ubicacion");

    }
    private Cancion leerCancion(){
        Cancion c = new Cancion();
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese nombre de la cancion y coloque fin para terminar.");
        c.NombreCancion = t.nextLine();
        //return  (new Scanner(System.in).nextLine()).toString();
    }

    public ListaCancion crearLista(){
        Cancion x;
        NodoMusic nc = new NodoMusic();
        primero = null;
        do{
            x = leerCancion();
            if(x.getNombreCancion() != "fin"){
                primero = new NodoMusic(x,primero);
            }
        }while(x.getNombreCancion() != "fin");
        return this;
    }
}
