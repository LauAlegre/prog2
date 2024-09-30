package ej1;

public abstract class Item {
    private String nombre;
    private double precio;
    private double precioAlquiler;
    private boolean disponible;

    public Item(String nombre, double precio, double precioAlquiler) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioAlquiler = precioAlquiler;
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract void ocupar();
    public abstract void desocupar();


}
