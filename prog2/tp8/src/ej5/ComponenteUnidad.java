package ej5;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponenteUnidad extends ComponentePrincipal{
    protected List<ComponentePrincipal> actividades;

    public ComponenteUnidad() {
        this.actividades = new ArrayList<>();
    }

    public void addActividad(ComponentePrincipal actividad) {
        this.actividades.add(actividad);
    }

    public void removeActividad(ComponentePrincipal actividad) {
        this.actividades.remove(actividad);
    }

    @Override
    public List<String> listaConceptos() {
        List<String> conceptos = new ArrayList<>();

        // Recorremos cada actividad para obtener sus conceptos
        for (ComponentePrincipal actividad : actividades) {
            List<String> conceptosActividad = actividad.listaConceptos();

            // Agregamos los conceptos, asegurándonos de que no haya duplicados
            for (String concepto : conceptosActividad) {
                if (!conceptos.contains(concepto)) {
                    conceptos.add(concepto);
                }
            }
        }
        return conceptos;
    }
}
