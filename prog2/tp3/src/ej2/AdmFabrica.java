package ej2;

import java.util.ArrayList;
import java.util.List;

public class AdmFabrica {
    public static void mostrarProductos(List <Producto> productos) {
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getNombre());
            System.out.println("Color: " + p.getColor());
            System.out.println("Madera: " + p.getMadera());
            System.out.println("Costo de fabricación: " + p.getCosto());
            System.out.println("Precio de venta: " + p.getPrecioVenta());
            System.out.println("----------------------------");
        }
    }
    public static void mostrarTotalCosto(double total){
        System.out.println("Total costo "+ total);
    }
    public static void mostrarTotalPrecioVneta(double total){
        System.out.println("Total Precio de venta "+ total);
    }

    public static void main(String[] args) {
        // Crear objetos de los diferentes productos
        Silla silla1 = new Silla("Silla de comedor", 50.0, 0, "Roble", "Blanco");
        Mesa mesa1 = new Mesa("Mesa de comedor", 150.0, 0, "Caoba", "Marrón");
        Bancos banco1 = new Bancos("Banco de jardín", 75.0, 0, "Pino", "Verde");

        // Agregar los productos a una lista
        Fabrica fabrica = new Fabrica();
        fabrica.agregarProducto(silla1);

        fabrica.agregarProducto(mesa1);
        fabrica.agregarProducto(banco1);

        mostrarProductos(fabrica.getProductosDisponibles());
        mostrarTotalCosto(fabrica.totalCostoStock());
        mostrarTotalPrecioVneta(fabrica.totalPrecioVentaStock());

    }

}
