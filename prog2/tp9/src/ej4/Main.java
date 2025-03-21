package ej4;

import ej4.Condicion.Autor;
import ej4.Condicion.LargoTexto;
import ej4.Condicion.PalabraClave;
import ej4.Condicion.Titulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear contenedores principales
        ContenedorNoticia deportes = new ContenedorNoticia("Deportes", "deportes.png");
        ContenedorNoticia politica = new ContenedorNoticia("Política", "politica.png");

        // Crear subcontenedor
        ContenedorNoticia futbol = new ContenedorNoticia("Fútbol", "futbol.png");
        deportes.addSubContenedor(futbol);

        // Crear noticias
        List<String> palabrasClave1 = List.of("fútbol", "goleada");
        Noticia noticia1 = new Noticia("Partido Histórico", "Juan Pérez", "Introducción...", "Un partido increíble...", palabrasClave1, "link1.com");

        List<String> palabrasClave2 = List.of("elecciones", "debate");
        Noticia noticia2 = new Noticia("Elecciones en curso", "María López", "Introducción...", "Se lleva a cabo el debate presidencial...", palabrasClave2, "link2.com");

        List<String> palabrasClave3 = List.of("fútbol", "derrota");
        Noticia noticia3 = new Noticia("Derrota aplastante", "Juan Pérez", "Introducción...", "El equipo local fue derrotado...", palabrasClave3, "link3.com");

        // Agregar noticias a los contenedores
        deportes.addNoticia(noticia1);
        politica.addNoticia(noticia2);
        futbol.addNoticia(noticia3);

        // Crear condiciones de búsqueda
        LargoTexto condicionLargo = new LargoTexto(20);
        Autor condicionAutor = new Autor("Juan Pérez");
        PalabraClave condicionPalabra = new PalabraClave("fútbol");
        Titulo condicionTitulo = new Titulo("Partido Histórico");

        // Buscar noticias
        System.out.println("Buscar noticias con texto mayor a 20 caracteres:");
        List<Noticia> resultadoLargo = deportes.buscar(condicionLargo);
        imprimirNoticias(resultadoLargo);

        System.out.println("\nBuscar noticias del autor 'Juan Pérez':");
        List<Noticia> resultadoAutor = deportes.buscar(condicionAutor);
        imprimirNoticias(resultadoAutor);

        System.out.println("\nBuscar noticias que contienen la palabra clave 'fútbol':");
        List<Noticia> resultadoPalabra = deportes.buscar(condicionPalabra);
        imprimirNoticias(resultadoPalabra);

        System.out.println("\nBuscar noticias con el título 'Partido Histórico':");
        List<Noticia> resultadoTitulo = deportes.buscar(condicionTitulo);
        imprimirNoticias(resultadoTitulo);
    }

    // Método auxiliar para imprimir las noticias
    private static void imprimirNoticias(List<Noticia> noticias) {
        if (noticias.isEmpty()) {
            System.out.println("No se encontraron noticias.");
        } else {
            for (Noticia noticia : noticias) {
                System.out.println("Título: " + noticia.getTitulo() + ", Autor: " + noticia.getAutor() + ", Texto: " + noticia.getTexto());
            }
        }
    }
}

