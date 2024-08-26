package ej4;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Celular {
    private List<Contacto>contactos;

    public Celular() {
        contactos = new ArrayList<Contacto>();
    }

    public void addContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombre());
            System.out.println("Edad: " + contacto.getEdad().getYears() );
            System.out.println("Telefono: " + contacto.getTelefono());
            System.out.println("Ciudad: " + contacto.getCiudad());
            System.out.println("...............................................");
        }
    }

    public void MostrarContactosRepetidos() {
        System.out.println("////////////////////////////////////////////////////");
       for(int i = 0; i<contactos.size();i++) {
           for(int j = i+1; j<contactos.size();j++) {
               if(contactos.get(i).getTelefono()==contactos.get(j).getTelefono() && contactos.get(i).getNombre()==contactos.get(j).getNombre()&&contactos.get(i).getCiudad()==contactos.get(j).getCiudad()) {

                   System.out.println("Nombre: " + contactos.get(i).getNombre());
                   System.out.println("Edad: " + contactos.get(i).getEdad().getYears());
                   System.out.println("Telefono: " + contactos.get(i).getTelefono());
                   System.out.println("Ciudad: " + contactos.get(i).getCiudad());
                   System.out.println(".....................................................");
                   System.out.println("Nombre: " + contactos.get(j).getNombre());
                   System.out.println("Edad: " + contactos.get(j).getEdad().getYears());
                   System.out.println("Telefono: " + contactos.get(j).getTelefono());
                   System.out.println("Ciudad: " + contactos.get(j).getCiudad());
               }
           }
       }
    }
    public void MostrarContactosCelularRepetido() {
        System.out.println("////////////////////////////////////////////////////");
        for(int i = 0; i<contactos.size();i++) {
            for(int j = i+1; j<contactos.size();j++) {
                if(contactos.get(i).getTelefono()==contactos.get(j).getTelefono() ) {

                    System.out.println("Nombre: " + contactos.get(i).getNombre());
                    System.out.println("Edad: " + contactos.get(i).getEdad().getYears());
                    System.out.println("Telefono: " + contactos.get(i).getTelefono());
                    System.out.println("Ciudad: " + contactos.get(i).getCiudad());
                    System.out.println("..........................................");
                    System.out.println("Nombre: " + contactos.get(j).getNombre());
                    System.out.println("Edad: " + contactos.get(j).getEdad().getYears());
                    System.out.println("Telefono: " + contactos.get(j).getTelefono());
                    System.out.println("Ciudad: " + contactos.get(j).getCiudad());
                    System.out.println("...............................................");
                }
            }
        }


    }

    public int PromedioEdad(){
        int sumEdad = 0;
        int canPersonas = contactos.size();

        for(int i = 0; i<canPersonas; i++) {
            sumEdad += contactos.get(i).getEdad().getYears();
        }
        return sumEdad/canPersonas;
    }

    public static void main(String[] args) {
        // Crear instancias de Contacto
        Contacto contacto1 = new Contacto("Juan Pérez", LocalDate.of(1990, 5, 15), Period.between(LocalDate.of(1990, 5, 15), LocalDate.now()), "Madrid", 123456789);
        Contacto contacto2 = new Contacto("Ana Gómez", LocalDate.of(1985, 10, 22), Period.between(LocalDate.of(1985, 10, 22), LocalDate.now()), "Barcelona", 987654321);
        Contacto contacto3 = new Contacto("Luis Fernández", LocalDate.of(1995, 3, 8), Period.between(LocalDate.of(1995, 3, 8), LocalDate.now()), "Valencia", 456123789);
        Contacto contacto4 = new Contacto("Ana Gómez", LocalDate.of(1985, 10, 22), Period.between(LocalDate.of(1985, 10, 22), LocalDate.now()), "Barcelona", 987654321); // Contacto repetido
        Contacto contacto5 = new Contacto("pau Pérez", LocalDate.of(1990, 5, 15), Period.between(LocalDate.of(1990, 5, 15), LocalDate.now()), "Madrid", 123);
        Contacto contacto6 = new Contacto("papu Pérez", LocalDate.of(1990, 5, 15), Period.between(LocalDate.of(1990, 5, 15), LocalDate.now()), "Madrid", 123);

        // Crear instancia de Celular y agregar contactos
        Celular celular = new Celular();
        celular.addContacto(contacto1);
        celular.addContacto(contacto2);
        celular.addContacto(contacto3);
        celular.addContacto(contacto4);
        celular.addContacto(contacto5);
        celular.addContacto(contacto6);

        // Mostrar todos los contactos
        System.out.println("Lista de contactos:");
        celular.mostrarContactos();

        // Mostrar contactos repetidos
        System.out.println("\nContactos repetidos:");
        celular.MostrarContactosRepetidos();

        System.out.println("\nContactos con numeros  repetidos:");
        celular.MostrarContactosCelularRepetido();

        System.out.println("Promedio edad: " + celular.PromedioEdad());
    }



}
