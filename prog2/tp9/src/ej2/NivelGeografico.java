package ej2;

import ej2.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class NivelGeografico extends ComponentePrincipal {
    private String nombre;
    private List<ComponentePrincipal>Componentes;

    public NivelGeografico(String nombre) {
        this.nombre = nombre;
        Componentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarComponente(ComponentePrincipal componente) {
        Componentes.add(componente);
    }
    public void removeComponente(ComponentePrincipal componente) {
        Componentes.remove(componente);
    }


    @Override
    public int buscar(Condicion c) {
        int contador = 0;
        for (ComponentePrincipal componente : Componentes) {

            contador += componente.buscar(c);
        }
        return contador;
    }

    @Override
    public double porcRegalo(Condicion c) {
        int cartasConRegalo = buscar(c);
        int totalCartas = cantCartas();

        if (totalCartas == 0) {
            return 0;
        }


        double porcentaje = ((double) cartasConRegalo / totalCartas) * 100;
        return porcentaje;
    }




    @Override
    public int cantCartas() {
        int resultado = 0;
        for (ComponentePrincipal componente : Componentes) {
            resultado += componente.cantCartas();
        }
        return resultado;
    }
}
