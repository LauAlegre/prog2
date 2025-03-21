package ej4.Condicion;

import ej4.Noticia;

public class LargoTexto extends Condicion{
    private int largo;
    public LargoTexto(int largo){
        this.largo = largo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTexto().length()>this.largo ;
    }
}
