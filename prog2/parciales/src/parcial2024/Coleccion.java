package parcial2024;

import java.util.ArrayList;
import java.util.List;

public class Coleccion extends ElementoFiguritas{

    public static int TOPEDESCUENTO=50;
    private int descuentoXfigurita;
    private List<ElementoFiguritas>elementos;
    public Coleccion(String nombre,int descuentoXfigurita) {
        super(nombre);
        this.descuentoXfigurita = descuentoXfigurita;
       this.elementos = new ArrayList<>();
    }

    public int getDescuentoXfigurita() {
        return descuentoXfigurita;
    }
    public void addElemento(ElementoFiguritas elemento){
        elementos.add(elemento);
    }

    public void setTOPEDESCUENTO(int TOPEDESCUENTO) {
        this.TOPEDESCUENTO = TOPEDESCUENTO;
    }

    @Override
    public double getPrecio() {
        int porcentaje=getDescuento();
        if(porcentaje>TOPEDESCUENTO){
            porcentaje=TOPEDESCUENTO;
        }
        return this.sumarPrecios() - ((sumarPrecios()*porcentaje)/100);
    }
    public double sumarPrecios(){
        double suma = 0;
        for(ElementoFiguritas elemento : elementos){
            suma += elemento.getPrecio();
        }
        return suma;
    }
    public int getDescuento(){
        return getCantFiguritas()*this.descuentoXfigurita;
    }

    @Override
    public int getCantFiguritas() {
        int cantFiguritas = 0;
        for (ElementoFiguritas elemento : elementos) {
            cantFiguritas += elemento.getCantFiguritas();
        }
        return cantFiguritas;
    }

    @Override
    public ElementoFiguritas getCopia(Condicion c) {
        Coleccion copia = this.cascaron();
        boolean agrego = false;
        for (ElementoFiguritas elemento : elementos) {
            ElementoFiguritas aux = elemento.getCopia(c);
            if(aux != null){
                copia.addElemento(aux);
                agrego = true;
            }
        }
        if(agrego){
            return copia;
        }
        return null;
    }

    protected Coleccion cascaron(){
        return new Coleccion(this.getNombre(),getDescuentoXfigurita());
    }
}
