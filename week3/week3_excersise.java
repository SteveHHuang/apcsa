package week3;

public class week3_excersise {

    // public static boolean IsLucky(int custNo){
    //     int Sum=0;
    //     while(custNo>0){
    //         Sum+=custNo%10;
    //         custNo/=10;
    //     }

    //     return (Sum>=20);
    // }

    public static boolean IsLucky(String custNo){
        int Sum=0;
        for(int i=0; i<custNo.length(); i++){
            if (custNo.charAt(i)>'0' && custNo.charAt(i)<='9'){
                Sum+=(custNo.charAt(i) - '0');
            }
        }
        return (Sum>=20);
    }

    public static void main(String[] args) {
        // System.out.println(IsLucky("5678"));

        String a = "a";
        System.out.println(a.valueOf(1==2));
    }
}

