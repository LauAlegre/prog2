package ej5.Condiciones;

import ej5.Pelicula;

public class NoDirector extends Condicion {
    private String director;
    public NoDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return director.equals(p.getDirector());
    }
}
