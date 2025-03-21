package parcial2024;

import java.util.ArrayList;
import java.util.List;

public class Figurita extends ElementoFiguritas{
    private String marca,album;
    private int numero;
    private double precio;
    public Figurita(String nombre, String marca, String album, int numero, double precio) {
        super(nombre);
        this.marca = marca;
        this.album = album;
        this.numero = numero;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getAlbum() {
        return album;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public int getCantFiguritas() {
        return 1;
    }

    @Override
    public ElementoFiguritas getCopia(Condicion c) {
        if(c.cumple(this)) {
            return new Figurita(this.getNombre(), this.getMarca(), this.getAlbum(), this.getNumero(), this.getPrecio());
        }
        return null;
    }


}
