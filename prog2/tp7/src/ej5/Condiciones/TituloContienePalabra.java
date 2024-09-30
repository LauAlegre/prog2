package ej5.Condiciones;

import ej5.Pelicula;

public class TituloContienePalabra extends Condicion {
    private String palabra;

    @Override
    public boolean cumple(Pelicula p) {
        return p.getTitulo().contains(palabra);
    }
}
