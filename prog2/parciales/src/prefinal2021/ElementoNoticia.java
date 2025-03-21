package prefinal2021;

public abstract class ElementoNoticia {
     public abstract String getTema();
     public abstract ElementoNoticia getCopia(Condicion c);
     public abstract int cantNotCumple(Condicion c);
}
