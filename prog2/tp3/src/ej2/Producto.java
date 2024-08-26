package ej2;

public class Producto {
    private String nombre;
    private double costo;
    private double precioVenta;
    private  String madera;
    private String color;
    private double porcentajePrecio;

    public Producto(String nombre, double costo, double precioVenta, String madera, String color) {
        this.nombre = nombre;
        this.costo = costo;
        this.precioVenta = getPrecioVenta();
        this.madera = madera;
        this.color = color;
        this.porcentajePrecio =  0.35;
    }
    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public double getPrecioVenta() {
        double montoAniadir= this.costo *this.porcentajePrecio;
        return costo + montoAniadir;
    }

    public String getMadera() {
        return madera;
    }

    public String getColor() {
        return color;
    }
    public void setPorcentajePrecio(double porcentajePrecio) {
        this.porcentajePrecio = porcentajePrecio;
    }



}
