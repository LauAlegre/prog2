package ej4;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<String>cualidades;
    private List<Alumno> familiares;
    private Casa casa;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();

    }
    public String getNombre() {
        return nombre;
    }

    public List<String> getCualidades() {
        return cualidades;
    }

    public List<Alumno> getFamiliares() {
        return familiares;
    }

    public void asignarCasa(Casa casa){
        this.casa = casa;
    }
    public Casa getCasa() {
        return casa;
    }

    public static void main(String[] args) {
        // Crear algunas casas
        Casa grifindor = new Casa("Grifindor", 3, false); // Casa sin requisito de familiar
        Casa slytherin = new Casa("Slytherin", 2, true); // Casa que requiere un familiar
        Casa ravenclaw = new Casa("Ravenclaw", 2, false); // Casa sin requisito de familiar

        // Establecer enemistad entre casas
        grifindor.addCasaEnemiga(slytherin);
        slytherin.addCasaEnemiga(grifindor);

        // Agregar cualidades requeridas a las casas
        grifindor.addCualidade("Valentía");
        slytherin.addCualidade("Ambición");
        ravenclaw.addCualidade("Inteligencia");

        // Crear alumnos
        Alumno harry = new Alumno("Harry Potter");
        harry.getCualidades().add("Valentía");
        harry.getCualidades().add("Determinación");

        Alumno draco = new Alumno("Draco Malfoy");
        draco.getCualidades().add("Ambición");
        draco.getCualidades().add("Astucia");

        Alumno luna = new Alumno("Luna Lovegood");
        luna.getCualidades().add("Inteligencia");
        luna.getCualidades().add("Creatividad");

        // Establecer familiares (Draco y Harry como familiares en este contexto)
        harry.getFamiliares().add(draco);
        draco.getFamiliares().add(harry);

        // Intentar asignar Draco a Slytherin
        slytherin.addAlumno(draco); // La verificación se hace internamente en addAlumno
        draco.asignarCasa(slytherin); // Se asigna la casa a Draco si pasa la verificación

        // Intentar asignar a Harry a Grifindor
        grifindor.addAlumno(harry); // La verificación se hace internamente en addAlumno
        harry.asignarCasa(grifindor);

        // Intentar asignar a Luna a Ravenclaw
        ravenclaw.addAlumno(luna); // La verificación se hace internamente en addAlumno
        luna.asignarCasa(ravenclaw);

        // Intentar asignar a Harry a Slytherin (debe fallar por enemistad y falta de familiar en casa)
        slytherin.addAlumno(harry); // Se verifica todo internamente, incluyendo las enemistades


    }

}
