package Ej1;

public class Habitacion {
    private String nombre;
    private Sensor sensor;
    private boolean movimineto;

    public Habitacion(String nombre, Sensor sensor) {
        this.nombre = nombre;
        this.sensor = sensor;
        this.movimineto = false;
    }

    public String getNombre() {
        return nombre;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public boolean isMovimineto() {
        return movimineto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public void setMovimineto(boolean movimineto) {
        this.movimineto = movimineto;
    }

    public void caminar(){
        movimineto = true;
        this.sensor.setAnomalia(true);
    }
}
