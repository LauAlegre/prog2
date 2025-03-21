package ej1;

import java.time.LocalDate;

public class Link extends ObjetoSA{
    private static final double TAM_DEFECTO = 1.0;
    private static final int CANT_DEFECTO = 1;

    private ObjetoSA obj;


    public Link(ObjetoSA obj, String nombre, LocalDate fechaCreacion){
        super(fechaCreacion, nombre);
        this.obj = obj;
    }


    @Override
    public int cantidadElementos() {
        return CANT_DEFECTO;
    }

    @Override
    public double tamanioElemento() {
        return TAM_DEFECTO;
    }


}
