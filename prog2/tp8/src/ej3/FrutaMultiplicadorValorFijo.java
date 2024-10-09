package ej3;

public class FrutaMultiplicadorValorFijo extends FrutaPrincipal{
    private static final double MULTIPLICADOR = 7;

    public FrutaMultiplicadorValorFijo(String nombre, double fuerza) {
        super(nombre, fuerza);
    }

    @Override
    public double calcularFuerza(Double peso) {
        return getFuerza() + peso * MULTIPLICADOR;
    }
}
