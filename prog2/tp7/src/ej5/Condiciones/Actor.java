package ej5.Condiciones;

import ej5.Pelicula;

public class Actor extends Condicion {
    private String nombre;

    @Override
    public boolean cumple(Pelicula p) {
        return p.existeActor(nombre);
    }
}
