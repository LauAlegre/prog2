package ej1;

import java.time.LocalDate;

public abstract class ObjetoSA {
    private String nombre;
    private LocalDate fechaCreacion;

    public ObjetoSA(LocalDate fechaCreacion, String nombre) {
        this.fechaCreacion = fechaCreacion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public abstract int cantidadElementos();
    public abstract double tamanioElemento();

}
