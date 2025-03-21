package Parcial2023;



import Parcial2023.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Elemento extends ElementoAalquiler implements Comparable<Elemento> {
    private int antiguedad;
    private String descripcion;
    private double valor;

    public Elemento(int id, int antiguedad, String descripcion, double valor) {
        super(id);
        this.antiguedad = antiguedad;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public int getAntiguedad() {
        return this.antiguedad;
    }

    @Override
    public List<Elemento> buscar(Condicion c) {
        List<Elemento> elementos = new ArrayList<>();
        if(c.Cumple(this)){
            elementos.add(this);
        }
        return elementos;
    }


    public boolean isPromocion(Condicion c) {
        return c.Cumple(this);
    }


    public int compareTo(Elemento otro) {
        // Comparar primero por antigüedad (mayor antigüedad primero)
        int comparacionAntiguedad = Integer.compare(otro.getAntiguedad(), this.getAntiguedad());

        if (comparacionAntiguedad != 0) {
            return comparacionAntiguedad;
        }

        // Si la antigüedad es la misma, comparar por valor (menor valor primero)
        return Double.compare(this.getValor(), otro.getValor());
    }

}
