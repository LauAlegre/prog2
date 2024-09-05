package ej3;

public class CalcularSueldoFijo {
    private TrabajadorFijo trabajador;

    public CalcularSueldoFijo(TrabajadorFijo trabajador) {
        this.trabajador = trabajador;
    }

    public String calcularSueldo(){
        double sueldo = this.trabajador.getSalario();
        return "Sueldo semanal: " + sueldo;
    }

}

