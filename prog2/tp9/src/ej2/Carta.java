package ej2;

import ej2.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carta extends ComponentePrincipal {
    public static final String REGALOMALO = "trozo de carbon";
    private String nombre;
    private int dni;
    private List<String>listaRegalos;

    public Carta(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.listaRegalos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void addRegalo(String regalo) {
        listaRegalos.add(regalo);
    }
    public void removeRegalo(String regalo) {
        listaRegalos.remove(regalo);
    }
    public boolean contieneRegalo(String regalo) {
        return listaRegalos.contains(regalo);
    }
    public void cambiarRegalo() {
        this.listaRegalos = new ArrayList<>();
        this.listaRegalos.add(REGALOMALO);
    }


    @Override
    public int buscar(Condicion c) {
        if(c.cumple(this)){
            return 1;
        }
        return 0;
    }

    @Override
    public double porcRegalo(Condicion c) {
        return 0;
    }

    @Override
    public int cantCartas() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return dni == carta.dni;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
