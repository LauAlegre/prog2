package ej2;

import java.util.ArrayList;
import java.util.List;

public class CentroComputo {
    private String nombre;
    private List<Computadora>computadoras;
    private List<Proceso>procesos;

    public CentroComputo(String nombre, List<Computadora> computadoras, List<Proceso> procesos) {
        this.nombre = nombre;
        this.computadoras = computadoras;
        this.procesos = procesos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public String ejecutarProcesos() {
        List<Proceso> procesosOrdenados = Proceso.ordenarMayorAMenor(this.procesos);
        List<Computadora> computadorasOrdenadas = Computadora.ordenarMayorAMenor(this.computadoras);

        if (procesosOrdenados.isEmpty()) {
            return "No hay procesos definidos";
        }

        if (computadorasOrdenadas.isEmpty()) {
            return "No hay computadoras disponibles";
        }

        // Removemos todos los procesos de la lista
        while (!procesosOrdenados.isEmpty()) {
            procesosOrdenados.remove(0);
        }

        return "La computadora con el id " + computadorasOrdenadas.get(0).getId() + " realizó todos los procesos";
    }

}
