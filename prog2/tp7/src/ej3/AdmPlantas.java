package ej3;

import ej3.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class AdmPlantas {
    private List<Planta> plantas;

    public AdmPlantas() {
        plantas = new ArrayList<>();
    }
    public void addPlanta(Planta planta) {
        plantas.add(planta);
    }
    public void removePlanta(Planta planta) {
        plantas.remove(planta);
    }

    public List<Planta> filtrarPlantas(Condicion condicion) {
        List<Planta> resultado = new ArrayList<>();
        for (Planta planta : plantas) {
            if(condicion.cumple(planta)){
                resultado.add(planta);
            }
        }
        return resultado;
    }
}
