package ej5;

import java.util.ArrayList;
import java.util.List;

public class Pregunta extends ComponentePrincipal {
    private String enunciado;
    private double puntaje;
    private double tiempo;
    private List<String>conceptos;

    public Pregunta(String enunciado, double puntaje, double tiempo) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempo = tiempo;
        this.conceptos = new ArrayList<String>();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public double getTiempo() {
        return tiempo;
    }

    public List<String> getConceptos() {
        return new ArrayList<>(conceptos);
    }
    public void addConcepto(String concepto) {
        if (!conceptos.contains(concepto)) {
            conceptos.add(concepto);
        }
    }
    public void removeConcepto(String concepto) {
        conceptos.remove(concepto);
    }

    @Override
    public double calcularPuntaje() {
        return getPuntaje();
    }

    @Override
    public double calcularTiempo() {
        return getTiempo();
    }

    @Override
    public List<String> listaConceptos() {

        return getConceptos();
    }
}
