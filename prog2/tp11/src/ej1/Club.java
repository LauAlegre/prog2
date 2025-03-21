package ej1;

import ej1.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Club extends ElementoClub {
    private List<Socio>socios;
    public Club() {
        socios = new ArrayList<>();
    }

    @Override
    public ArrayList<Socio> buscar(Condicion c) {
        ArrayList<Socio> salida=new ArrayList();
        for (Socio s : socios) {
            salida.addAll(s.buscar(c));
        }

        return salida;
    }
    public void addSocio(Socio s) {
        socios.add(s);
    }

}
