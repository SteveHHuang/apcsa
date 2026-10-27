package week5;

public class week5_reversingnum {

    public static int Reversed(int Num){
        int result=0; 
        int temp;
        while (Num>0){
            temp=Num%10;
            result=(result*10+temp);
            Num/=10;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Reversed(7908));
    }
}
