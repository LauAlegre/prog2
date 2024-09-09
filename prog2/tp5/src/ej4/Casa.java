package ej4;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.empty;

public class Casa {
    private String nombre;
    private List<String> cualidades;
    private int capacidad;
    private List<Alumno> alumnos;
    private boolean requiereFamiliar;
    private List<Casa> casasEnemigas;

    public Casa(String nombre, int capacidad, boolean requiereFamiliar) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requiereFamiliar = requiereFamiliar;
        this.casasEnemigas = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.cualidades = new ArrayList<>();

    }

    public boolean puedeAcceder(Alumno alumno) {
        if(this.capacidad == 0){
            return false;
        }
        if (verificarCasa(alumno)) {
            return false;
        }

        if (!verificarCualidades(alumno)) {
            return false;
        }
        if (requiereFamiliar && !verificarFamiliarEnCasa(alumno)) {
            return false;
        }
        if (verificarFamiliarCasaEnemiga(alumno)) {
            return false;
        }

        return true;
    }


    public boolean verificarCasa(Alumno alumno) {
        if (alumno.getCasa() == null) {
            return false;
        }
        return true;
    }

    public boolean verificarCualidades(Alumno alumno) {
//        List<String> cualidadesAlumno = alumno.getCualidades();
//        int CantCualidadesCasa = this.cualidades.size();
//        int contadorCualidadesIguales = 0;
//
//        for (int i = 0; i < CantCualidadesCasa; i++) {
//        }
        if (alumno.getCualidades().containsAll(this.cualidades)) {
            return true;
        }

        return false;
    }

    public void reducirCapacidad() {
        this.capacidad--;
    }

    public boolean verificarFamiliarEnCasa(Alumno alumno) {
        for (int i = 0; i < alumno.getFamiliares().size(); i++) {
            for (int j = 0; j < this.alumnos.size(); j++) {
                if (alumno.getFamiliares().get(i) == alumno.getFamiliares().get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificarFamiliarCasaEnemiga(Alumno alumno) {
        List<Alumno> familiares = alumno.getFamiliares();
        for (int i = 0; i < familiares.size(); i++) {
            for (int j = 0; j < this.casasEnemigas.size(); j++) {
                if (familiares.get(i).getCasa().getNombre() == this.casasEnemigas.get(j).getNombre()) {
                    return true;
                }
            }

        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void addCasaEnemiga(Casa casa) {
        this.casasEnemigas.add(casa);
    }

    public void addCualidade(String cualidad) {
        this.cualidades.add(cualidad);

    }
    public void addAlumno(Alumno alumno) {
        if(puedeAcceder(alumno)) {
            this.alumnos.add(alumno);
            System.out.println("el alumno " + alumno.getNombre() + " ha sido accedido");
            reducirCapacidad();
        }
    }
}
