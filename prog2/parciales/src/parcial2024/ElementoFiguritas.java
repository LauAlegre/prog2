package parcial2024;

import java.util.List;

public abstract class ElementoFiguritas {
    private String nombre;
    public ElementoFiguritas(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract double getPrecio();
    public abstract int getCantFiguritas();
    public abstract ElementoFiguritas getCopia(Condicion C);


}
