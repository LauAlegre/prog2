package ej2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear sistema de documentos
        SistemaDocumentos sistema = new SistemaDocumentos();

        // Crear algunos documentos de ejemplo
        Documento doc1 = new Documento("Introducción a Java", "Java es un lenguaje de programación orientado a objetos.");
        doc1.addListaAutores("Autor1");
        doc1.addPalabrasClaves("programación");

        Documento doc2 = new Documento("Guía de Python", "Python es un lenguaje de propósito general, interpretado.");
        doc2.addListaAutores("Autor2");
        doc2.addPalabrasClaves("python");

        Documento doc3 = new Documento("Algoritmos y Estructuras", "Los algoritmos son secuencias de instrucciones para resolver problemas.");
        doc3.addListaAutores("Autor1");
        doc3.addPalabrasClaves("algoritmos");

        // Agregar los documentos al sistema
        sistema.agregarDocumento(doc1);
        sistema.agregarDocumento(doc2);
        sistema.agregarDocumento(doc3);

        // 1. Buscar documentos por título (CondicionTitulo)
        System.out.println("Buscar documentos por título 'Introducción a Java':");
        Condicion condicionTitulo = new CondicionTitulo("Introducción a Java");
        List<Documento> resultadoTitulo = sistema.buscarDocumentos(condicionTitulo);
        mostrarResultados(resultadoTitulo);

        // 2. Buscar documentos por autor (CondicionAutor)
        System.out.println("\nBuscar documentos por autor 'Autor1':");
        Condicion condicionAutor = new CondicionAutor("Autor1");
        List<Documento> resultadoAutor = sistema.buscarDocumentos(condicionAutor);
        mostrarResultados(resultadoAutor);

        // 3. Buscar documentos que contengan la palabra 'algoritmos' en el texto (CondicionContPalFrac)
        System.out.println("\nBuscar documentos que contengan la palabra 'algoritmos' en el texto:");
        Condicion condicionPalabraTexto = new CondicionContPalFrac("algoritmos");
        List<Documento> resultadoPalabraTexto = sistema.buscarDocumentos(condicionPalabraTexto);
        mostrarResultados(resultadoPalabraTexto);

        // 4. Buscar documentos con menos de 10 palabras en el texto (CondicionConatarPalabras)
        System.out.println("\nBuscar documentos con menos de 10 palabras en el texto:");
        Condicion condicionMenosDe10Palabras = new CondicionConatarPalabras(10);
        List<Documento> resultadoMenosDe10Palabras = sistema.buscarDocumentos(condicionMenosDe10Palabras);
        mostrarResultados(resultadoMenosDe10Palabras);

        // 5. Buscar documentos que NO contengan la palabra clave 'algoritmos' (CondicionNoPalabraClave)
        System.out.println("\nBuscar documentos que NO tengan la palabra clave 'algoritmos':");
        Condicion condicionNoPalabraClave = new CondicionNoPalabraClave("algoritmos");
        List<Documento> resultadoNoPalabraClave = sistema.buscarDocumentos(condicionNoPalabraClave);
        mostrarResultados(resultadoNoPalabraClave);

        // 6. Buscar documentos que tengan la palabra clave 'python' (CondicionPalabraClave)
        System.out.println("\nBuscar documentos que tengan la palabra clave 'python':");
        Condicion condicionPalabraClave = new CondicionPalabraClave("python");
        List<Documento> resultadoPalabraClave = sistema.buscarDocumentos(condicionPalabraClave);
        mostrarResultados(resultadoPalabraClave);

        // 7. Combinar condiciones (CondicionAnd)
        System.out.println("\nBuscar documentos que tengan la palabra clave 'algoritmos' y sean de 'Autor1':");
        Condicion condicionAnd = new CondicionAnd(new CondicionPalabraClave("algoritmos"), new CondicionAutor("Autor1"));
        List<Documento> resultadoAnd = sistema.buscarDocumentos(condicionAnd);
        mostrarResultados(resultadoAnd);
    }

    // Método auxiliar para mostrar los resultados
    public static void mostrarResultados(List<Documento> documentos) {
        if (documentos.isEmpty()) {
            System.out.println("No se encontraron documentos.");
        } else {
            for (Documento doc : documentos) {
                System.out.println("Documento encontrado: " + doc.getTitulo());
            }
        }
    }
}

