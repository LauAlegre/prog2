import java.time.LocalDate;
import java.time.Period;

public class Persona {
    String nombre;
    int edad;
    LocalDate fechaNacimiento;
    int dni;
    char sexo;
    double peso;   // en kilogramos
    double altura;// en metros

    // Constructor
    public Persona() {
        this.nombre = "N";
        this.edad = 0;
        this.fechaNacimiento = LocalDate.of(2000, 1, 1); // Fecha de nacimiento por defecto
        this.sexo = 'F'; // Sexo por defecto
        this.peso = 1.0;  // Valor por defecto
        this.altura = 1.0; // Valor por defecto
    }
    public Persona(int dni,String nombre,int edad,LocalDate fechaNacimiento,char sexo,double peso,double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura =altura;
        this.dni = dni;

    }

    public Persona(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(LocalDate fechaNacimiento ){
            this.fechaNacimiento = fechaNacimiento; // Asigna la fecha proporcionada

    }
    public Persona(int edad){
        this.edad = edad;
    }

    public Persona(LocalDate fechaNacimiento,int edad){
            this.fechaNacimiento = fechaNacimiento; // Asigna la fecha proporcionada
            this.edad = edad;
    }


    // Método para calcular el IMC
    public void imc() {

        double imc = peso / (altura * altura);
        if(imc > 18.5 && imc < 25) {
            System.out.println("estas en forma, IMC = " + imc);
        }else{
            System.out.println("no estas en forma, IMC = " + imc);
        }

    }

    public void estaCumpliendoAnios() {
        LocalDate hoy = LocalDate.now();
        if ((hoy.getMonth() == fechaNacimiento.getMonth()) && (hoy.getDayOfMonth() == fechaNacimiento.getDayOfMonth())) {
            System.out.println("Está cumpliendo años");
        } else {
            System.out.println("No está cumpliendo años");
        }
    }

    public boolean mayorEdad() {
        return(edad > 18);
    }
    public boolean esCoherente() {
        LocalDate hoy = LocalDate.now();
        int edadCalculada = Period.between(fechaNacimiento, hoy).getYears();
        return edadCalculada == edad;
    }

    public void mostrarObjeto(){
        System.out.println(nombre +"//"+ edad +"//"+ fechaNacimiento +"//"+ sexo +"//"+ peso +"//"+ altura +"//"+ dni);
    }


}


