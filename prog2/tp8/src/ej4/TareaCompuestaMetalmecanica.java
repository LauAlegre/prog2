package ej4;

class TareaCompuestaMetalmecanica extends TareaCompuesta {

    public TareaCompuestaMetalmecanica(String especialidad) {
        super(especialidad);
    }

    @Override
    public int determinarTiempoEstimado() {
        int tiempoTotal = super.determinarTiempoEstimado();
        // +15 minutos por cada tarea simple
        tiempoTotal += contarTareasSimples() * 15;
        return tiempoTotal;
    }

    // El costo ya es el mismo que en la clase TareaCompuesta, no necesita ser modificado
}
