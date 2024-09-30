package ej2;

public abstract class Envio {
    private String numeroTracking;
    private String destinatario;
    private String direccionDestinatario;
    private String remitente;
    private String direccionRemitente;
    private double peso;
    private boolean envioADomicilio;

    public Envio(String numeroTracking, String destinatario, String direccionDestinatario,
                 String remitente, String direccionRemitente, double peso, boolean envioADomicilio) {
        this.numeroTracking = numeroTracking;
        this.destinatario = destinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.remitente = remitente;
        this.direccionRemitente = direccionRemitente;
        this.peso = peso;
        this.envioADomicilio = envioADomicilio;
    }

    public void setNumeroTracking(String numeroTracking) {
        this.numeroTracking = numeroTracking;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEnvioADomicilio(boolean envioADomicilio) {
        this.envioADomicilio = envioADomicilio;
    }

    public String getNumeroTracking() {
        return numeroTracking;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isEnvioADomicilio() {
        return envioADomicilio;
    }
    public abstract double calculaPeso() ;
}
