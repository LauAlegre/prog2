package ej5;

import ej5.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    List<Pelicula>peliculas;

    public Plataforma() {
        peliculas = new ArrayList<>();
    }
    private void addPelicula(Pelicula p) {
        if (!peliculas.contains(p)) {
            peliculas.add(p);
        }
    }
    private void removePelicula(Pelicula p) {
        peliculas.remove(p);
    }
    private List<Pelicula> filterPeliculas(Condicion condicion){
        List<Pelicula>salida = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if(condicion.cumple(p)){
                salida.add(p);
            }
        }
        return salida;
    }

}
