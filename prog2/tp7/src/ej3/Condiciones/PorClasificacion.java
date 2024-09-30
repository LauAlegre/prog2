package ej3.Condiciones;

import ej3.Planta;

public class PorClasificacion extends Condicion{
    private String clasificacion;
    public PorClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    @Override
    public boolean cumple(Planta planta) {
        return planta.getClasificacionSuperior().equals(this.clasificacion);
    }
}
