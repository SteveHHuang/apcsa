package week4;

public class week4_6 {

    public static void Award(int Marks){
        if (Marks==100){
            System.out.println("爸爸将会给他买辆车");
        } else if (Marks<=99 && Marks>=90){
            System.out.println("妈妈将会给他买个游戏机");
        } else if (Marks<90 && Marks>=60){
            System.out.println("姥姥将会给他买一本参考书");
        } else{
            System.out.println("打屁股");
        }
    
    }
    public static void main(String[] args) {
        Award(99);
    }
}
