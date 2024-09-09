package ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jardin {
    private List <Planta> plantas;
    public Jardin() {
        plantas = new ArrayList<>();
    }

    public void agregarPlanta(String nombreCientifico, String nombre, String paisOrigen, LocalDate fechaCompra) {
        Planta nuevaPlanta = new Planta(fechaCompra,paisOrigen,nombreCientifico,nombre);
        plantas.add(nuevaPlanta);
        System.out.println("Nueva planta añadida: " + nuevaPlanta);
    }


    public void listarPlantas() {
        if (plantas.isEmpty()) {
            System.out.println("No hay plantas en el jardín.");
        } else {
            System.out.println("Listado de Plantas en el Jardín:");
            for (Planta planta : plantas) {
                System.out.println(planta);
            }
        }
    }

    public static void main(String[] args) {

        Jardin jardin = new Jardin();


        jardin.agregarPlanta("Rosa rubiginosa", "Rosa mosqueta", "Chile", LocalDate.of(2023, 5, 20));
        jardin.agregarPlanta("Eucalyptus globulus", "Eucalipto", "Australia", LocalDate.of(2024, 1, 15));


        jardin.listarPlantas();
    }

}
