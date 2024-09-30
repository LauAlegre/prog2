package ej2;

import java.util.Collections;
import java.util.List;

public class Computadora implements Comparable<Computadora> {
    private int id;
    private double velocidad;

    public Computadora(int id, double velocidad) {
        this.id = id;
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public int compareTo(Computadora otraComputadora) {
        // Ordenamos por velocidad de mayor a menor
        return Double.compare(this.velocidad, otraComputadora.getVelocidad());
    }

    public static List<Computadora> ordenarMayorAMenor(List<Computadora> computadoras) {
        Collections.sort(computadoras, Collections.reverseOrder()); // Ordenamos en orden inverso
        return computadoras;
    }
}
