package ej4;

import ej4.Condicion.Condicion;

import java.util.List;

public abstract class CompNoticiaPrincipal {
    public abstract int contarNoticias();
    public abstract List <Noticia> buscar(Condicion cond);

}
