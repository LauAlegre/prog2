package ej4;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Period edad;
    private String ciudad;
    private int telefono;

    public Contacto(String nombre, LocalDate fechaNacimiento, Period edad, String ciudad, int telefono) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = setEdad();
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Period getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public Period setEdad (){
        return Period.between(fechaNacimiento, LocalDate.now());
    }
}
