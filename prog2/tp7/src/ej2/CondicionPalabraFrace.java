package ej2;

import ej3.Planta;

public class CondicionPalabraFrace extends Condicion{
    private String palabra_frace;
    public CondicionPalabraFrace(String palabra_frace) {
        this.palabra_frace = palabra_frace;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().contains(palabra_frace);
    }
}
