package ej4;

import java.util.ArrayList;
import java.util.List;

class TareaCompuestaRepetitiva extends Actividad {
    private List<Actividad> actividades;
    private int repeticiones;

    public TareaCompuestaRepetitiva(int repeticiones) {
        this.actividades = new ArrayList<>();
        this.repeticiones = repeticiones;
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
        // Se multiplica el tiempo por la cantidad de repeticiones
        return tiempoTotal * repeticiones;
    }

    @Override
    public double determinarCosto() {
        double costoTotal = 0;
        for (Actividad actividad : actividades) {
            costoTotal += actividad.determinarCosto();
        }
        // Se multiplica el costo por la cantidad de repeticiones
        return costoTotal * repeticiones;
    }

    @Override
    public List<String> obtenerListaAcciones() {
        List<String> acciones = new ArrayList<>();
        for (int i = 0; i < repeticiones; i++) {
            for (Actividad actividad : actividades) {
                acciones.addAll(actividad.obtenerListaAcciones());
            }
        }
        return acciones;
    }

    @Override
    public int contarTareasSimples() {
        int contador = 0;
        for (Actividad actividad : actividades) {
            contador += actividad.contarTareasSimples();
        }
        // Se multiplica el número de tareas simples por la cantidad de repeticiones
        return contador * repeticiones;
    }
}

