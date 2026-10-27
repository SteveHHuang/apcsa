package week6;

public class week6_2 {
    public static void Summation(){
        int sum=0;
        int n=0;
        for(int i=1; i<=10; i++){
            sum+=i;
            if (sum>=20){ 
                n=i;
                break;
            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Summation();
    }
}
