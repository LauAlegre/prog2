package ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes;

    public Sistema() {
        clientes = new ArrayList<>();
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public void listarClientes() {
        for (Cliente c : clientes) {
            Alquiler alquiler = c.getAlquiler();
            Item item = alquiler.getItem();

            if (alquiler != null && alquiler.getItem() != null) {
                System.out.println("Cliente: " + c.getNombre());
                System.out.println("Número de Celular: " + c.getNumeroCel());
                System.out.println("Dirección: " + c.getDireccion());



                System.out.println("Alquiló el ítem: " + item.getNombre());
                System.out.println("Fecha de Alquiler: " + alquiler.getFechaAlquiler());
                System.out.println("Fecha de Devolución: " + alquiler.getFechaDevolucion());
                System.out.println(alquiler.AlquileresVencidos()); // Mostrar estado del alquiler


                System.out.println("-------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Crear una película con solo 1 copia
        Pelicula pelicula1 = new Pelicula("Inception", 15, 3, 1);

        // Crear dos clientes
        Cliente cliente1 = new Cliente("Juan Pérez", 123456789, "Calle Falsa 123");
        Cliente cliente2 = new Cliente("Maria García", 987654321, "Av. Siempre Viva 456");

        // Crear alquileres para los clientes
        Alquiler alquiler1 = new Alquiler(LocalDate.now(), LocalDate.now().plusDays(7));
        Alquiler alquiler2 = new Alquiler(LocalDate.now(), LocalDate.now().plusDays(5));

        // Intentar alquilar la misma película para ambos clientes
        alquiler1.alquilarItem(pelicula1); // Juan alquila la película
        alquiler2.alquilarItem(pelicula1); // María intenta alquilarla también

        // Asignar alquileres a los clientes
        cliente1.addAlquiler(alquiler1);
        cliente2.addAlquiler(alquiler2);

        // Agregar clientes al sistema
        sistema.addCliente(cliente1);
        sistema.addCliente(cliente2);

        // Listar clientes
        sistema.listarClientes();
    }

}


