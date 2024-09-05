package ej3;

public class calcularSueldoComision {
    private TrabajadorPorComision trabajadorPorComision;
    private double valorComision;

    public calcularSueldoComision(TrabajadorPorComision trabajadorPorComision) {
        this.trabajadorPorComision = trabajadorPorComision;
        this.valorComision = 1000;
    }

    public String calcularSueldoComision() {
        double sueldoComision = trabajadorPorComision.getSalario();
        double totalVentas = trabajadorPorComision.getTotalVnetas();

        return "Sueldo semanal: " + sueldoComision + " Sueldo adicional Comision: " + (totalVentas + this.valorComision)+ " Sueldo Total: " +
                (sueldoComision + (totalVentas + this.valorComision));
    }
}
