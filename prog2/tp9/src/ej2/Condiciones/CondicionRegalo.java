package ej2.Condiciones;

import ej2.Carta;
import ej2.ComponentePrincipal;

public class CondicionRegalo extends Condicion{
    private String condicion;
    public CondicionRegalo(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Carta c) {
        return c.contieneRegalo(condicion);
    }
}
