package Parcial2023;

import Parcial2023.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class PaqueteFestivo extends ElementoAalquiler{
    private List<ElementoAalquiler> elementos;
    public PaqueteFestivo(int id) {
        super(id);
        this.elementos = new ArrayList<>();
    }
    @Override
    public double getValor() {
        double retorno = 0;
        for (ElementoAalquiler elemento : elementos) {
            retorno += elemento.getValor();
        }
        return retorno;
    }

    @Override
    public int getAntiguedad() {
        int auxAntiguedad = 0;
        for (ElementoAalquiler elemento : elementos) {
            if (elemento.getAntiguedad() > auxAntiguedad) {
                auxAntiguedad = elemento.getAntiguedad();
            }
        }
        return auxAntiguedad;
    }

    @Override
    public List<Elemento> buscar(Condicion c) {
    List<Elemento> retorno = new ArrayList<>();
    for (ElementoAalquiler elemento : elementos) {
        retorno.addAll(elemento.buscar(c));
    }
        return retorno;
    }

    @Override
    public boolean isPromocion(Condicion c) {
        return true;
    }



}
