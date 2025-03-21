package ej2;
import ej2.Condiciones.Condicion;
import ej2.Condiciones.CondicionNinioMalo;
import ej2.Condiciones.CondicionRegalo;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        // Crear buzones
        Buzon buzonBarrio1 = new Buzon("Buzón Barrio 1");
        Buzon buzonBarrio2 = new Buzon("Buzón Barrio 2");

        // Agregar niños buenos a los buzones
        buzonBarrio1.addNinioBueno(12345);  // Niño bueno
        buzonBarrio1.addNinioBueno(54321);  // Niño bueno
        buzonBarrio2.addNinioBueno(67890);  // Niño bueno

        // Crear cartas
        Carta carta1 = new Carta("Juan", 12345);
        carta1.addRegalo("Bicicleta");
        carta1.addRegalo("Lego");

        Carta carta2 = new Carta("Pedro", 54321);
        carta2.addRegalo("Videojuego");

        Carta carta3 = new Carta("Luis", 11111);  // Niño malo
        carta3.addRegalo("Patineta");

        // Niño bueno deja su carta en el buzón correspondiente
        buzonBarrio1.addCarta(carta1);  // Juan es niño bueno
        buzonBarrio1.addCarta(carta2);  // Pedro es niño bueno
        buzonBarrio1.addCarta(carta3);  // Luis es niño malo -> Regalo cambia a "trozo de carbón"

        // Agregar buzones a niveles geográficos
        NivelGeografico localidad = new NivelGeografico("Localidad");
        localidad.agregarComponente(buzonBarrio1);
        localidad.agregarComponente(buzonBarrio2);

        // Condiciones para buscar regalos específicos
        Condicion condicionBicicleta = new CondicionRegalo("Bicicleta");
        Condicion condicionCarbón = new CondicionNinioMalo();

        // 1. Porcentaje de cartas que piden un determinado regalo (por ejemplo, "Bicicleta")
        double porcentajeBicicleta = buzonBarrio1.porcRegalo(condicionBicicleta);
        System.out.println("Porcentaje de cartas que piden Bicicleta en Buzón Barrio 1: " + porcentajeBicicleta + "%");

        // 2. Cantidad de cartas que piden un determinado regalo (por ejemplo, "Bicicleta")
        int cantidadBicicleta = buzonBarrio1.buscar(condicionBicicleta);
        System.out.println("Cantidad de cartas que piden Bicicleta en Buzón Barrio 1: " + cantidadBicicleta);

        // 3. Cantidad de niños malos que enviaron una carta
        int cantidadNinosMalos = buzonBarrio1.buscar(condicionCarbón);
        System.out.println("Cantidad de niños malos que enviaron una carta en Buzón Barrio 1: " + cantidadNinosMalos);

        // 4. Cantidad total de cartas recibidas en la localidad
        int totalCartasLocalidad = localidad.cantCartas();
        System.out.println("Cantidad total de cartas recibidas en la localidad: " + totalCartasLocalidad);
    }
}


