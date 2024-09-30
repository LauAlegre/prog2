package ej1;

public class Auto extends Item{
    private String patente;
    private String marca;
    private double km;

    public Auto(String nombre, double precio, double precioAlquiler, String patente, String marca, double km) {
        super(nombre, precio, precioAlquiler);
        this.patente = patente;
        this.marca = marca;
        this.km = km;
    }


    @Override
    public void ocupar() {
        super.setDisponible(false);

    }

    @Override
    public void desocupar() {
        super.setDisponible(true);

    }
}
