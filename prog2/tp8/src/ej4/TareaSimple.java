package ej4;

import java.util.ArrayList;
import java.util.List;

class TareaSimple extends Actividad {
    private String accion;
    private double costo;
    private int tiempoEstimado;

    public TareaSimple(String accion, double costo, int tiempoEstimado) {
        this.accion = accion;
        this.costo = costo;
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public int determinarTiempoEstimado() {
        return tiempoEstimado;
    }

    @Override
    public double determinarCosto() {
        return costo;
    }

    @Override
    public List<String> obtenerListaAcciones() {
        List<String> acciones = new ArrayList<>();
        acciones.add(accion);
        return acciones;
    }

    @Override
    public int contarTareasSimples() {
        return 1;  // Esta es una tarea simple
    }
}
