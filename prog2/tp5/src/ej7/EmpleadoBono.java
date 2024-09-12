package ej7;

public class EmpleadoBono extends Empleado{
    private int cantVentas;
    private int ventasParaBonos;
    private double precioBono;
    public EmpleadoBono(String nombre, int DNI, double sueldoMensual,int cantVentas, int ventasParaBonos, double precioBono) {
        super(nombre, DNI, sueldoMensual);
        this.cantVentas = cantVentas;
        this.ventasParaBonos = ventasParaBonos;
        this.precioBono = precioBono;

    }

    @Override
    public double calcularAdicional() {
        if(this.cantVentas>=this.ventasParaBonos) {
            return this.precioBono;
        }else {
            return 0;
        }

    }
    public String toString() {
        return "EmpleadoComisionConBono{" +
                "nombre='" + getNombre() + '\'' +
                ", DNI=" + getDNI() +
                ", sueldoMensual=" + getSueldo() +
                ", totalVentas=" + cantVentas +
                ", ventasParaBono=" + ventasParaBonos +
                ", bono=" + precioBono +
                ", sueldoTotal=" + getSueldoTotal() +
                '}';
    }


}
