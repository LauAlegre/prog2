package ej1;

public class Cliente {
    private String nombre;
    private int numeroCel;
    private String direccion;
    private Alquiler alquiler;

    public Cliente(String nombre, int numeroCel, String direccion) {
        this.nombre = nombre;
        this.numeroCel = numeroCel;
        this.direccion = direccion;
    }
    public void addAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    public String getNombre() {
        return nombre;
    }
    public Alquiler getAlquiler() {
        return alquiler;
    }
    public int getNumeroCel() {
        return numeroCel;
    }
    public String getDireccion() {
        return direccion;
    }
}
