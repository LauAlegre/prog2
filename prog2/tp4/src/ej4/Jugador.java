package ej4;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Jugador extends Persona{
    private String posicion;
    private char pieHabil;
    private int CantGoles;

    public Jugador(String nombre, LocalDate fechaNacimiento, int nroPasaporte, String posicion, char pieHabil, int CantGoles) {
        super(nombre, fechaNacimiento, nroPasaporte);
        this.posicion = posicion;
        this.pieHabil = pieHabil;
        this.CantGoles = CantGoles;
    }

    public String getPosicion() {
        return posicion;
    }

    public char getPieHabil() {
        return pieHabil;
    }

    public int getCantGoles() {
        return CantGoles;
    }
    public int setCantGoles(int cantGoles) {
        return cantGoles;
    }
}

