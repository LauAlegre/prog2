package Ej1;

import java.util.ArrayList;
import java.util.List;

public class Alarma {
    private Casa casa;
    private AlarmaLuminosa alarmaLuminosa;
    private boolean activada;

    public Alarma(Casa casa, AlarmaLuminosa alarmaLuminosa) {
        this.casa = casa;
        this.alarmaLuminosa = alarmaLuminosa;
        this.activada = false;
    }

    public void activarAlarma(){
        this.activada = true;
    }
    public void desactivarAlarma(){
        this.activada = false;
    }

    public void comprobar(){
        List<Aberturas> aberturas  ;
        List<Habitacion> habitacions ;

        aberturas = this.casa.getAberturas();
        habitacions = this.casa.getHabitaciones();

        if(this.activada){
            for(Aberturas ab : aberturas){
                if(ab.getSensor().isAnomalia()){
                    this.alarmaLuminosa.encenderAlarmaLuminosa();
                }else{
                    System.out.println(false);
                }
            }
            for(Habitacion h : habitacions){
                if(h.getSensor().isAnomalia()){
                    this.alarmaLuminosa.encenderAlarmaLuminosa();
                }else{
                    System.out.println(false);
                }
            }
        }
    }



        public static void main(String[] args) {
            // Crear sensores
            Sensor sensorPuerta = new Sensor();
            Sensor sensorVentana = new Sensor();
            Sensor sensorHabitacion = new Sensor();

            // Crear aberturas (Puertas y Ventanas)
            Aberturas puertaPrincipal = new Puerta("Puerta Principal", sensorPuerta, false);
            Ventana ventanaSala = new Ventana("Ventana de la Sala", sensorVentana, false);

            // Crear habitación
            Habitacion sala = new Habitacion("Sala", sensorHabitacion);

            // Crear casa
            Casa miCasa = new Casa("Calle Falsa 123");

            // Agregar las aberturas y la habitación a la casa
            miCasa.addAbertura(puertaPrincipal);
            miCasa.addAbertura(ventanaSala);
            miCasa.addHabitacion(sala);

            Luz luz = new Luz();
            Timbre timbre = new Timbre();

            // Crear alarma luminosa con luz y timbre
            AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(luz, timbre);

            // Crear alarma
            Alarma alarma = new Alarma(miCasa, alarmaLuminosa);

            // Activar la alarma
            alarma.activarAlarma();
            alarma.comprobar();

            // Simular una anomalía
            puertaPrincipal.abrir(); // Esto activa el sensor de la puerta
            ventanaSala.romperVentana(); // Esto activa el sensor de la ventana
            sala.caminar(); // Esto activa el sensor de la habitación

            // Comprobar la alarma
            alarma.comprobar();
        }




}
