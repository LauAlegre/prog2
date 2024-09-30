package ej5.Condiciones;

import ej5.Pelicula;

public class Genero extends Condicion {
    private String genero;
    public Genero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return p.existeGenero(genero);
    }
}
