package ej1;

import java.time.LocalDate;

public class Alquiler {
    private Item item;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Alquiler( LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void  alquilarItem(Item item) {
        if(item.isDisponible()){
            item.ocupar();
            this.item = item;
        }else{
            System.out.println("No se puede alquilar el item");
        }
    }

    public void devolverItem() {
       this.item.desocupar();
       this.item =null;
    }
    public String AlquileresVencidos(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaDevolucion = getFechaDevolucion();

        if(fechaDevolucion.isBefore(fechaActual)){
            return"La fecha de devolucion caduco el dia: " + fechaDevolucion;
        }
        return "Disponible el dia: " + fechaDevolucion;
    }

}
