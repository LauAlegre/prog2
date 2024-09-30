package ej5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pelicula {
    private String titulo;
    private String director;
    private String sinopsis;
    private List<String> actores;
    private List<String> generos;
    private int anioEstreno;
    private int duracion;
    private int edadRequerida;

    public Pelicula(String titulo, String director, String sinopsis, int anioEstreno, int duracion, int edadRequerida) {
        this.titulo = titulo;
        this.director = director;
        this.sinopsis = sinopsis;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadRequerida = edadRequerida;
        this.actores = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadRequerida() {
        return edadRequerida;
    }
    public void addActor(String actor) {
        if(!actores.contains(actor)) {
            actores.add(actor);
        }
    }
    public void addGenero(String genero) {
        if(!generos.contains(genero)) {
            generos.add(genero);
        }
    }
    public void deleteActor(String actor) {
        if(actores.contains(actor)) {
            actores.remove(actor);
             }
    }
    public void deleteGenero(String genero) {
        if(generos.contains(genero)) {
            generos.remove(genero);
        }
    }
    public List<String> getActores() {
        return new ArrayList<>(actores);
    }
    public List<String> getGeneros() {
        return new ArrayList<>(generos);
    }
    public boolean existeActor(String actor) {
        return actores.contains(actor);
    }
    public boolean existeGenero(String genero) {
        return generos.contains(genero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo) && Objects.equals(director, pelicula.director) && Objects.equals(sinopsis, pelicula.sinopsis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director, sinopsis);
    }
}
