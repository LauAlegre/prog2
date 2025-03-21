package ej4.Condicion;

import ej4.Noticia;

public class Titulo extends Condicion{
    private String titulo;
    public Titulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().equals(titulo);
    }
}
