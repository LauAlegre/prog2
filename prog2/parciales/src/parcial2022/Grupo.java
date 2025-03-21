package parcial2022;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends ElementoPortal{
    private List<ElementoPortal>elementos;
    private static final String mensaje = "Sin definir";
    private int posCategoria;

    public Grupo(int posCategoria) {
        this.posCategoria = posCategoria;
        this.elementos = new ArrayList<>();
    }
    public void addElemento(ElementoPortal elemento) {
        elementos.add(elemento);
    }

    @Override
    public List<Noticia> buscar(Condicion condicion) {
        List<Noticia> salida = new ArrayList<>();
        for (ElementoPortal elemento : elementos) {
            salida.addAll(elemento.buscar(condicion));
        }
        return salida ;
    }

    @Override
    public String getCategoria() {
        String categoria = "";
        if(this.elementos.size()<posCategoria){
            return mensaje;
        }
       categoria = this.elementos.get(this.posCategoria).getCategoria();
        return categoria;
    }

    @Override
    public List<String> getPalabrasClaves() {
        List<String> palabrasClaves = new ArrayList<>();
        for (ElementoPortal elemento : elementos) {
            for(String palabraClave : elemento.getPalabrasClaves()){
                if(!palabrasClaves.contains(palabraClave)){
                    palabrasClaves.add(palabraClave);
                }
            }

        }
        return palabrasClaves;
    }
}
