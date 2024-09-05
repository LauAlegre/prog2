package ej3;

public class Trabajador {
    private String nombre;
    private String puestoTrabajo;
    private double salario;
    private double horasTrabajadas;

    public Trabajador(String nombre, String puestoTrabajo, double salario) {
        this.nombre = nombre;
        this.puestoTrabajo = puestoTrabajo;
        this.salario = salario;

    }

    public String getNombre() {
        return nombre;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public double getSalario() {
        return salario;
    }


    public static void main(String[] args) {
        // Trabajador con horas extras
        TrabajadorHorasExtras trabajadorHorasExtras = new TrabajadorHorasExtras("Juan", "Desarrollador", 5000, 10);
        CalcularSueldoExtra calcularSueldoExtra = new CalcularSueldoExtra(trabajadorHorasExtras);
        System.out.println(calcularSueldoExtra.calcularSueldo());

        // Trabajador por comisión
        TrabajadorPorComision trabajadorPorComision = new TrabajadorPorComision("Ana", "Vendedor", 4000, 5000);
        calcularSueldoComision calcularSueldoComision = new calcularSueldoComision(trabajadorPorComision);
        System.out.println(calcularSueldoComision.calcularSueldoComision());

        // Trabajador fijo
        TrabajadorFijo trabajadorFijo = new TrabajadorFijo("Pedro", "Gerente", 8000);
        CalcularSueldoFijo calcularSueldoFijo = new CalcularSueldoFijo(trabajadorFijo);
        System.out.println(calcularSueldoFijo.calcularSueldo());
    }
}
