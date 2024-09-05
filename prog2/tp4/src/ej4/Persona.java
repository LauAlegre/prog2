package ej4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private int nroPasaporte;
    private List<String> estado;



    public Persona(String nombre, LocalDate fechaNacimiento, int nroPasaporte) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nroPasaporte = nroPasaporte;
        this.estado = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getNroPasaporte() {
        return nroPasaporte;
    }

    public List<String> getEstado() {
        return estado;
    }

    public void addEstado(String nuevoEstado) {
        if (this.estado.size() < 2) {
            this.estado.add(nuevoEstado);
        } else {
            System.out.println("No se pueden agregar más de dos estados.");
        }
    }
    public void removeEstado() {

        this.estado.clear();
    }

    public boolean disponible(){
        boolean paisOrigen = false;
        boolean concentracion = false;
        boolean disponible = false;

        for(String estado: this.estado){
            if(estado.equals("En pais de origen")){
                paisOrigen = true;
            }else if(estado.equals("En concentracion")){
                concentracion = true;
            }
        }
        if(paisOrigen == true && concentracion== false){
            disponible = true;
        }
        return disponible;
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1985, 3, 15);
        Jugador jugador = new Jugador("Lautaro", localDate, 233232, "DELANTERO", 'R', 10);
        jugador.addEstado("En pais de origen");
        jugador.addEstado("En concentracion");
        System.out.println(jugador.disponible());

    }

}
