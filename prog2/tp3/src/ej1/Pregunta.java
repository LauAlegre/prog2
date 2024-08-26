package ej1;

public class Pregunta {
    private String pregunta;
    private boolean repsuesta;

    public Pregunta(String pregunta, boolean repsuesta) {
        this.pregunta = pregunta;
        this.repsuesta = repsuesta;
    }

    public boolean isRepsuesta() {
        return repsuesta;
    }

    public String getPregunta() {
        return pregunta;
    }
}
