package ej1;

import java.time.LocalDate;

public class Planta {
    private static int ContadorId = 0;
    private String nombre;
    private String paisOrigen;
    private LocalDate fechaDeCompra;
    private int id;
    private String nombreCientifico;


    public Planta( LocalDate fechaDeCompra, String paisOrigen, String nombre,String nombreCientifico) {
        this.id = ContadorId++;
        this.fechaDeCompra = fechaDeCompra;
        this.paisOrigen = paisOrigen;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;

    }

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Planta{" +
                "ID=" + id +
                ", Nombre Científico='" + nombreCientifico + '\'' +
                ", Nombre Común='" + nombre + '\'' +
                ", País de Origen='" + paisOrigen + '\'' +
                ", Fecha de Compra=" + fechaDeCompra +
                '}';
    }

}
