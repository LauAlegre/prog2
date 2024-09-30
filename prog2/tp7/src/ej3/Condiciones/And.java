package ej3.Condiciones;

import ej3.Planta;

public class And extends Condicion{
private Condicion c1;
private Condicion c2;
    public And(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public boolean cumple(Planta planta) {
        return this.c1.cumple(planta) && this.c2.cumple(planta);
    }
}
