package ej1;


public class CondicionEnfermedad extends Condicion {
    private Enfermedad enfermedad;

    public CondicionEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(ProductoQuimico p) {
        for (String patologico : enfermedad.getEstadosPatologicos()) {
            if (!p.getPatologiasTrat().contains(patologico)) {
                return false;
            }
        }
        return true;
    }
}





