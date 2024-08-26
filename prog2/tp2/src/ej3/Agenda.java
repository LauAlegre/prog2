package ej3;
import ej2.Reunion;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Reunion> reuniones;

    public Agenda(Reunion reunion1) {
        this.reuniones = new ArrayList<>();
        this.reuniones.add(reunion1); // Agregamos la primera reunión
    }

    public void agregarReunion(Reunion reunion) {
        this.reuniones.add(reunion);
    }

    // Nuevo método para mostrar una reunión específica
    public void mostrarReunion(Reunion reunion){
        System.out.println("Ubicación: " + reunion.getUbicacion());
        System.out.println("Tema: " + reunion.getTema());
        System.out.println("Participantes: " + reunion.getParticipantes());
        System.out.println("Inicio: " + reunion.getInicio());
        System.out.println("----------------------------");
    }
}
