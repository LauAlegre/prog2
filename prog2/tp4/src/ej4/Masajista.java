package ej4;

import java.time.LocalDate;
import java.util.Date;

public class Masajista extends Persona{
    private double aniosEsperiencia;
    private String tituloProfecional;
    public Masajista(String nombre, LocalDate fechaNacimiento, int nroPasaporte, double aniosEsperiencia, String tituloProfecional) {
        super(nombre, fechaNacimiento, nroPasaporte);
        this.aniosEsperiencia = aniosEsperiencia;
        this.tituloProfecional = tituloProfecional;
    }
}

