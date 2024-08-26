package ej3;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void addCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public void mostrarCiudadesConDeficit() {
        for (Ciudad ciudad : ciudades) {
            if (ciudad.tieneDeficit() && ciudad.getPoblacion() > 100000) {
                System.out.println("Ciudad con déficit: " + ciudad.getNombre());
            }
        }
    }

    public void mostrarProvinciaConDeficit() {
        int contadorCiudades = 0;
        int ciudadDeficit = 0;

        for (Ciudad ciudad : ciudades) {
            if(ciudad.getPoblacion() > 100000){
                contadorCiudades++;
                if (ciudad.tieneDeficit()) {
                    ciudadDeficit++;
                }
            }


        }

        // Nota: Debe ser ciudadDeficit > contadorCiudades / 2.0
        if (ciudadDeficit > contadorCiudades / 2.0) {
            System.out.println("Provincia con déficit: " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
