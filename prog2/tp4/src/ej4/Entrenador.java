package ej4;

import java.time.LocalDate;
import java.util.Date;

public class Entrenador extends Persona{
        private String federacion;

    public Entrenador(String nombre, LocalDate fechaNacimiento, int nroPasaporte, String federacion) {
        super(nombre, fechaNacimiento, nroPasaporte);
        this.federacion = federacion;
    }
}

