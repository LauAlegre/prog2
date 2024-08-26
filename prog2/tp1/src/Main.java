import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        ///////////////presona//////////////////////////////////////////////////////
        Persona a = new Persona(75,1.9);
        a.imc();
        LocalDate fechaNacimiento = LocalDate.of(2003, 8, 14);
        // Crear una instancia de Persona con esa fecha de nacimiento
        Persona b = new Persona(fechaNacimiento);
        b.estaCumpliendoAnios();

        Persona c = new Persona(17);
        boolean mayor = c.mayorEdad();

        if (mayor) {
            System.out.println("Mayor de Edad");
        } else {
            System.out.println("menor de Edad");
        }

        Persona d = new Persona(fechaNacimiento, 21);
        boolean coherente = d.esCoherente();
        if (coherente) {
            System.out.println("Coherente");
        } else {
            System.out.println("no es coherente");
        }

        Persona f = new Persona(45295227, "lautaro", 95, fechaNacimiento, 'M', 90, 190);
        f.mostrarObjeto();


        //////////////////////////////////////////////electrodomestico//////////////////////////////////////////////////

//        Electrodomestico a =new Electrodomestico(42);
//        boolean verificarConsumo = a.consumo();
//        if(verificarConsumo){
//            System.out.println("es bajo consumo");
//        }else{
//            System.out.println("no es bajo consumo");
//        }
//
//        Electrodomestico b=new Electrodomestico(100.4F);
//        float balance = b.balance(2);
//        System.out.println(balance);
//
//        b.altaGama(2);

        ////////////////////////////////////////////////////////matematica/////////////////////////////////
//
//    PuntoGeometrico a = new PuntoGeometrico(8,8);
//    a.desplazarPuntos();
//    double x = a.getX();
//    double y = a.getY();
//        System.out.println(x + "/" + y);
//
//    double distancia =a.calcularDistancia(15, 20);
//        System.out.println(distancia);

//////////////////////////////////////////////////////////////rectangulo/////////////////////////////////////////////////////////

        Rectangulo a1 = new Rectangulo(6.0,4.0,2.0,9.0);
        a1.desplazamiento();
        a1.calcularArea();
        a1.esCuadrado();
        a1.calcularLargoSuperior();
        a1.posicion();
    }

}