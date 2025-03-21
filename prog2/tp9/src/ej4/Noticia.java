package ej4;

import ej4.Condicion.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Noticia extends CompNoticiaPrincipal {
    private String titulo;
    private String autor;
    private String introduccion;
    private String texto;
    private List<String> palabrasClave;
    private String link;

    public Noticia(String titulo, String autor, String introduccion, String texto, List<String> palabrasClave, String link) {
        this.titulo = titulo;
        this.autor = autor;
        this.introduccion = introduccion;
        this.texto = texto;
        this.palabrasClave = palabrasClave;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public boolean contienePalabrasClave(String palabraClave) {
        return palabrasClave.contains(palabraClave);
    }

    @Override
    public int contarNoticias() {
        return 1;
    }



    @Override
    public List<Noticia> buscar(Condicion condicion) {
        ArrayList<Noticia> retorno = new ArrayList<>();

        if (condicion.cumple(this)){
            retorno.add(this);
        }

        return retorno;
         }

    }


