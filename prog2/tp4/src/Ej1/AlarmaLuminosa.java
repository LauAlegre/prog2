package Ej1;

 class AlarmaLuminosa {
    private Luz luz;
    private Timbre timbre;

     public AlarmaLuminosa(Luz luz , Timbre timbre) {
         this.luz = luz;
         this.timbre = timbre;


     }

     public void encenderAlarmaLuminosa(){
         luz.encender();
         timbre.hacerSonar();
     }

 }
