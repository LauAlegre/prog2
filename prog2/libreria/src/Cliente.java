import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    protected  ArrayList<String> generos;
    private ArrayList<String> autoresF;
    private ArrayList<Producto> compras;
    private double descuento;

    public Cliente(String nombre, String apellido, int dni) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.descuento = 0;
        this.generos = new ArrayList<String>();
        this.autoresF = new ArrayList<String>();
        this.compras = new ArrayList<Producto>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    //ARRAYGENERO
    public void addGenero(String genero) {
        if(!this.generos.contains(genero)) {
            this.generos.add(genero);
        }
    }
    public boolean leGustaGenero(String genero) {
        return this.generos.contains(genero);
    }
    public void noGustaGenero(String genero) {
        if(this.generos.contains(genero)) {
            this.generos.remove(genero);
        }

    }

    //ARRAYAutores
    public void addAutores(String autoresf) {
        if(!this.autoresF.contains(autoresf)) {
            this.autoresF.add(autoresf);
        }
    }
    public boolean leGustaAutore(String autoresf) {
        return this.autoresF.contains(autoresf);
    }
    public void noGustaAutor(String autoresf) {
        if(this.autoresF.contains(autoresf)) {
            this.autoresF.remove(autoresf);
        }
    }

    //arrayCompra
    public void addCompra(Producto compra) {
        this.compras.add(compra);
    }
    public boolean yaCompro(Producto compra) {
        return this.compras.contains(compra);
    }
    public boolean leGusta(Producto p){
        return this.autoresF.contains(p.getAutor());
    }

}
