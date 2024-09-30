package ej3.Condiciones;

import ej3.Planta;

public class ContienePalabra extends Condicion {
private String palabra;
public ContienePalabra(String palabra) {
    this.palabra = palabra;
}
    @Override
    public boolean cumple(Planta planta) {
        return planta.getNombreCientifico().contains(palabra);
    }
}
