package ej1;

import java.util.ArrayList;
import java.util.List;

public class Encuesta {
    private String nombreEncuesta;
    private int dni_encuestado;
    private List <Pregunta> preguntas;
    private Empleado empleado;

    public Encuesta(String nombreEncuesta, int dni_encuestado, Empleado empleado) {
        this.nombreEncuesta = nombreEncuesta;
        this.dni_encuestado = dni_encuestado;
        this.preguntas = new ArrayList<Pregunta>();
        this.empleado = empleado;
    }

    public String getNombreEncuesta() {
        return nombreEncuesta;
    }

    public int getDni_encuestado() {
        return dni_encuestado;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void addPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }
    public int getDni(){
        return dni_encuestado;
    }
}
