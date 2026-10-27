package week3;

public class week3_3 {
    
    public static boolean Comparison(int ZhangScore, int LiScore){
        return ZhangScore>LiScore;
    }

    public static void main(String[] args) {
        System.out.println("张三的成绩比李四高么? "+Comparison(90,80));
    }
}


