package ej2;

public class ConvertidorMedidas  {

    private static final double CENTIMETROS_POR_PULGADA = 2.54;
    private static final double KILOGRAMOS_POR_LIBRA = 0.453592;
    private static final double LITROS_POR_GALON = 3.78541;


    public static double centimetrosAPulgadas(double centimetros) {
        return centimetros / CENTIMETROS_POR_PULGADA;
    }


    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * CENTIMETROS_POR_PULGADA;
    }


    public static double librasAKilogramos(double libras) {
        return libras * KILOGRAMOS_POR_LIBRA;
    }


    public static double kilogramosALibras(double kilogramos) {
        return kilogramos / KILOGRAMOS_POR_LIBRA;
    }


    public static double galonesALitros(double galones) {
        return galones * LITROS_POR_GALON;
    }


    public static double litrosAGalones(double litros) {
        return litros / LITROS_POR_GALON;
    }
    public static void main(String[] args) {
        // Pruebas de conversión
        double centimetros = 10.0;
        double pulgadas = ConvertidorMedidas.centimetrosAPulgadas(centimetros);
        System.out.println(centimetros + " cm son " + pulgadas + " pulgadas");

        double libras = 20.0;
        double kilogramos = ConvertidorMedidas.librasAKilogramos(libras);
        System.out.println(libras + " libras son " + kilogramos + " kilogramos");

        double galones = 5.0;
        double litros = ConvertidorMedidas.galonesALitros(galones);
        System.out.println(galones + " galones son " + litros + " litros");

    }
}



