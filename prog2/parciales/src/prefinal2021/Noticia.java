package prefinal2021;

import java.util.ArrayList;
import java.util.List;

public class Noticia extends ElementoNoticia{
    private String titulo;
    private String texto;
    private String autor;
    private String tema;
    private List<String>com;
    public Noticia(String titulo, String texto, String autor, String tema) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.tema = tema;
        com = new ArrayList<>();

    }
    public void add(String e){
        com.add(e);
    }

    @Override
    public String getTema() {
        return this.tema;
    }

    @Override
    public ElementoNoticia getCopia(Condicion c) {
        if(c.cumple(this)){
           return getCascaron();
        }
        return null;
    }
    public Noticia getCascaron(){
        return new Noticia(titulo, texto, autor, tema);

    }

    public String getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int cantNotCumple(Condicion c) {
        if(c.cumple(this))return 1;
        return 0;
    }
}
