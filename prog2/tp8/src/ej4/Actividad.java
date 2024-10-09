package ej4;

import java.util.List;

public abstract class Actividad {
    public abstract int determinarTiempoEstimado();  // en minutos
    public abstract double determinarCosto();        // en unidades monetarias
    public abstract List<String> obtenerListaAcciones();  // Lista de acciones a realizar
    public abstract int contarTareasSimples();

    public static void main(String[] args) {
        TareaSimple ordenar = new TareaSimple("Ordenar", 100, 30);
        TareaSimple batir = new TareaSimple("Batir", 50, 20);
        TareaSimple descansar = new TareaSimple("Dejar descansar", 0, 10);
        TareaSimple hornear = new TareaSimple("Hornear", 150, 60);
        TareaSimple desmoldar = new TareaSimple("Desmoldar", 30, 5);

        // Crear una tarea compuesta llamada "Cocinar"
        TareaCompuesta cocinar = new TareaCompuesta("Cocina");
        cocinar.agregarActividad(batir);
        cocinar.agregarActividad(descansar);

        // Crear una tarea compuesta repetitiva que repite 3 veces
        TareaCompuestaRepetitiva receta = new TareaCompuestaRepetitiva(3);
        receta.agregarActividad(ordenar);
        receta.agregarActividad(cocinar);
        receta.agregarActividad(hornear);

        // Crear la tarea final que incluye la repetición y desmoldar
        TareaCompuesta hacerReceta = new TareaCompuesta("Receta");
        hacerReceta.agregarActividad(receta);
        hacerReceta.agregarActividad(desmoldar);

        // Calcular el tiempo, costo y acciones de la tarea final
        System.out.println("Tiempo total: " + hacerReceta.determinarTiempoEstimado() + " minutos");
        System.out.println("Costo total: " + hacerReceta.determinarCosto());
        System.out.println("Acciones a realizar: " + hacerReceta.obtenerListaAcciones());
    }
}
