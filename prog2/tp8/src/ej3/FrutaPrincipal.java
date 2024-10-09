package ej3;

public abstract class FrutaPrincipal {
    private String nombre;
    private double fuerza;

    public FrutaPrincipal(String nombre, double fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }


    public double getFuerza() {
        return fuerza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public abstract double calcularFuerza(Double peso);
}
