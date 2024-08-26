package ej3;

import java.util.ArrayList;
import java.util.List;

public class MazoCartas {
    private List<Carta> mazo;

    public MazoCartas() {
        mazo = new ArrayList<>();
    }
    public void addCarta(Carta carta) {
        this.mazo.add(carta);
    }
    public List<Carta> getCartas() {
        return mazo;
    }
}
