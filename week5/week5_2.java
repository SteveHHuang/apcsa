package week5;

public class week5_2 {

    public static int Calc(){
        int year=2012;
        double Students=250000;
        while(Students<=1000000){
            Students*=1.25;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Calc());
    }
}
