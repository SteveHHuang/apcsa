package week11;

public class Stringtest2 {
    private String str1;

    public Stringtest2(String s){
        str1=s;
    }

    public void Check(){
        if (str1.indexOf("a")>-1){
            System.out.println(str1.indexOf("a"));
        }else{
            System.out.println("不存在");
        }
    }
}
