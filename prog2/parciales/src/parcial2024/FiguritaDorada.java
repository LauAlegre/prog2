package parcial2024;

public class FiguritaDorada extends Figurita {
    private int numeroDisponibles;
    private Condicion condicion;
    private double precioCondicion;
    public FiguritaDorada(String nombre, String marca, String album, int numero, double precio, int disponibles,Condicion condicion, double precioCondicion) {
        super(nombre, marca, album, numero, precio);
        this.numeroDisponibles = disponibles;
        this.condicion = condicion;
        this.precioCondicion = precioCondicion;

    }
    public int getNumeroDisponibles() {
        return numeroDisponibles;
    }
    public void setNumeroDisponibles(int numeroDisponibles) {
        this.numeroDisponibles = numeroDisponibles;
    }
    public double getPrecio(){
        if(this.condicion.cumple(this)){
            return precioCondicion;
        }
        return super.getPrecio();
    }
}
