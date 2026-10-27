package week4;

public class week4_3 {
    
    public static boolean IsLucky(int Num) {
        Num/=100;
        int x=Num%10;
        int rand=(int)(Math.random()*10);
        if (x==rand){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(IsLucky(1878));
    }
}
