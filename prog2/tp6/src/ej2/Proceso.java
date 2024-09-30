package ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Proceso implements Comparable<Proceso> {
    private String nombre;
    private double requerimientoMemoria;

    public Proceso(String nombre, double requerimientoMemoria) {
        this.nombre = nombre;
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getRequerimientoMemoria() {
        return requerimientoMemoria;
    }

    @Override
    public int compareTo(Proceso otroProceso) {
        // Ordenamos por requerimiento de memoria de mayor a menor
        return Double.compare(this.requerimientoMemoria, otroProceso.getRequerimientoMemoria());
    }

    public static List<Proceso> ordenarMayorAMenor(List<Proceso> procesos) {
        Collections.sort(procesos, Collections.reverseOrder()); // Ordenamos en orden inverso
        return procesos;
    }




        public static void main(String[] args) {
            // Crear computadoras
            List<Computadora> computadoras = new ArrayList<>();
            computadoras.add(new Computadora(1, 3.2));  // Computadora con ID 1 y velocidad 3.2 GHz
            computadoras.add(new Computadora(2, 2.8));  // Computadora con ID 2 y velocidad 2.8 GHz
            computadoras.add(new Computadora(3, 3.6));  // Computadora con ID 3 y velocidad 3.6 GHz

            // Crear procesos
            List<Proceso> procesos = new ArrayList<>();
            procesos.add(new Proceso("Proceso A", 4.0)); // Proceso A con requerimiento de memoria 4 GB
            procesos.add(new Proceso("Proceso B", 2.5)); // Proceso B con requerimiento de memoria 2.5 GB
            procesos.add(new Proceso("Proceso C", 3.1)); // Proceso C con requerimiento de memoria 3.1 GB

            // Crear el centro de cómputo
            CentroComputo centro = new CentroComputo("Centro Principal", computadoras, procesos);

            // Ejecutar los procesos
            String resultado = centro.ejecutarProcesos();
            System.out.println(resultado);
        }


}
