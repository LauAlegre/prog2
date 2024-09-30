package ej1;


public class Pelicula extends Item {
    private int cantCopias;

    public Pelicula(String nombre, double precio, double precioAlquiler, int cantCopias) {
        super(nombre, precio, precioAlquiler);
        this.cantCopias = cantCopias; // Corrección del constructor
    }

    @Override
    public void ocupar() {
        if (this.cantCopias > 0) {
            this.cantCopias--;
            if (this.cantCopias == 0) {
                super.setDisponible(false); // Se marca como no disponible si no hay más copias
            }
        } else {
            System.out.println("No hay más copias disponibles para alquilar.");
        }
    }

    @Override
    public void desocupar() {
        this.cantCopias++;
        if (this.cantCopias > 0) {
            super.setDisponible(true); // Vuelve a estar disponible cuando hay al menos una copia
        }
    }

    public int getCantCopias() {
        return cantCopias;
    }
}

