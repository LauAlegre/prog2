package ej2;

import ej2.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Buzon extends ComponentePrincipal{

    private String nombre;
    private List<Integer> niniosBuenos;
    private List<Carta>cartas;

    public Buzon(String nombre) {
        this.nombre = nombre;
        this.niniosBuenos = new ArrayList();
        this.cartas = new ArrayList();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addNinioBueno(int dni){
        this.niniosBuenos.add(dni);

    }
    public boolean existeNninioBueno(int dni){
        return this.niniosBuenos.contains(dni);
    }
    public void addCarta(Carta carta){

        if (this.niniosBuenos.contains(carta.getDni())) {
            cartas.add(carta);  // Niño bueno
        } else {
            carta.cambiarRegalo();  // Niño malo, se cambia a carbón
            cartas.add(carta);
        }

    }


    @Override
    public int buscar(Condicion c) {
        int contador = 0;
        for (Carta carta : cartas) {
            if (c.cumple(carta)) {  // Verifica si la condición se cumple
                contador+=carta.cantCartas();
            }
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
        return this.cartas.size();
    }


}
