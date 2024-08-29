package Ej1;

public class Ventana extends Aberturas {
    private boolean rota; // Indicador de si la ventana está rota

    public Ventana(String nombre, Sensor sensor, boolean estado) {
        super(nombre, sensor, estado);
        this.rota = false; // Por defecto, la ventana no está rota
    }

    // Método para romper la ventana
    public void romperVentana() {
        if (!rota) { // Solo se puede romper si no está rota
            rota = true;
            getSensor().setAnomalia(true); // Activamos el sensor de anomalía
            System.out.println(getNombre() + " se ha roto.");
        } else {
            System.out.println(getNombre() + " ya está rota.");
        }
    }

    // Método para verificar si la ventana está rota
    public boolean isRota() {
        return rota;
    }
}
