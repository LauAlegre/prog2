package ej2;
import ej3.Agenda;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Juan Perez", "555-1234", "juan@example.com");
        Contacto contacto2 = new Contacto("Maria Garcia", "555-5678", "maria@example.com");

        Reunion reunion1 = new Reunion(
                "Reunión de Proyecto",
                Arrays.asList(contacto1, contacto2),
                "Sala A",
                LocalDateTime.of(2024, 8, 19, 10, 0),
                Duration.ofHours(2)
        );

        Agenda agenda = new Agenda(reunion1);

        // Usar el método mostrarReunion con reunion1
        agenda.mostrarReunion(reunion1);
    }
}


