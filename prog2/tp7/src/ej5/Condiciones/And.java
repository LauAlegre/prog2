package ej5.Condiciones;

import ej5.Pelicula;

public class And extends Condicion {
    private Condicion c1;
    private Condicion c2;
    public And(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return c1.cumple(p) && !c2.cumple(p);
    }
}
