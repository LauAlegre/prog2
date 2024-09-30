package ej1;

import java.util.ArrayList;
import java.util.List;

public class Enfermedad {
    private String nombre;
    private List<String>estadosPatologicos;

    public Enfermedad( String nombre) {
        this.estadosPatologicos = new ArrayList<>();
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   public boolean existePatologico(String patologico){
        return estadosPatologicos.contains(patologico);
   }
   public void addPatologia(String patologico){
        estadosPatologicos.add(patologico);
   }
    public boolean removePatologia(String patologico) {
        return estadosPatologicos.remove(patologico);  // Devuelve true si se elimina, false si no se encuentra
    }
    public List<String> getEstadosPatologicos() {
        return new ArrayList<>(estadosPatologicos);  // Devolvemos una copia de la lista
    }


}
