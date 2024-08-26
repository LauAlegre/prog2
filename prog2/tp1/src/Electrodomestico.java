public class Electrodomestico {
    private String nombre;
    private int precioBase;
    private String color;
    private int consumo;
    private float peso;

    // Constructor por defecto
    public Electrodomestico() {
        this.color = "gris plata";
        this.peso = 2;
        this.consumo = 10;
        this.precioBase = 100;
    }
    public Electrodomestico(int consumo){
        this.consumo = consumo;
    }

    public Electrodomestico(float peso){
        this.peso = peso;
    }



    // Métodos getter y setter para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean consumo(){
        return this.consumo <45;
    }
    public float balance(float costo){
        return costo /peso;
    }
    public void altaGama(float costo){
        float balance = costo /peso;
        if(balance > 3){
            System.out.println("es alta gama");
        }else{
            System.out.println("no es alta gama");
        }
    }
}

