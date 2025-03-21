package prefinal2023;

import java.util.ArrayList;

public class ObjetoColecion extends ElementoColeccion{
    private String marca;
    private double precio;
    private int anio;
    private int peso;
    public ObjetoColecion(String marca, double precio, int anio, int peso,String nom) {
        super(nom);
        this.marca = marca;
        this.precio = precio;
        this.anio = anio;
        this.peso = peso;
    }
    public String getMarca() {
        return marca;
    }

    @Override
    public int getAnio() {
        return anio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public boolean pertenece(ObjetoColecion c) {
        return this.equals(c);
    }

    @Override
    protected ArrayList<ObjetoColecion> getLista(Condicion c) {
        ArrayList<ObjetoColecion> lista = new ArrayList<>();
        if(c.cumple(this)){
            lista.add(this);
        }
        return null;
    }

    @Override
    public int contElementos() {
        return 1;
    }

    public boolean equals(Object c) {
        ObjetoColecion obj = (ObjetoColecion)c;
        return obj.getAnio() == this.getAnio() && obj.getPrecio() == this.getPrecio() && obj.getPeso() == this.getPeso()
                && this.getMarca().equals(obj.getMarca())&& this.getNombre().equals(obj.getNombre());
    }
}
