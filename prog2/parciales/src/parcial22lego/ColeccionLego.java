package parcial22lego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColeccionLego extends ElementoJugeteria {
    private List<ElementoJugeteria> elementos;
    private int descuento;
    public ColeccionLego(String marca,int descuento) {
        super(marca);
        this.elementos = new ArrayList<>();
        this.descuento = descuento;
    }
    public void add(ElementoJugeteria elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public double getPeso() {
        double peso = 0;
        for (ElementoJugeteria elemento : elementos) {
            peso += elemento.getPeso();
        }
        return peso;
    }

    @Override
    public double getCosto() {
        return totalCostos()-((totalCostos()*descuento)/100);
    }
    public double totalCostos(){
        double costo = 0;
        for (ElementoJugeteria elemento : elementos) {
            costo += elemento.getCosto();
        }
        return costo;
    }

    @Override
    public String getColor() {
        int ultimo = canElementos() - 1;
        return this.elementos.get(ultimo).getColor();
    }

    @Override
    public int getEncastres() {

        return getCantidadEncastres()/canElementos();
    }
    public int getCantidadEncastres(){
        int cantidad = 0;
        for (ElementoJugeteria elemento : elementos) {
            cantidad+=elemento.getEncastres();
        }
        return cantidad;
    }

    @Override
    public List<ElementoJugeteria> busqueda(Condicion c) {
        List<ElementoJugeteria> busqueda = new ArrayList<>();
        if(c.cumple(this)){
            busqueda.add(this);
        }
        for (ElementoJugeteria elemento : elementos) {
            busqueda.addAll(elemento.busqueda(c));
        }
        Collections.sort(busqueda);
        return busqueda;
    }
    public int canElementos(){
        return elementos.size();
    }
}
