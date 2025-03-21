package parcial2022;

import java.util.List;

public abstract class ElementoPortal {
    public abstract List<Noticia> buscar(Condicion condicion);
    public abstract String getCategoria();
    public abstract List<String> getPalabrasClaves();



}
