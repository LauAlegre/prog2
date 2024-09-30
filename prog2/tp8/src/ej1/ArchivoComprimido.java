package ej1;

import java.time.LocalDate;

public class ArchivoComprimido extends Directorio{
    private double tasaCompresion;
    public ArchivoComprimido(LocalDate fechaCreacion, String nombre,Double tasaCompresion) {
        super(fechaCreacion, nombre);
        this.tasaCompresion = tasaCompresion;
    }
    @Override
    public double tamanioElemento() {
        return super.tamanioElemento()*tasaCompresion;
    }
    @Override
    public int cantidadElementos() {
        return 1;
    }
}
