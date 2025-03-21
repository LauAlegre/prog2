package ej4.Condicion;

import ej4.Noticia;

public class Autor extends Condicion {
    private String autor;
    public Autor(String autor) {
        this.autor = autor;
    }


    @Override
    public boolean cumple(Noticia noticia) {
        return this.autor.equals(noticia.getAutor());
    }
}
