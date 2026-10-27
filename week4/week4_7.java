package week4;

public class week4_7 {

    public static String FindMin(int N1, int N2, int N3){
        int min=N1;
        if (N2<min) min=N2;
        if (N3<min) min=N3;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(FindMin(5,1,2));
    }
}
