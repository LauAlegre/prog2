package ej2;

public class Paquete extends Envio {
    public Paquete(String numeroTracking, String destinatario, String direccionDestinatario, String remitente, String direccionRemitente, double peso, boolean envioADomicilio) {
        super(numeroTracking, destinatario, direccionDestinatario, remitente, direccionRemitente, peso, envioADomicilio);
    }

    @Override
    public double calculaPeso() {
        return getPeso();
    }
}
