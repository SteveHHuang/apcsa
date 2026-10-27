package week8;

public class MyMathDriver {

    public static void run(int x,int y, int z){
        MyMath m =new MyMath();
        System.out.println(m.max(x, y, z));
    }
    public static void main(String[] args) {
        run(1,3,5);
    }
}
