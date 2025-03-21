package ej1;

import ej1.Comparadores.ComparadorCompuesto;
import ej1.Comparadores.ComparadorEdad;
import ej1.Comparadores.ComparadorNombre;
import ej1.Condiciones.Condicion;
import ej1.Condiciones.CondicionCuota;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoClub {
    public abstract ArrayList<Socio> buscar(Condicion c);

    public ArrayList<Socio> buscarOrdenado(Condicion c, Comparator<Socio> orden){
        ArrayList<Socio> resultado = this.buscar(c);
        Collections.sort(resultado, orden);
        return resultado;
    }

    public static void main(String[] args) {
        // Crear el club y agregar algunos socios
        Club club = new Club();
        club.addSocio(new Socio("Carlos Sánchez", 35, true));
        club.addSocio(new Socio("Ana López", 25, true));
        club.addSocio(new Socio("Juan Pérez", 30, false));
        club.addSocio(new Socio("Ana Rodríguez", 25, true));

        // Crear los comparadores
        ComparadorNombre comparadorNombre = new ComparadorNombre();
        ComparadorEdad comparadorEdad = new ComparadorEdad();
        ComparadorCompuesto comparadorCompuesto = new ComparadorCompuesto(comparadorNombre, comparadorEdad);

        // Crear una condición (socios que pagaron la cuota)
        CondicionCuota condicionCuota = new CondicionCuota();

        System.out.println("---- Buscar y ordenar por Nombre ----");
        ArrayList<Socio> resultadoNombre = club.buscarOrdenado(condicionCuota, comparadorNombre);
        mostrarSocios(resultadoNombre);

        System.out.println("---- Buscar y ordenar por Edad ----");
        ArrayList<Socio> resultadoEdad = club.buscarOrdenado(condicionCuota, comparadorEdad);
        mostrarSocios(resultadoEdad);

        System.out.println("---- Buscar y ordenar por Nombre y luego Edad (Compuesto) ----");
        ArrayList<Socio> resultadoCompuesto = club.buscarOrdenado(condicionCuota, comparadorCompuesto);
        mostrarSocios(resultadoCompuesto);
    }

    // Método para mostrar los socios
    private static void mostrarSocios(ArrayList<Socio> socios) {
        for (Socio socio : socios) {
            System.out.println(socio.getNombreApellido() + " - " + socio.getEdad() + " años");
        }
        System.out.println();
    }



}
