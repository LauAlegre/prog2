package ej3.Condiciones;

import ej3.Planta;



public class NombreVulgar extends Condicion{
    private String nombre;

    public NombreVulgar(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.existeNombreVulgar(this.nombre);
    }
}
