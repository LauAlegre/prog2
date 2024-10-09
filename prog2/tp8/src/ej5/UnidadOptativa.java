package ej5;

import java.util.ArrayList;
import java.util.List;

public class UnidadOptativa extends ComponenteUnidad{



    @Override
    public double calcularPuntaje() {
        double puntajeMax = 0;
        for(ComponentePrincipal actividad : actividades){
            if(actividad.calcularPuntaje()>puntajeMax){
                puntajeMax = actividad.calcularPuntaje();
            }
        }
        return puntajeMax;
    }

    @Override
    public double calcularTiempo() {
        double tiempoMax = 0;
        for(ComponentePrincipal actividad : actividades){
            if(actividad.calcularTiempo()>tiempoMax){
                tiempoMax = actividad.calcularPuntaje();
            }
        }
        return tiempoMax;
    }


}
