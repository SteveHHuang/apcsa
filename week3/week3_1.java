package week3;


// public class week3 {
    // week3 xy = new week3();
    // xy.money1=10;
    // int money1;
    // static int money;
    // static double score;
    // static void m1(){
    //     money=1000;
    //     System.out.println(money);
    // }

    // public static void m2(){
    //     score=98.5;
    //     String n = "hh";
    //     System.out.print("本次考试最高分: "+score+"\n最高分得主: " +n+"\n");
    // }

    
    // public static void main(String[] args) {
    //     m1();
    //     m2();
    // }
// }

class MP3 {
    public String brand;
    public double weight;
    public String type;
    public int price;

    public MP3(String b, double w, String t, int p) {
        brand = b;
        weight = w;
        type = t;
        price = p;
    }
}

public class week3_1 {


    public static void output(){
        MP3 aigo=new MP3("爱国者F928", 12.4,"内置锂电池", 499);
        System.out.println(aigo.brand+"\n"+aigo.weight+"\n"+aigo.type+"\n"+aigo.price);

    }

    public static void main(String[] args) {
        output();
        
    }

}
