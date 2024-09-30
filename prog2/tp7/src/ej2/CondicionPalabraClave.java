package ej2;

import ej3.Planta;

public class CondicionPalabraClave extends Condicion {
    private String palabraClave;
    public CondicionPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }
    @Override
    public boolean cumple(Documento documento) {
        return documento.existePalabrasClave(this.palabraClave);
    }
}
