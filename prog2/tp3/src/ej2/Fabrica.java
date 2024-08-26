package ej2;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private List<Producto>productos;

    public Fabrica() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List getProductosDisponibles(){
        return productos;
    }

    public double totalCostoStock(){
        double total = 0;
        for(Producto producto: productos){
            total += producto.getCosto();
        }
        return total;
    }
    public double totalPrecioVentaStock(){
        double total = 0;
        for(Producto producto: productos){
            total += producto.getPrecioVenta();
        }
        return total;
    }

}
