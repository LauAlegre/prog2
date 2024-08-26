package ej1;

public class Empleado {
    private String nombre;
    private int edad;
    private int cantEncuestas;


    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantEncuestas = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantEncuestas() {
        return cantEncuestas;
    }
    public void incrementarEncuesta(){
        cantEncuestas++;
    }
}
