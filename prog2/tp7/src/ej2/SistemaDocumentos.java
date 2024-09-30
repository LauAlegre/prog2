package ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SistemaDocumentos {
    private List<Documento> documentos;

    public SistemaDocumentos() {
        this.documentos = new ArrayList<>();
    }
    public void agregarDocumento(Documento d) {
        if (!this.documentos.contains(d)) {
            this.documentos.add(d);
        }
    }
    public void deleteDocumento(Documento d) {
        this.documentos.remove(d);
    }

    public List<Documento> buscarDocumentos(Condicion condicion) {
        List<Documento> documentosBuscados = new ArrayList<>();
        for (Documento d : this.documentos) {
            if(condicion.cumple(d)){
                documentosBuscados.add(d);
            }
        }
        return documentosBuscados;
    }



}
