package ej3;

public abstract class ComponentePersonaje {
    private String nombre;
    private double peso;
    private int edad;
    private static double FUERZA = 125;

    public ComponentePersonaje(String nombre, double peso, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static double getFuerza() {
        return FUERZA;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void setFuerza(int nuevaFuerza) {
        FUERZA = nuevaFuerza;
    }
    public abstract double calcularFuerza();
    public abstract double calcularPeso();
    public abstract int calcularEdad();

    public static void main(String[] args) {
        // Crear personajes individuales
        Personaje luffy = new Personaje("Luffy", 75.0, 19);
        Personaje zoro = new Personaje("Zoro", 85.0, 21);
        Personaje nami = new Personaje("Nami", 55.0, 20);

        // Crear frutas y asignarlas a los personajes
        FrutaFija gomuGomuNoMi = new FrutaFija("Gomu Gomu no Mi", 300);
        FrutaMultiplicando toriToriNoMi = new FrutaMultiplicando("Tori Tori no Mi", 0.0, luffy);
        FrutaMultiplicadorValorFijo hitoHitoNoMi = new FrutaMultiplicadorValorFijo("Hito Hito no Mi", 100);

        luffy.ingerirFruta(gomuGomuNoMi);
        zoro.ingerirFruta(toriToriNoMi);
        nami.ingerirFruta(hitoHitoNoMi);

        // Crear tripulación y agregar personajes
        Tripulacion mugiwara = new Tripulacion("Mugiwara", 0, 0);
        mugiwara.agregarPersonaje(luffy);
        mugiwara.agregarPersonaje(zoro);
        mugiwara.agregarPersonaje(nami);

        // Mostrar atributos de la tripulación
        System.out.println("Nombre de la tripulación: " + mugiwara.getNombre());
        System.out.println("Peso de la tripulación: " + mugiwara.calcularPeso());
        System.out.println("Edad de la tripulación: " + mugiwara.calcularEdad());
        System.out.println("Fuerza de la tripulación: " + mugiwara.calcularFuerza());
        System.out.println("Cantidad de personajes en la tripulación: " + mugiwara.getCantidadPersonajes());
        System.out.println("/////////////////////");
        // Mostrar atributos individuales de los personajes
        System.out.println("Nombre de Luffy: " + luffy.getNombre());
        System.out.println("Peso de Luffy: " + luffy.getPeso());
        System.out.println("Edad de Luffy: " + luffy.getEdad());
        System.out.println("Fuerza de Luffy: " + luffy.calcularFuerza());
        System.out.println("/////////////////////");
        System.out.println("Nombre de Zoro: " + zoro.getNombre());
        System.out.println("Peso de Zoro: " + zoro.getPeso());
        System.out.println("Edad de Zoro: " + zoro.getEdad());
        System.out.println("Fuerza de Zoro: " + zoro.calcularFuerza());
        System.out.println("/////////////////////");
        System.out.println("Nombre de Nami: " + nami.getNombre());
        System.out.println("Peso de Nami: " + nami.getPeso());
        System.out.println("Edad de Nami: " + nami.getEdad());
        System.out.println("Fuerza de Nami: " + nami.calcularFuerza());
    }
}
