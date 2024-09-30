import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    ArrayList<Cliente> clientes;
    public Biblioteca() {
        this.clientes = new ArrayList<>();
    }
    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }
    public double getPrecio(Producto pp, Cliente cc) {
        double valorProducto = pp.getPrecio();
        return valorProducto - valorProducto*cc.getDescuento();
    }
    public boolean yaCompro(Producto p, Cliente c) {
        return c.yaCompro(p);
    }
    public boolean leGustaProducto(Cliente cc,Producto pp ) {
        return cc.leGusta(pp);
    }
    public List<Cliente> getClientesGustan(Producto p) {
        List<Cliente> clientes = new ArrayList<>();
        for(int i = 0; i < this.clientes.size(); i++) {
            Cliente c = this.clientes.get(i);
            if(c.leGusta(p)){
                clientes.add(c);
            }
        }
        return clientes;
    }
}
