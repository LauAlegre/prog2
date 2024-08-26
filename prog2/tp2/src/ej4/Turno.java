package ej4;
import java.util.ArrayList;
import java.util.List;
public class Turno {
    private List<Jugador>jugadores;
    private int canTurnos;
    private double valorPadel;
    private double valorFutbol;
    private double descuento;
    public Turno() {
        this.jugadores = new ArrayList<Jugador>();
        canTurnos = 4;
        valorPadel = 100;
        valorFutbol = 400;
        descuento = 0.10;
    }

    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public double reservarTurno(){
        double total = 0;
        double descuento = 0;
        for(Jugador j : jugadores){
            if(j.getJuego() == 'P'){
                if(j.getTurnos() >= this.canTurnos){
                    descuento = this.valorPadel * this.descuento;
                    total += this.valorPadel-descuento;
                }else {
                    total += this.valorPadel;
                }
            }else{
                if(j.getTurnos() >= this.canTurnos){
                    descuento = this.valorFutbol * this.descuento;
                    total += this.valorFutbol-descuento;
                }else {
                    total += this.valorFutbol;
                }
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Turno turno = new Turno();

        // Agregar jugadores
        turno.agregarJugador(new Jugador("Juan", 5, 123456789, 'F'));
        turno.agregarJugador(new Jugador("Ana", 3, 987654321, 'F'));
        turno.agregarJugador(new Jugador("Pedro", 4, 555555555, 'F'));
        turno.agregarJugador(new Jugador("Lucia", 6, 111111111, 'F'));

        // Calcular el total con descuentos aplicados
        double total = turno.reservarTurno();
        System.out.println("El total a pagar por los turnos es: " + total);

    }
}

