package ej5;

import java.util.List;

public class Cereal {
    public static final List<String> GRANOS_GRUESOS = List.of("Girasol", "Maíz");
    public static final List<String> GRANOS_FINOS = List.of("Trigo", "Avena");
    public static final List<String> PASTURAS = List.of("Alfalfa", "Trébol Subterráneo");

    private String nombre;
    private String tipo; // Almacena el tipo de cereal: "Grano Grueso", "Grano Fino", "Pastura"
    private List<String> mineralesRequeridos;

    public Cereal(String nombre, List<String> mineralesRequeridos) {
        this.nombre = nombre;
        this.mineralesRequeridos = mineralesRequeridos;
        this.tipo = asignarTipoCereal(nombre);
    }

    private String asignarTipoCereal(String nombre) {
        if (GRANOS_GRUESOS.contains(nombre)) {
            return "Grano Grueso";
        } else if (GRANOS_FINOS.contains(nombre)) {
            return "Grano Fino";
        } else if (PASTURAS.contains(nombre)) {
            return "Pastura";
        } else {
            return "Desconocido"; // En caso de que no se encuentre en ninguna lista
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public List<String> getMineralesRequeridos() {
        return mineralesRequeridos;
    }
    public void addMineralesRequerido(String mineral) {
        mineralesRequeridos.add(mineral);
    }



}
