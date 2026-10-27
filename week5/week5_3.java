package week5;

public class week5_3 {
    public static int Sum(int Num){
        int sum=0;
        int i=0;
        while(i<=Num){
            if (i%2==0)sum+=i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum(100));
    }
}
