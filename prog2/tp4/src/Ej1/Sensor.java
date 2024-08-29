package Ej1;

public class Sensor {
    private boolean anomalia;

    public Sensor() {
        this.anomalia = false;
    }

    public void setAnomalia(boolean anomalia) {
        this.anomalia = anomalia;
    }

    public boolean isAnomalia() {
        return anomalia;
    }
}
