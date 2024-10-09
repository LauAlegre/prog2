package ej3;

import java.util.ArrayList;
import java.util.List;

public class Tripulacion  extends ComponentePersonaje{
    private List<Personaje>personajes;
    private String tipoTripulacion;//pirata o militares

    public Tripulacion(String nombre, double peso, int edad) {
        super(nombre, peso, edad);
        personajes = new ArrayList<Personaje>();
    }
    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
    public int getCantidadPersonajes(){
        return personajes.size();
    }

    @Override
        public double calcularFuerza() {
        double fuerzaTotal = 0;
        for (Personaje personaje : personajes) {
            fuerzaTotal += personaje.calcularFuerza();
        }
        return fuerzaTotal;
    }

    @Override
    public double calcularPeso() {
        return personajes.get(0).getPeso();
    }

    @Override
    public int calcularEdad() {
        int mayorEdad = 0;
        for (Personaje personaje : personajes) {
            if (personaje.getEdad() > mayorEdad) {
                mayorEdad = personaje.getEdad();
            }
        }
        return mayorEdad;
    }

}
