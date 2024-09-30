package ej1;



public class CondicionCultivoEnfermedad extends Condicion {
    private Cultivo cultivo;
    private Enfermedad enfermedad;

    public CondicionCultivoEnfermedad(Cultivo cultivo, Enfermedad enfermedad) {
        this.cultivo = cultivo;
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(ProductoQuimico p) {
        // Verificar si el producto químico NO es apto para el cultivo
        if (p.exisCultivo(cultivo.getNombre())) {
            return false;
        }

        // Verificar si el producto químico trata la enfermedad
        for (String patologico : enfermedad.getEstadosPatologicos()) {
            if (!p.getPatologiasTrat().contains(patologico)) {
                return false;
            }
        }
        return true;
    }
}

