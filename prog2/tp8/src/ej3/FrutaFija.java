package ej3;

public class FrutaFija extends FrutaPrincipal {

    public FrutaFija(String nombre, double fuerza) {
        super(nombre,fuerza);
    }



    @Override
    public double calcularFuerza(Double peso) {
        return this.getFuerza();
    }
}
