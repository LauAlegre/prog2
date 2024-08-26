import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Rectangulo {
    private double x1, y1, x2, y2;

    public Rectangulo(){
        x1 = y1 = x2 = y2 = 0;
    }
    public Rectangulo(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    public void desplazamiento(){

        double auxX1 =+ x1;
        double auxY1 =+ y1;
        double auxX2 =+ x2;
        double auxY2 =+ y2;
        try {

            if(auxX1!=auxX2 && auxY1!=auxY2) {

                this.x1 = +x1;
                this.y1 = +y1;
                this.x2 = +x2;
                this.y2 = +y2;

                System.out.println("la cordenadas del rectangulo son : " + "x1 = " + x1 + " y1 = " + y1 + " x2 = " + x2 + " y2 = " + y2);
            }else{
                System.out.println("las cordenadas de X1,X2 y Y1,Y2 tienen que ser distintas ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public void calcularArea(){
        double area = Math.abs((x2-x1)*(y2-y1));
        System.out.println("El area del rectangulo es: " + area);
    }

    public void esCuadrado(){
        double x = x1 + x2;
        double y = y1 + y2;
        if((x1 - x2) == (y1 - y2)) {
            System.out.println("es un cuadrado");
        }else {
            System.out.println("no es un cuadrado");
        }
    }

    public void calcularLargoSuperior(){
        System.out.println("el largo superior del rectangulo es " + (Math.abs(x1-x2)));
    }

    public void posicion(){
        if((Math.abs(x1-x2)) > (Math.abs(y1-y2))){
            System.out.println("esta acostado");
        }else if((Math.abs(x1-x2)) < (Math.abs(y1-y2))){
            System.out.println("esta parado");
        }else {
            System.out.println("es un cuadrado");
        }
    }
}
