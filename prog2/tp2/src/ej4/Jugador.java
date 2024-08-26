package ej4;

public class Jugador {
    private String nombre;
    private int telefono;
    private int turnosJugados;
    private char juego;

    public Jugador(String nombre, int turnosJugados, int telefono, char juego) {
                this.nombre = nombre;
                this.turnosJugados = turnosJugados;
                this.telefono = telefono;
                this.juego = juego;
    }
    public String getNombre() {
        return this.nombre;
    }

    public int getTurnosJugados() {
        return this.turnosJugados;
    }
    public char getJuego() {
        return this.juego;
    }
    public int getTurnos() {
        return this.turnosJugados;
    }

}

