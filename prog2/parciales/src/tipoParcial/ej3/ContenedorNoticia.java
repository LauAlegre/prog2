package tipoParcial.ej3;

import java.util.ArrayList;
import java.util.List;

public class ContenedorNoticia extends ElementoNoticia{
    private List<ElementoNoticia> elementos;
    public ContenedorNoticia(String titulo) {
        super(titulo);
        elementos = new ArrayList<>();
    }
    public void add(ElementoNoticia elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public ElementoNoticia getElemento() {
        ContenedorNoticia copia = new ContenedorNoticia(this.getTitulo());
        for (ElementoNoticia e : elementos) {
            copia.add(e);
        }
        return copia;
    }

    @Override
    public List<Noticia> buscar(Condicion c) {
        return List.of();
    }

    @Override
    public List<String> getMapaSitio() {
        List<String> mapa = new ArrayList<>();
        for (ElementoNoticia e : elementos) {
            List<String> subMapa = e.getMapaSitio();
            for (String ruta : subMapa) {
                mapa.add(this.getTitulo() + "\\" + ruta);
            }
        }
        return mapa;
    }

        public static void main(String[] args) {
            ContenedorNoticia generales = new ContenedorNoticia("Generales");
            ContenedorNoticia espectaculos = new ContenedorNoticia("Espectáculos");
            Noticia noticia1 = new Noticia("Ultimo momento", "Intro", "Texto largo", "Juan Pérez", "link1");
            Noticia noticia2 = new Noticia("Goleada histórica", "Intro", "Texto", "Pedro Gómez", "link2");

            generales.add(espectaculos);
            espectaculos.add(noticia1);
            espectaculos.add(noticia2);

            // Mapa del sitio
            List<String> mapa = generales.getMapaSitio();
            for (String ruta : mapa) {
                System.out.println(ruta);
            }
        }




}
