package parcial22lego;

import java.util.List;

public abstract class ElementoJugeteria implements Comparable<ElementoJugeteria> {
    private String marca;

    public ElementoJugeteria(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract double getPeso();
    public abstract double getCosto();
    public abstract String getColor();
    public abstract int getEncastres();
    public abstract List<ElementoJugeteria>busqueda(Condicion c);

    @Override
    public int compareTo(ElementoJugeteria otro) {
        int cmp = this.marca.compareTo(otro.marca);
        if (cmp != 0) return cmp;  // Si las marcas son diferentes, devuelve comparación.

        cmp = Double.compare(this.getCosto(), otro.getCosto());
        if (cmp != 0) return cmp;  // Si los costos son diferentes, devuelve comparación.

        cmp = Integer.compare(this.getEncastres(), otro.getEncastres());
        if (cmp != 0) return cmp;  // Si los encastres son diferentes, devuelve comparación.

        return this.getColor().compareTo(otro.getColor());  // Finalmente, compara por color.
    }


}
