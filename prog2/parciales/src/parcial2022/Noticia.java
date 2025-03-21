package parcial2022;

import java.util.ArrayList;
import java.util.List;

public class Noticia extends ElementoPortal{
    private String contenido;
    private String titulo;
    private String autor;
    private String categoria;
    private List<String> palabrasClaves;

    public Noticia(String contenido, String titulo, String autor, String categoria) {
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        palabrasClaves = new ArrayList<>();
    }

    public String getContenido() {
        return contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void addPalabrasClave(String palabraClave) {
        palabrasClaves.add(palabraClave);
    }

    @Override
    public List<Noticia> buscar(Condicion condicion) {
        List<Noticia> retorno = new ArrayList<>();
        if(condicion.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public List<String> getPalabrasClaves() {
        return new ArrayList<>(this.palabrasClaves);
    }

    public void completarPalabrasClaves(Completador c) {
         c.completarNoticia(this);
    }
}
