package tipoParcial.ej3;

import java.util.List;

public abstract class ElementoNoticia {
    private String titulo;

    public ElementoNoticia(String titulo) {
        this.titulo = titulo;
    }
    public  String getTitulo(){
        return titulo;
    }
    public abstract ElementoNoticia getElemento();
    public abstract List<Noticia> buscar(Condicion c);
    public abstract List<String> getMapaSitio();



}
