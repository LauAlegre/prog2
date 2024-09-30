package ej3.Condiciones;

import ej3.Planta;

public class SolSuperiorRiegoInferiror extends Condicion {
    private int riego;
    private int sol;

    public SolSuperiorRiegoInferiror(int sol, int riego) {
        this.sol = sol;
        this.riego = riego;
    }

    @Override
    public boolean cumple(Planta planta) {
        return this.sol>=planta.getSol() && this.riego<planta.getRiego();
    }
}
