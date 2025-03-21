package prefinal2023;



import java.util.ArrayList;

public class Coleccion extends ElementoColeccion{
    private static int PORCENTAJE = 1;
    private ArrayList<ElementoColeccion> elementos;
    public Coleccion(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }
    public void add(ElementoColeccion elemento) {

        elementos.add(elemento);
    }

    @Override
    public int getAnio() {
        int anios = 0;
        for (ElementoColeccion elemento : elementos) {
            anios += elemento.getAnio();
        }
        return anios/contElementos();
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        double porc = contElementos() * PORCENTAJE;
        for (ElementoColeccion elemento : elementos) {
            precio += elemento.getPrecio();
        }
        return ((precio*porc)/100) + precio;
    }

    @Override
    public int getPeso() {
        int peso = 0;
        for (ElementoColeccion elemento : elementos) {
            peso += elemento.getPeso();
        }
        return peso;
    }

    @Override
    public boolean pertenece(ObjetoColecion c) {
        for (ElementoColeccion elemento : elementos) {
            if (elemento.pertenece(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected ArrayList<ObjetoColecion> getLista(Condicion c) {
        ArrayList<ObjetoColecion> lista = new ArrayList<>();
        for (ElementoColeccion elemento : elementos) {
            ArrayList<ObjetoColecion> aux = elemento.getLista(c);
            if (!aux.isEmpty()) {
                lista.addAll(aux);
            }
        }
        return lista;
    }

    @Override
    public int contElementos() {
        int contElementos = 0;
        for (ElementoColeccion elemento : elementos) {
            contElementos += elemento.contElementos();
        }
        return contElementos;
    }
}
