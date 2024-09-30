package ej1;

import java.util.ArrayList;
import java.util.List;

public class AdmAgroquimicos {
    private List<ProductoQuimico> productosQuimicos;

    public AdmAgroquimicos() {
        productosQuimicos = new ArrayList<>();
    }

    public void addProducto(ProductoQuimico producto) {
        if (!productosQuimicos.contains(producto)) {
            productosQuimicos.add(producto);
        }
    }

    public void removeProducto(ProductoQuimico producto) {
        productosQuimicos.remove(producto);
    }

    // Método que filtra los productos químicos según una condición
    public List<ProductoQuimico> filtrarAgroquimicosPorCondicion(Condicion condicion) {
        List<ProductoQuimico> productosFiltrados = new ArrayList<>();
        for (ProductoQuimico p : productosQuimicos) {
            if (condicion.cumple(p)) {
                productosFiltrados.add(p);
            }
        }
        return productosFiltrados;
    }

    public static void main(String[] args) {
        // Crear instancia de AdmAgroquimicos
        AdmAgroquimicos adm = new AdmAgroquimicos();

        // Crear productos químicos y agregarles patologías y cultivos no recomendados
        ProductoQuimico producto1 = new ProductoQuimico("Fungicida A");
        producto1.addPatologia("Hojas Amarillas"); // Patologías que trata
        producto1.addPatologia("Deshidratación");
        producto1.addcultivo("Maíz"); // Cultivo no recomendado para este producto

        ProductoQuimico producto2 = new ProductoQuimico("Insecticida B");
        producto2.addPatologia("Plagas");
        producto2.addPatologia("Hojas Amarillas"); // Patologías que trata
        producto2.addcultivo("Tomate"); // Cultivo no recomendado para este producto

        ProductoQuimico producto3 = new ProductoQuimico("Herbicida C");
        producto3.addPatologia("Malezas");
        producto3.addPatologia("Deshidratación"); // Patologías que trata
        producto3.addcultivo("Pimientos"); // Cultivo no recomendado para este producto

        // Añadir productos químicos a la administración
        adm.addProducto(producto1);
        adm.addProducto(producto2);
        adm.addProducto(producto3);

        // Crear enfermedades con estados patológicos
        Enfermedad enfermedad1 = new Enfermedad("Moho");
        enfermedad1.addPatologia("Hojas Amarillas");
        enfermedad1.addPatologia("Deshidratación");

        // Crear cultivos
        Cultivo cultivo1 = new Cultivo("Tomate");
        cultivo1.addEnfermedad(enfermedad1);

        // Condición solo para la enfermedad
        Condicion condicionEnfermedad = new CondicionEnfermedad(enfermedad1);
        System.out.println("Agroquímicos que tratan 'Moho':");
        for (ProductoQuimico p : adm.filtrarAgroquimicosPorCondicion(condicionEnfermedad)) {
            System.out.println("- " + p.getNombre());
        }

        // Condición para un cultivo específico y una enfermedad
        Condicion condicionCultivoEnfermedad = new CondicionCultivoEnfermedad(cultivo1, enfermedad1);
        System.out.println("Agroquímicos aptos para el cultivo 'Tomate' y que tratan 'Moho':");
        for (ProductoQuimico p : adm.filtrarAgroquimicosPorCondicion(condicionCultivoEnfermedad)) {
            System.out.println("- " + p.getNombre());
        }
    }
}
