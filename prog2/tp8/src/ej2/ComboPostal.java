package ej2;

import java.util.ArrayList;
import java.util.List;

public class ComboPostal extends Envio {
    private List<Envio>envios;
    private boolean destinatarioRemitente;
    public ComboPostal(String numeroTracking, String destinatario, String direccionDestinatario, String remitente, String direccionRemitente, double peso, boolean envioADomicilio) {
        super(numeroTracking, null, null, null, null, 0, envioADomicilio);
        this.envios = new ArrayList<>();
        this.destinatarioRemitente = false;
    }

    private void setDestinatarioRemitente(Envio envio) {
            destinatarioRemitente = true;
            super.setDestinatario(envio.getDestinatario());
            super.setDireccionDestinatario(envio.getDireccionDestinatario());
            super.setRemitente(envio.getRemitente());
            super.setDireccionRemitente(envio.getDireccionRemitente());
    }
    public void addEnvio(Envio envio) {
        envio.setNumeroTracking(this.getNumeroTracking());
        envios.add(envio);
        if (!destinatarioRemitente) {
            setDestinatarioRemitente(envio);
        }
    }
    public void deleteEnvio(Envio envio) {
        envios.remove(envio);
        if (envios.isEmpty()) {
            destinatarioRemitente = false;
        }


    }
    public boolean getDestinatarioRemitente() {
        return destinatarioRemitente;
    }



    @Override
    public double calculaPeso() {
        double pesoTotal = 0;
        for (Envio envio : envios) {
            pesoTotal += envio.calculaPeso();
        }
        return pesoTotal;
    }
}
