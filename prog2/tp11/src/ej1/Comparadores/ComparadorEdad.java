package ej1.Comparadores;

import ej1.Socio;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        // Comparación por edad
        return Integer.compare(o1.getEdad(), o2.getEdad());
    }
}
