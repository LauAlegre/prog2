package ej1;

import java.time.LocalDate;

public class SistemaArchivos {
    public static void main(String[] args) {
        // Crear archivos
        Archivo archivo1 = new Archivo(LocalDate.of(2024, 9, 1), "archivo1.txt", 20.5);
        Archivo archivo2 = new Archivo(LocalDate.of(2024, 9, 2), "archivo2.txt", 10.2);

        // Crear un directorio y agregar archivos
        Directorio directorio1 = new Directorio(LocalDate.of(2024, 9, 3), "Directorio1");
        directorio1.add(archivo1);
        directorio1.add(archivo2);

        // Crear otro archivo comprimido
        ArchivoComprimido archivoComprimido1 = new ArchivoComprimido(LocalDate.of(2024, 9, 4), "archivoComprimido.zip", 0.5);
        archivoComprimido1.add(new Archivo(LocalDate.of(2024, 9, 5), "archivo3.txt", 30.0));
        archivoComprimido1.add(directorio1); // Añadir directorio dentro del archivo comprimido

        // Crear un link hacia el archivo comprimido
        Link link1 = new Link(archivoComprimido1, "LinkAlArchivoComprimido", LocalDate.of(2024, 9, 6));

        // Crear un directorio raíz y agregar objetos
        Directorio directorioRaiz = new Directorio(LocalDate.of(2024, 9, 7), "Raiz");
        directorioRaiz.add(archivoComprimido1);
        directorioRaiz.add(link1);
        directorioRaiz.add(directorio1);

        // Mostrar cantidad de elementos y tamaño total del directorio raíz
        System.out.println("Cantidad de elementos en el directorio raíz: " + directorioRaiz.cantidadElementos());
        System.out.println("Tamaño total del directorio raíz: " + directorioRaiz.tamanioElemento() + " KB");
    }
}
