package ej7;

public abstract class Empleado {
    private static double GastosSueldosTotales = 0; // Inicialización correcta de la variable estática
    private String nombre;
    private int DNI;
    private double sueldoMensual;
    private double sueldoTotal;

    public Empleado(String nombre, int DNI, double sueldoMensual) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldoMensual = sueldoMensual;
        this.sueldoTotal = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSueldo() {
        return sueldoMensual;
    }

    public void setSueldo(double sueldo) {
        this.sueldoMensual = sueldo;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

    private void setGastosSueldoTotales(double gastosSueldoTotales) {
        GastosSueldosTotales += gastosSueldoTotales;
    }

    public abstract double calcularAdicional();

    public void calcularSueldoTotal() {
        double sueldoTotal = getSueldo() + calcularAdicional();
        setGastosSueldoTotales(sueldoTotal);
        setSueldoTotal(sueldoTotal);

    }


    @Override
    public abstract String toString() ;

    public static double getGastosSueldosTotales() {
        return GastosSueldosTotales;
    }


    public static void main(String[] args) {
        EmpleadoComision empleado1 = new EmpleadoComision("Juan Pérez", 12345678, 30000, 0.05, 100000);
        EmpleadoComision empleado2 = new EmpleadoComision("María López", 87654321, 28000, 0.04, 80000);

        EmpleadoBono empleado3 = new EmpleadoBono("Julián", 12345678, 30000, 51, 50,  1000);
        EmpleadoBono empleado4 = new EmpleadoBono("Mauro", 87654321, 28000, 121, 120,  3000);

        empleado1.calcularSueldoTotal();
        empleado2.calcularSueldoTotal();
        empleado3.calcularSueldoTotal();
        empleado4.calcularSueldoTotal();

        // Mostrar información de los empleados
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);

        // Mostrar gastos totales de sueldos
        System.out.println("Gastos Totales de Sueldos: " + Empleado.getGastosSueldosTotales());
    }

}




