package week6;

public class week6_1 {

    public static void Summation(){
        int sum=0;
        int count=0;
        for(int i=1; i<100; i++){
            if ((i%2)!=0){ 
                sum+=i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println((double)sum/count);
    }

    public static void main(String[] args) {
        Summation();
    }
}
