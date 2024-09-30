package ej1;

import java.time.LocalDate;

public class Archivo extends ObjetoSA{
     private double tamanio;
     private LocalDate ultimaModificacion;
    public Archivo(LocalDate fechaCreacion, String nombre,double tamanio) {
        super(fechaCreacion, nombre);
        this.tamanio = tamanio;
        this.ultimaModificacion = LocalDate.now();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
        setUltimaModificacion();
    }


    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
        setUltimaModificacion();
    }

    public LocalDate getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion() {
        this.ultimaModificacion = LocalDate.now() ;
    }

    @Override
    public int cantidadElementos() {
        return 1;
    }


    @Override
    public double tamanioElemento() {
        return getTamanio();
    }
}
