package parcial22lego;

import java.util.ArrayList;
import java.util.List;

public class Ladrillo extends ElementoJugeteria{
    private double peso;
    private double costo;
    private String color;
    private int canridadEncastres;
    public Ladrillo(String marca, double peso, double costo, String color, int canridadEncastres) {
        super(marca);
        this.peso = peso;
        this.costo = costo;
        this.color = color;
        this.canridadEncastres = canridadEncastres;

    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public double getCosto() {
        return this.costo   ;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getEncastres() {
        return this.canridadEncastres;
    }

    @Override
    public List<ElementoJugeteria> busqueda(Condicion c) {
        List<ElementoJugeteria> saida = new ArrayList();
        if(c.cumple(this)){
            saida.add(this);
        }

        return saida;
    }


}
