package ej2.Condiciones;

import ej2.Carta;

public class CondicionNinioMalo extends Condicion {
    @Override
    public boolean cumple(Carta c) {
        return c.contieneRegalo(Carta.REGALOMALO);  // Verificar si es un niño malo (recibió carbón)
    }

}
