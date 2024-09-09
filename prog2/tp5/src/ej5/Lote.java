package ej5;

import java.util.List;

public class Lote {
    // Lista inmutable de minerales especiales precargados
    private static final List<String> mineralesEspeciales = List.of(
            "Oro",
            "Diamante",
            "Esmeralda"
    );

    private String nombre;
    private double hectareas;
    private List<String> minerales;
    private String clasificacion;

    // Constructor de la clase Lote
    public Lote(String nombre, double hectareas, List<String> minerales) {
        this.nombre = nombre;
        this.hectareas = hectareas;
        this.minerales = minerales;
        this.clasificacion = calcularClasificacion(); // Calcula la clasificación
    }

    // Método para calcular la clasificación basado en los minerales del lote
    private String calcularClasificacion() {
        if (this.minerales.containsAll(mineralesEspeciales)) {
            return "Especial";
        }
        return "Comun";
    }

    // Getters y setters según sea necesario
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHectareas() {
        return hectareas;
    }

    public void setHectareas(double hectareas) {
        this.hectareas = hectareas;
    }

    public List<String> getMinerales() {
        return minerales;
    }

    public void setMinerales(List<String> minerales) {
        this.minerales = minerales;
        this.clasificacion = calcularClasificacion(); // Recalcula la clasificación si cambian los minerales
    }

    public String getClasificacion() {
        return clasificacion;
    }
    public void addMineralesRequerido(String mineral) {
        minerales.add(mineral);
    }
}
