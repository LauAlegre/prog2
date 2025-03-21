package ej1.Comparadores;

import ej1.Socio;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Comparator<Socio> comparador1, comparador2;
    public ComparadorCompuesto(Comparator<Socio> comparador1, Comparator<Socio> comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }
    @Override
    public int compare(Socio o1, Socio o2) {
        int resultado = comparador1.compare(o1, o2);
        if (resultado == 0) {
            return comparador2.compare(o1, o2);
        }
        return resultado;
    }
}
