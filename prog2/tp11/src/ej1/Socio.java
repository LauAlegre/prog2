package ej1;

import ej1.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Socio extends ElementoClub{
    private String nombreApellido;
    private int edad;
    private boolean pagoCuota;
    private List<Alquiler>alquileres;

    public Socio(String nombreApellido, int edad, boolean pagoCuota) {
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.pagoCuota = pagoCuota;
        this.alquileres = new ArrayList<>();
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isPagoCuota() {
        return pagoCuota;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPagoCuota(boolean pagoCuota) {
        this.pagoCuota = pagoCuota;
    }
    public void addAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }

    @Override
    public ArrayList<Socio> buscar(Condicion c) {
        ArrayList<Socio> salida=new ArrayList();
        if(c.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
}
