package ej2;

import ej3.Planta;

public class CondicionNoPalabraClave extends Condicion {
    private String palabraClave;
    public CondicionNoPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }
    @Override
    public boolean cumple(Documento documento) {
        return !documento.existePalabrasClave(this.palabraClave);
    }
}
