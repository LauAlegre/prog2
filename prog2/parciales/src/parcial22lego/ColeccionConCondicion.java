package parcial22lego;



public class ColeccionConCondicion extends ColeccionLego {
    private Condicion condicion;
    public ColeccionConCondicion(String nombre, int descuentoXfigurita, Condicion condicion) {
        super(nombre, descuentoXfigurita);
        this.condicion=condicion;
    }
    public void add(ElementoJugeteria elemento) {
        if(this.condicion.cumple(elemento)){
            super.add(elemento);
        }
    }

}
