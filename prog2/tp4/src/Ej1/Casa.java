package Ej1;

import java.util.ArrayList;
import java.util.List;

class Casa {
    private String direccion;
    private List<Aberturas> aberturas;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.aberturas = new ArrayList<>();
        this.habitaciones = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Aberturas> getAberturas() {
        return aberturas;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public void addAbertura(Aberturas abertura) {
        aberturas.add(abertura);
    }
    public void addHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
}

