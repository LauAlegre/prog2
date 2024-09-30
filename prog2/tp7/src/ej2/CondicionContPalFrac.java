package ej2;



public class CondicionContPalFrac extends Condicion {

    private String palabra_frace;
    public CondicionContPalFrac(String palabra_frace) {
        this.palabra_frace = palabra_frace;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTexto().contains(palabra_frace);
    }

}
