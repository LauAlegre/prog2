package tipoParcial.ej3;

import java.util.ArrayList;
import java.util.List;

public class Noticia extends ElementoNoticia {
    private String introduccion,texto,autor,link;
    private List<String>palabrasclaves;

    public Noticia(String titulo, String introduccion, String texto, String autor,String link) {
        super(titulo);
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.palabrasclaves = new ArrayList<>();
        this.link = link;
    }

    public String getLink(){
        return this.link;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public String getAutor() {
        return autor;
    }

    public List<String> getPalabrasclaves() {
        return palabrasclaves;
    }

    @Override
    public ElementoNoticia getElemento() {
        Noticia copia = new Noticia(this.getTitulo(),this.getIntroduccion(),this.getTexto(),this.getAutor(),this.getLink());
        return copia;
    }

    @Override
    public List<Noticia> buscar(Condicion c) {
        List<Noticia> noticias = new ArrayList<>();
        if(c.Cumple(this)){
            noticias.add(this);
        }
        return noticias;
    }


    @Override
    public List<String> getMapaSitio() {
        List<String> mapa = new ArrayList<>();
        mapa.add(link);  // La noticia solo devuelve su link
        return mapa;
    }



    public boolean contienePalabra(String palabra) {
        if (palabrasclaves.contains(palabra)) {
            return true;
        }
        return false;
    }
}
