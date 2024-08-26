package ej3;

import java.util.ArrayList;
import java.util.List;


public class Juego {
    private List<Carta> cartas;
    private List<Jugador> jugadores;

    public Juego(MazoCartas mazo) {
        this.jugadores = new ArrayList<>();
        this.cartas = mazo.getCartas(); // Obtén la lista de cartas desde el mazo
    }

    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void repartirCartas() {

        if (cartas.size() < jugadores.size()) {
            System.out.println("No hay suficientes cartas para todos los jugadores.");
            return; // Sale del método si no hay suficientes cartas
        }

        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).addCarta(cartas.get(i)); // Asigna una carta al jugador
        }

        if (jugadores.size() == cartas.size()) {
            System.out.println("Todos los jugadores han recibido una carta.");
        } else {
            System.out.println("Cartas sobrantes: " + (cartas.size() - jugadores.size()));
        }
    }

    public String enfrentarPersonajes() {
        Jugador jugadorGanador = null;
        repartirCartas();

        // Inicialmente asumimos que el primer jugador es el ganador
        jugadorGanador = jugadores.get(0);

        for (int i = 1; i < jugadores.size(); i++) {
            Jugador jugadorActual = jugadores.get(i);

            if (jugadorActual.getCarta().getFuerza() > jugadorGanador.getCarta().getFuerza()) {
                jugadorGanador = jugadorActual;
            } else if (jugadorActual.getCarta().getFuerza() == jugadorGanador.getCarta().getFuerza()) {
                if (jugadorActual.getCarta().getVelocidad() > jugadorGanador.getCarta().getVelocidad()) {
                    jugadorGanador = jugadorActual;
                } else if (jugadorActual.getCarta().getVelocidad() == jugadorGanador.getCarta().getVelocidad()) {
                    // Aquí podrías añadir más criterios de desempate si es necesario
                    return "Empate";
                }
            }
        }

        return "El ganador es " + jugadorGanador.getNombre() + " con la carta: " + jugadorGanador.getCarta().getNombre();
    }










    public static void main(String[] args) {
        Carta carta1 = new Heroe("CHIMENEA", 34, 43, 190, 33, 34, 36, "carlos");
        Carta carta2 = new Heroe("PORRO", 34, 43, 190, 33, 33, 36, "carlos");
        Carta carta3 = new Villano("PEPE", 34, 43, 190, 33, 33, 36, "carlos");

        MazoCartas mazoCarta = new MazoCartas();
        mazoCarta.addCarta(carta1);
        mazoCarta.addCarta(carta2);
        mazoCarta.addCarta(carta3);

        Jugador jugador1 = new Jugador("lauta", 0);
        Jugador jugador2 = new Jugador("fran", 0);
        Jugador jugador3 = new Jugador("papu", 0);

        Juego jugar = new Juego(mazoCarta); // Pasa el mazo de cartas al juego

        jugar.addJugador(jugador1);
        jugar.addJugador(jugador2);
        jugar.addJugador(jugador3);

        System.out.println(jugar.enfrentarPersonajes());
    }
}
