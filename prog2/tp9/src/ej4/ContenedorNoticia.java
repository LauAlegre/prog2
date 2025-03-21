package ej4;

import ej4.Condicion.Condicion;

import java.util.ArrayList;
import java.util.List;

public class ContenedorNoticia extends CompNoticiaPrincipal {
    private String descripcion;
    private String imagen;
    private List<ContenedorNoticia> subContenedores;
    private List<Noticia> noticias;

    public ContenedorNoticia(String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.subContenedores = new ArrayList<>();
        this.noticias = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void addSubContenedor(ContenedorNoticia contenedor) {
        subContenedores.add(contenedor);
    }
    public void addNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    @Override
    public int contarNoticias() {
        int contador = 0;
        for (Noticia noticia : noticias) {
            contador += noticia.contarNoticias();
        }
        return contador;
    }

    @Override
    public List<Noticia> buscar(Condicion cond) {
        ArrayList<Noticia> retorno = new ArrayList<>();

        // Buscar en las noticias actuales
        for (Noticia noticia : noticias) {
            if (cond.cumple(noticia)) {
                retorno.add(noticia);
            }
        }

        // Buscar en los subcontenedores de manera recursiva
        for (ContenedorNoticia contenedor : subContenedores) {
            retorno.addAll(contenedor.buscar(cond));
        }

        return retorno;
    }
}

