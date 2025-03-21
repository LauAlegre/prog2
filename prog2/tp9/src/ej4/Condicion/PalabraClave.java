package ej4.Condicion;

import ej4.Noticia;

public class PalabraClave extends Condicion{
    private String palabra;
    public PalabraClave(String palabra){
        this.palabra = palabra;

    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.contienePalabrasClave(this.palabra);
    }
}
