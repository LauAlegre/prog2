package ej2;

import ej3.Planta;

public class CondicionTitulo extends Condicion {
    private String titulo;

    public CondicionTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento d) {
        return titulo.equals(d.getTitulo());
    }

}
