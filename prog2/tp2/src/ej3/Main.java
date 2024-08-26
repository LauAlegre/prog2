package ej3;

public class Main {
    public static void main(String[] args) {
        Provincia provinciaX = new Provincia("Provincia X");
        Provincia provinciaz = new Provincia("Provincia z");


        provinciaX.addCiudad(new Ciudad("Ciudad A", "Provincia X", 1500000, 1000, 2000, 3000, 4000, 5000, 16200));
        provinciaX.addCiudad(new Ciudad("Ciudad C", "Provincia X", 120, 3000, 4000, 5000, 6000, 7000, 30330));

        provinciaz.addCiudad(new Ciudad("Ciudad X", "Provincia X", 150000, 1000, 2000, 3000, 4000, 5000, 16200));
        provinciaz.addCiudad(new Ciudad("Ciudad M", "Provincia X", 120000, 3000, 4000, 5000, 6000, 7000, 30330));

        provinciaX.mostrarCiudadesConDeficit();
        provinciaX.mostrarProvinciaConDeficit();
        provinciaz.mostrarCiudadesConDeficit();
        provinciaz.mostrarProvinciaConDeficit();
    }
}

