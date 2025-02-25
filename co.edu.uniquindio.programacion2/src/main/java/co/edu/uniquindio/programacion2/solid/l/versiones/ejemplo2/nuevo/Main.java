package co.edu.uniquindio.programacion2.solid.l.versiones.ejemplo2.nuevo;

import co.edu.uniquindio.programacion2.solid.l.versiones.ejemplo2.old.Audi;
import co.edu.uniquindio.programacion2.solid.l.versiones.ejemplo2.old.Coche;
import co.edu.uniquindio.programacion2.solid.l.versiones.ejemplo2.old.Mazda;
import co.edu.uniquindio.programacion2.solid.l.versiones.ejemplo2.old.Mercedes;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Mazda());
        listaCoches.add( new Audi());
        listaCoches.add( new Mercedes());
        listaCoches.add(new Mazda());
        imprimirNumAsientos(listaCoches);
    }

    public static void imprimirNumAsientos(List<Coche> listaCoches ){
        for (Coche coche : listaCoches) {
            System.out.println(coche.numAsientos());
        }
    }
}
