package ej5;

import java.util.ArrayList;
import java.util.List;

public class UnidadSeciencial extends ComponenteUnidad{


    @Override
    public double calcularPuntaje() {
        double puntajeTotal = 0;
        for (ComponentePrincipal actividad : actividades) {
            puntajeTotal += actividad.calcularPuntaje();
        }
        return puntajeTotal;
    }

    @Override
    public double calcularTiempo() {
        double tiempoTotal = 0;
        for (ComponentePrincipal actividad : actividades) {
            tiempoTotal += actividad.calcularTiempo();
        }
        return tiempoTotal;
    }




}
