public class ClienteExigente extends Cliente {

    public ClienteExigente(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
    }
    public boolean leGusta(Producto p){
        boolean autorFav = super.leGusta(p);
        if(autorFav){
            for(int i = 0; i< generos.size();i++){
                if(p.tieneGenero(generos.get(i))){
                    return true;
                }
            }
        }

    }
}
