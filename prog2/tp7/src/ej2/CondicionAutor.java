package ej2;



public class CondicionAutor extends Condicion{
    private String autor;
    public CondicionAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public boolean cumple(Documento documento) {
        return documento.existeAutor(this.autor);
    }
}
