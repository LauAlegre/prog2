package prefinal2021;

import java.time.LocalDate;

public class NoticiaVentana extends Noticia{
    private LocalDate fecha;
    public NoticiaVentana(String titulo, String texto, String autor, String tema, LocalDate fech) {
        super(titulo, texto, autor, tema);
        fecha = fech;
    }
    public void add(String e){
        if(LocalDate.now().isAfter(fecha)){
            super.add(e);
        }
    }
    public NoticiaVentana getCascaron(){
        return new NoticiaVentana(getTitulo(), getTexto(), getAutor(), getTema(), fecha);
    }
}

