package ej3;

public class Personaje  extends ComponentePersonaje{
    private FrutaPrincipal frutaIngerida;
    public Personaje(String nombre, double peso, int edad) {
        super(nombre, peso, edad);
        this.frutaIngerida = null;
    }
    public FrutaPrincipal getFrutaIngerida() {
        return this.frutaIngerida;
    }
    public void ingerirFruta(FrutaPrincipal f) {
        this.frutaIngerida = f;
    }

    @Override
    public double calcularFuerza() {
        if (this.frutaIngerida != null) {
            return this.frutaIngerida.calcularFuerza(this.getPeso());
        }
        return ComponentePersonaje.getFuerza();
    }



    @Override
    public double calcularPeso() {
        return this.getPeso();
    }

    @Override
    public int calcularEdad() {
        return this.getEdad();
    }
}
