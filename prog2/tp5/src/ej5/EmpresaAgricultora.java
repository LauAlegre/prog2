package ej5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpresaAgricultora {
    private List<Lote>lotes;
    private List<Cereal>cereales;

    public EmpresaAgricultora() {
        this.lotes = new ArrayList<>();
        this.cereales = new ArrayList<>(); ;
    }
    public void addLote(Lote lote) {
        this.lotes.add(lote);
    }
    public void addCereal(Cereal cereal) {
        this.cereales.add(cereal);
    }

    public void tipoDeCerealEnLote(Lote lote) {
        List<String> cerealesAptos = new ArrayList<>();

        // Recorre cada cereal disponible
        for (Cereal cereal : this.cereales) {
            // Verifica si el lote contiene todos los minerales requeridos por el cereal
            if (lote.getMinerales().containsAll(cereal.getMineralesRequeridos())) {
                // Si el cereal es Pasturas, el lote debe tener más de 50 hectáreas
                if (cereal.getTipo().equals("Pasturas") && lote.getHectareas() > 50) {
                    cerealesAptos.add(cereal.getNombre());
                }
                // Si no es Pasturas, lo añade directamente
                else if (!cereal.getTipo().equals("Pasturas")) {
                    cerealesAptos.add(cereal.getNombre());
                }
            }
        }

        // Muestra los cereales aptos
        System.out.println("Los cereales aptos para este lote son:");
        for (String nombreCereal : cerealesAptos) {
            System.out.println(nombreCereal);
        }
    }


    public void tipoLoteEnCereal(Cereal cereal) {
        List<String> lotesAptos = new ArrayList<>();

        // Recorre cada lote disponible
        for (Lote lote : this.lotes) {
            // Verifica si el lote contiene todos los minerales requeridos por el cereal
            if (lote.getMinerales().containsAll(cereal.getMineralesRequeridos())) {
                // Si el cereal es Pastura, el lote debe tener más de 50 hectáreas
                if (cereal.getTipo().equals("Pasturas") && lote.getHectareas() > 50) {
                    lotesAptos.add(lote.getNombre());
                }
                // Si no es Pastura, lo añade directamente
                else if (!cereal.getTipo().equals("Pasturas")) {
                    lotesAptos.add(lote.getNombre());
                }
            }
        }

        // Muestra los lotes aptos
        System.out.println("Los Lotes aptos para este cereal son:");
        for (String nombreLote : lotesAptos) {
            System.out.println(nombreLote);
        }
    }


    public static void main(String[] args) {
        // Crear algunos minerales para los lotes
        List<String> mineralesLote1 = Arrays.asList("Oro", "Diamante", "Esmeralda", "Cobre");
        List<String> mineralesLote2 = Arrays.asList("Cobre", "Hierro", "Níquel");
        List<String> mineralesLote3 = Arrays.asList("Oro", "Hierro", "Níquel");

        // Crear instancias de Lote con diferentes características
        Lote lote1 = new Lote("Lote A", 60, mineralesLote1); // Especial y más de 50 hectáreas
        Lote lote2 = new Lote("Lote B", 45, mineralesLote2); // Común y menos de 50 hectáreas
        Lote lote3 = new Lote("Lote C", 70, mineralesLote3); // Común y más de 50 hectáreas

        // Crear cereales con diferentes minerales requeridos
        Cereal cereal1 = new Cereal("Girasol", Arrays.asList("Hierro", "Níquel")); // Grano Grueso
        Cereal cereal2 = new Cereal("Trigo", Arrays.asList("Oro", "Hierro")); // Grano Fino
        Cereal cereal3 = new Cereal("Alfalfa", Arrays.asList("Oro", "Diamante", "Esmeralda")); // Pastura

        // Crear la empresa agrícola
        EmpresaAgricultora empresa = new EmpresaAgricultora();

        // Añadir los lotes a la empresa usando la función de agregación
        empresa.addLote(lote1);
        empresa.addLote(lote2);
        empresa.addLote(lote3);

        // Añadir los cereales a la empresa usando la función de agregación
        empresa.addCereal(cereal1);
        empresa.addCereal(cereal2);
        empresa.addCereal(cereal3);

        // Ejecutar los métodos para verificar qué cereales son aptos para cada lote
        System.out.println("Resultados de los cereales aptos en cada lote:");
        empresa.tipoDeCerealEnLote(lote1);
        empresa.tipoDeCerealEnLote(lote2);
        empresa.tipoDeCerealEnLote(lote3);

        // Ejecutar los métodos para verificar qué lotes son aptos para cada cereal
        System.out.println("\nResultados de los lotes aptos para cada cereal:");
        empresa.tipoLoteEnCereal(cereal1);
        empresa.tipoLoteEnCereal(cereal2);
        empresa.tipoLoteEnCereal(cereal3);
    }



}
