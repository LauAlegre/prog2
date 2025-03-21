package parcial2022;

import java.util.ArrayList;
import java.util.List;

public class Completador {
    private Condicion con;
    private List<String>palabras;
    public Completador(Condicion con, List<String> palabras) {
        this.con = con;
        this.palabras = new ArrayList<>();
    }
    public void addPalabra(String palabra) {
        palabras.add(palabra);
    }
    public void completarNoticia (Noticia noticia){
        if (con.cumple(noticia)){
            for (String palabra : palabras){
                noticia.addPalabrasClave(palabra);
            }
        }
    }
}
