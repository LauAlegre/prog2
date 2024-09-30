package ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Documento {
    private String titulo;
    private String texto;
    private List<String>listaAutores;
    private List<String>palabrasClaves;

    public Documento(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.listaAutores = new ArrayList<>();
        this.palabrasClaves = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void addListaAutores(String autor) {
        if (!listaAutores.contains(autor)) {
            listaAutores.add(autor);
        }
    }
    public void addPalabrasClaves(String clave) {
        if (!palabrasClaves.contains(clave)) {
            palabrasClaves.add(clave);
        }
    }
    public void deleteListaAutores(String autor) {
        listaAutores.remove(autor);
    }
    public void deletePalabrasClaves(String clave) {
        palabrasClaves.remove(clave);
    }
    public boolean existePalabrasClave(String clave) {
        if (palabrasClaves.contains(clave)) {
            return true;
        }
        return false;
    }
    public boolean existeAutor(String autor) {
        if (listaAutores.contains(autor)) {
            return true;
        }
        return false;
    }
    public int contarPalabras() {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }


}
