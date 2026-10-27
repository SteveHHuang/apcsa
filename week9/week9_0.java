package week9;

public class week9_0 {
    public static void main(String[] args) {
        String message="Have a 1ong and happy 1ife......";

        while (message.indexOf("1")!=-1){
            message=message.substring(0,message.indexOf("1"))+"l"+message.substring(message.indexOf("1")+1);
        }
        
        System.out.println(message);
    }
}
