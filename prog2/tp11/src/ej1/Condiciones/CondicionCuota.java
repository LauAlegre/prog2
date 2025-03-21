package ej1.Condiciones;

import ej1.Socio;

public class CondicionCuota extends Condicion {

    @Override
    public boolean cumple(Socio socio) {
        return socio.isPagoCuota();
    }
}
