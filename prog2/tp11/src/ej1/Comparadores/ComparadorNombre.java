package ej1.Comparadores;

import ej1.Socio;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getNombreApellido().compareTo(o2.getNombreApellido());
    }
}
