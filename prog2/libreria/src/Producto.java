import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private String autor;
    private double precio;
    private String descripcion;
    private List<String>genereosLiterarios;

    public Producto(String nombre, String autor, double precio, String descripcion) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.descripcion = descripcion;
        this.genereosLiterarios = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getGenereosLiterarios() {
        return genereosLiterarios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void addtGenereosLiterarios(String genero) {
        this.genereosLiterarios.add(genero);
    }
    public boolean tieneGenero(String genero) {
        return this.genereosLiterarios.contains(genero);
    }
}
