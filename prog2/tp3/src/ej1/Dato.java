package ej1;

import java.util.ArrayList;
import java.util.List;

public class Dato {
    private List<Encuesta> encuestas;

    public Dato() {
        this.encuestas = new ArrayList<>();
    }

    public List<Encuesta> getEncuestas() {
        return encuestas;
    }

    public void addEncuesta(Encuesta encuesta) {
        // Obtener el DNI y el nombre de la encuesta a verificar
        int dniEncuesta = encuesta.getDni_encuestado();
        String nombreEncuesta = encuesta.getNombreEncuesta();

        // Verificar si ya existe una encuesta con el mismo título para el mismo DNI
        for (Encuesta e : encuestas) {
            if (e.getDni_encuestado() == dniEncuesta && e.getNombreEncuesta().equals(nombreEncuesta)) {
                System.out.println("Error: La persona con DNI " + dniEncuesta + " ya ha realizado la encuesta \"" + nombreEncuesta + "\".");
                return; // Salir del método si ya existe una encuesta con el mismo nombre y DNI
            }
        }

        // Si no se encontró ningún duplicado, agregar la nueva encuesta
        encuestas.add(encuesta);
        encuesta.getEmpleado().incrementarEncuesta();

        System.out.println("Encuesta agregada exitosamente.");
    }




        public static void main(String[] args) {
            Dato dato = new Dato();

            // Crear instancias de Empleado
            Empleado empleado1 = new Empleado("Carlos", 30);
            Empleado empleado2 = new Empleado("Ana", 28);

            // Crear instancias de Pregunta
            Pregunta pregunta1 = new Pregunta("¿Cómo calificaría nuestro servicio?", true);
            Pregunta pregunta2 = new Pregunta("¿Recomendaría nuestro producto a otros?", false);
            Pregunta pregunta3 = new Pregunta("¿Qué mejorarías en nuestro servicio?", true);

            // Crear instancias de Encuesta
            Encuesta encuesta1 = new Encuesta("Encuesta de Satisfacción", 12345678, empleado1);
            Encuesta encuesta2 = new Encuesta("Encuesta de Opinión", 87654321, empleado2);
            Encuesta encuesta3 = new Encuesta("Encuesta de Satisfacción", 12345678, empleado1); // Mismo DNI y título

            // Agregar preguntas a las encuestas
            encuesta1.addPregunta(pregunta1);
            encuesta1.addPregunta(pregunta2);

            encuesta2.addPregunta(pregunta3);

            // Intentar agregar encuestas al objeto Dato
            dato.addEncuesta(encuesta1); // Esperado: Agregada exitosamente
            dato.addEncuesta(encuesta2); // Esperado: Agregada exitosamente
            dato.addEncuesta(encuesta3); // Esperado: Error (DNI y título duplicados)

            // Mostrar el número de encuestas realizadas por cada empleado
            System.out.println("Número de encuestas realizadas por cada empleado:");
            System.out.println(empleado1.getNombre() + ": " + empleado1.getCantEncuestas());
            System.out.println(empleado2.getNombre() + ": " + empleado2.getCantEncuestas());




        }
    }



