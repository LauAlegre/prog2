
   package ej1;

import java.util.ArrayList;
import java.util.List;

    public class Cultivo {
        private String nombre;
        private List<Enfermedad> enfermedadesFrecuentes;

        public Cultivo(String nombre) {
            this.nombre = nombre;
            this.enfermedadesFrecuentes = new ArrayList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public boolean existeEnfermedad(Enfermedad e) {
            return enfermedadesFrecuentes.contains(e);
        }

        public void addEnfermedad(Enfermedad e) {
            enfermedadesFrecuentes.add(e);
        }

        public boolean removeEnfermedad(Enfermedad e) {
            return enfermedadesFrecuentes.remove(e);  // Devuelve true si se elimina, false si no se encuentra
        }


        public boolean sirveQuimico(ProductoQuimico p) {

            if (p.exisCultivo(nombre)) {
                return false;
            }
            for (Enfermedad enfermedad : enfermedadesFrecuentes) {
                for (String estadoPatologico : enfermedad.getEstadosPatologicos()) {
                    if (!p.existePatologia(estadoPatologico)) {
                        return false;
                    }
                }
            }

            return true;
        }
    }



