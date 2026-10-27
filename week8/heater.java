package week8;

public class heater {
    private double temperature;

    public heater(){
        temperature=15.0;
    }

    public double getTemperature(){
        return temperature;
    }

    public void warmer(double a){
        temperature+=a;
    }

    public void cooler(double b){
        temperature-=b;
    }

}
