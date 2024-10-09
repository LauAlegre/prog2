package ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Directorio extends ObjetoSA{
    private static final int CANT_DEFECTO = 1;

    private List<ObjetoSA> objetos;
    public Directorio(LocalDate fechaCreacion, String nombre) {
        super(fechaCreacion, nombre);
        this.objetos = new ArrayList<>();
    }
    public void add(ObjetoSA objeto){
        this.objetos.add(objeto);
    }
    public void remove(ObjetoSA objeto){
        this.objetos.remove(objeto);
    }

    @Override
    public int cantidadElementos() {
        int cantidad = 0;
        for (ObjetoSA objeto : objetos){
            cantidad += objeto.cantidadElementos();
        }
        return cantidad + CANT_DEFECTO;
    }

    @Override
    public double tamanioElemento() {
        double tam = 0;
        for (ObjetoSA objeto : objetos){
            tam += objeto.tamanioElemento();
        }
        return tam;
    }
}
