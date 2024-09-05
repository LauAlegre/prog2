package ej3;

public class TrabajadorPorComision extends Trabajador{

    private double totalVnetas;


    public TrabajadorPorComision(String nombre, String puestoTrabajo, double salario, double totalVnetas) {
        super(nombre, puestoTrabajo, salario);
        this.totalVnetas = totalVnetas;

    }
    public double getTotalVnetas() {
        return totalVnetas;
    }
}
