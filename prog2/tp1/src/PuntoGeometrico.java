public class PuntoGeometrico {
    private double x,y;
    public PuntoGeometrico(){
        this.x=0;
        this.y=0;
    }
    public PuntoGeometrico(double x, double y){
        this.x=x;
        this.y=y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void desplazarPuntos(){
        this.x=+x;
        this.y=+y;
    }

    public double calcularDistancia(double x2, double y2) {
        double distanciaX = this.x - x2;
        double distanciaY = this.y - y2;
        return  Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }



}
