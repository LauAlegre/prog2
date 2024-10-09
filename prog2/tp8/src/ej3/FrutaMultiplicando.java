package ej3;

public class FrutaMultiplicando extends FrutaPrincipal{
    private static final double MULTIPLICADOR = 10;

    public FrutaMultiplicando(String nombre, double fuerza, ComponentePersonaje per) {
        super(nombre, fuerza);
    }

    @Override
    public double calcularFuerza(Double peso) {
        return peso*MULTIPLICADOR;
    }
}
