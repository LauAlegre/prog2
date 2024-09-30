package ej3.Condiciones;

import ej3.Planta;

public class RiegoMenor extends Condicion {
    private int riego;

    public RiegoMenor(int riego) {
        this.riego = riego;
    }
    public boolean cumple(Planta planta){
        return planta.getRiego()<=this.riego;
    }
}
