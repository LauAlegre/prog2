package ej7;

public class EmpleadoComision extends Empleado {
    private double comision;
    private double totalVentas;

    public EmpleadoComision(String nombre, int DNI, double sueldoMensual, double comision, double totalVentas) {
        super(nombre, DNI, sueldoMensual);
        this.comision = comision;
        this.totalVentas = totalVentas;


    }

    @Override
    public double calcularAdicional() {
        return this.comision * this.totalVentas;
    }

    @Override
    public String toString() {
        return "EmpleadoComision{" +
                "nombre='" + getNombre() + '\'' +
                ", DNI=" + getDNI() +
                ", sueldoMensual=" + getSueldo() +
                ", comision=" + comision +
                ", totalVentas=" + totalVentas +
                ", sueldoTotal=" + getSueldoTotal() +
                '}';
    }






}

