package week4;

public class week4_4 {
    public static void CheckDeposit(int Dep){
        if(Dep>=500){
            System.out.println("I will buy Lincoin.");
        } else if(Dep>=100) {
            System.out.println("I will buy Pasatt.");
        } else if (Dep>=10) {
            System.out.println("I will buy aotuo.");
        } else {
            System.out.println("I will buy bike.");
        }
    }

    public static int Compare1(int N1, int N2, int N3){
        int max=N1;
        if (max<N2) max=N2;
        if (max<N3) max=N3;
        return max;
    }

    // public static int Compare2(int N1, int N2, int N3){
    //     if (N1>N2 && N1>N3){
    //         return N1;
    //     } else if (N2>N3){
    //         return N2;
    //     } else {
    //         return N3;
    //     }
    // }

    public static void main(String[] args) {
        System.out.println(Compare1(5,5,10));
    }
}

