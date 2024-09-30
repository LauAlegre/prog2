package ej2;



public class CondicionConatarPalabras extends Condicion{
    private int cantPalabras;
    public CondicionConatarPalabras(int cantPalabras) {
        this.cantPalabras = cantPalabras;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.contarPalabras()<cantPalabras;
    }
}
