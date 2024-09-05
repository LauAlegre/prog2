package ej3;

public class CalcularSueldoExtra {
    private TrabajadorHorasExtras trabajadorHorasExtras;
    private double valorHoraExtra;

    public CalcularSueldoExtra(TrabajadorHorasExtras trabajadorHorasExtras) {
        this.trabajadorHorasExtras = trabajadorHorasExtras;
        this.valorHoraExtra = 1000;
    }
    public String calcularSueldo(){
        double sueldo = this.trabajadorHorasExtras.getSalario();
        double horasExtras = this.trabajadorHorasExtras.getHorasExtras();
        double sueldoExtra = horasExtras * this.valorHoraExtra;

        return "Sueldo semanal: " + sueldo + " Sueldo adicional Horas Extras: " + sueldoExtra + " Sueldo Total: " + (sueldoExtra + sueldo);
    }


}
