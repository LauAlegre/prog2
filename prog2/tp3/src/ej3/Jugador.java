package ej3;

import java.util.List;

public class Jugador {
    private String nombre;
    private int partidasGanadas;
    private Carta carta; // Cambia MazoCartas por Carta


    public Jugador(String nombre, int partidasGanadas) {
        this.nombre = nombre;
        this.partidasGanadas = 0;
        this.carta = null;


    }
    public String getNombre() {
        return nombre;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void sumarVictoria (){
        partidasGanadas += 1;
    }

    public void addCarta(Carta carta){
        this.carta = carta;
    }

    public Carta getCarta() {
        return carta;
    }




}
