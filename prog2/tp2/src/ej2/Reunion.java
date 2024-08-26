package ej2;



import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Reunion {
    private String ubicacion;
    private List<Contacto> contactos;
    private String tema;
    private LocalDateTime inicio;
    private Duration duracion;

    public Reunion(String lugar, List<Contacto> contactos, String tema, LocalDateTime inicio, Duration duracion) {
        this.ubicacion = lugar;
        this.contactos = contactos;
        this.tema = tema;
        this.inicio = inicio;
        this.duracion = duracion;

    }
    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFin() {
        return inicio.plus(duracion);
    }

    public String getTema() {
        return tema;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Contacto> getParticipantes() {
        return contactos;
    }

}


