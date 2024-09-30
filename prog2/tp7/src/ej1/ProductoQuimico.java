package ej1;

import java.util.ArrayList;
import java.util.List;

public class ProductoQuimico {
    private String nombre;
    private List<String>cultNoRecom;
    private List<String>patologiasTrat;

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.cultNoRecom = new ArrayList<>();
        this.patologiasTrat = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean existePatologia(String patologia){
        return patologiasTrat.contains(patologia);
    }
    public void addPatologia(String patologico){
        patologiasTrat.add(patologico);
    }
    public boolean removePatologico(String patologico) {
        return patologiasTrat.remove(patologico);
    }

    public boolean exisCultivo(String cultivo){
        return cultNoRecom.contains(cultivo);
    }
    public void addcultivo(String cultivo){
        cultNoRecom.add(cultivo);
    }
    public boolean removeCultivo(String cultivo) {
        return patologiasTrat.remove(cultivo);
    }
    public List<String> getPatologiasTrat() {
        return new ArrayList<>(patologiasTrat);  // Devolvemos una copia de la lista
    }



}
