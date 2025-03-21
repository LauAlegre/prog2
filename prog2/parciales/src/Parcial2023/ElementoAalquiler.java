package Parcial2023;

import Parcial2023.Condiciones.Condicion;

import java.util.List;

public abstract class ElementoAalquiler  {
    private int id;
    public ElementoAalquiler(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public abstract double getValor();
    public abstract int getAntiguedad();
    public abstract List<Elemento> buscar(Condicion c);
    public abstract boolean isPromocion(Condicion c);





}
