package ej1;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaAlquiler;
    private int id;
    private double precioAlquiler;

    public Alquiler(LocalDate fechaAlquiler, int id, double precioAlquiler) {
        this.fechaAlquiler = LocalDate.now();
        this.id = id;
        this.precioAlquiler = precioAlquiler;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public int getId() {
        return id;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
}
