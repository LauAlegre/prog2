package ej3;

public class Carta {
    private String nombre;
    private String nombreSuperHeroe;
    private int edad;
    private int peso;
    private double altura;
    private int visionNocturna;
    private int velocidad;
    private int fuerza;

    public Carta(String nombre, int edad, int peso, double altura, int visionNocturna, int velocidad, int fuerza, String nombreSuperHeroe) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.visionNocturna = visionNocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getVisionNocturna() {
        return visionNocturna;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }
    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }
}
