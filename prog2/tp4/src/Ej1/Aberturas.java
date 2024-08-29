package Ej1;

public class Aberturas {
    private String nombre;
    private Sensor sensor;
    private boolean estado;//abierto o cerrado

    public Aberturas(String nombre, Sensor sensor, boolean estado) {
        this.nombre = nombre;
        this.sensor = sensor;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void abrir(){
        setEstado(true);
        sensor.setAnomalia(true);

    }
    public void Cerrar(){
        setEstado(false);
        sensor.setAnomalia(false);
    }





}
