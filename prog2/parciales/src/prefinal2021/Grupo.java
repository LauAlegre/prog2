package prefinal2021;

import java.util.ArrayList;
import java.util.List;

public  class Grupo extends ElementoNoticia {
    private int posCat;
    private List<ElementoNoticia> elementos;
    public Grupo(int posCat) {
        this.posCat = posCat;
        this.elementos = new ArrayList<>();
    }
    public void add(ElementoNoticia e) {
        elementos.add(e);
    }
    @Override
    public String getTema() {
        if(elementos.isEmpty()) return null;
        if(elementos.size() >= posCat) return elementos.get(posCat-1).getTema();
        return elementos.get(0).getTema();
    }

    @Override
    public ElementoNoticia getCopia(Condicion c) {
        Grupo copia = getCascaron();
        boolean encontrado = false;
        for(ElementoNoticia elemento : this.elementos) {
            if(elemento.getCopia(c) != null){
                copia.add(elemento);
                encontrado = true;
            }
        }
       if(!encontrado) return null;
       return copia;
    }
    public Grupo getCascaron(){
        return new Grupo(posCat);
    }

    @Override
    public int cantNotCumple(Condicion c) {
        int suma = 0;
        for(ElementoNoticia elemento : this.elementos) {
            suma += elemento.cantNotCumple(c);
        }
        return suma;
    }
}
