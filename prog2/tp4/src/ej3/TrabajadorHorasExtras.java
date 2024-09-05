package ej3;

public class TrabajadorHorasExtras extends Trabajador{

    private double horasExtras;

    public TrabajadorHorasExtras(String nombre, String puestoTrabajo, double salario, double horasExtras) {
        super(nombre, puestoTrabajo, salario);
        this.horasExtras = horasExtras;


    }
    public double getHorasExtras() {
        return horasExtras;
    }
}
