package ej4;

import java.util.ArrayList;
import java.util.List;

class TareaCompuesta extends Actividad {
    private String especialidad;
    private List<Actividad> actividades;

    public TareaCompuesta(String especialidad) {
        this.especialidad = especialidad;
        this.actividades = new ArrayList<>();
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    @Override
    public int determinarTiempoEstimado() {
        int tiempoTotal = 0;
        for (Actividad actividad : actividades) {
            tiempoTotal += actividad.determinarTiempoEstimado();
        }
        // +10 minutos por cada tarea simple
        tiempoTotal += contarTareasSimples() * 10;
        return tiempoTotal;
    }

    @Override
    public double determinarCosto() {
        double costoTotal = 0;
        for (Actividad actividad : actividades) {
            costoTotal += actividad.determinarCosto();
        }
        return costoTotal;
    }

    @Override
    public List<String> obtenerListaAcciones() {
        List<String> acciones = new ArrayList<>();
        for (Actividad actividad : actividades) {
            acciones.addAll(actividad.obtenerListaAcciones());
        }
        return acciones;
    }

    @Override
    public int contarTareasSimples() {
        int contador = 0;
        for (Actividad actividad : actividades) {
            contador += actividad.contarTareasSimples();
        }
        return contador;
    }
}