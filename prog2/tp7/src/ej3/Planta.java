package ej3;

import java.util.ArrayList;
import java.util.List;

public class Planta {
    private String nombreCientifico;
    private List<String>nombreBulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String tipo;
    private int riego;
    private int sol;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, int sol, int riego, String tipo, String clase) {
        this.nombreCientifico = nombreCientifico.toUpperCase();
        this.clasificacionSuperior = clasificacionSuperior.toUpperCase();
        this.familia = familia.toUpperCase();
        this.sol = sol;
        this.riego = riego;
        this.tipo = tipo.toUpperCase();
        this.clase = clase.toUpperCase();
        this.nombreBulgares=new ArrayList<String>();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public String getClase() {
        return clase;
    }

    public String getTipo() {
        return tipo;
    }

    public int getRiego() {
        return riego;
    }

    public int getSol() {
        return sol;
    }
    public void addNomrbeBulgar(String nombreBulgar) {
        if(!this.nombreBulgares.contains(nombreBulgar.toUpperCase())){
            this.nombreBulgares.add(nombreBulgar.toUpperCase());
        }
    }
    public void removeNomrbeBulgar(String nombreBulgar) {
        this.nombreBulgares.remove(nombreBulgar.toUpperCase());
    }
    public boolean existeNombreVulgar(String nombre) {
        return this.nombreBulgares.contains(nombre.toUpperCase());
    }

}
