package week8;

public class heaterdriver {
    public static void main(String[] args) {
        heater h1=new heater();
        System.out.println(h1.getTemperature());
        h1.warmer(19);
        System.out.println(h1.getTemperature());
    }
}
