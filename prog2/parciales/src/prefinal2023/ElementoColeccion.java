package prefinal2023;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoColeccion {
    private String nombre;
    public ElementoColeccion(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract int getAnio();
    public abstract double getPrecio();
    public abstract int getPeso();
    public abstract boolean pertenece(ObjetoColecion c);
    protected abstract ArrayList<ObjetoColecion> getLista(Condicion c);
    public abstract int contElementos();

    public ArrayList<ObjetoColecion> ListaOrdenada(Condicion c, Comparator<ObjetoColecion> comp) {
        ArrayList<ObjetoColecion> lista = getLista(c);
        Collections.sort(lista,comp);
        return lista;
    }


}
