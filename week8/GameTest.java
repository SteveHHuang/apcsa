package week8;

public class GameTest {
    public static void main(String[] args) {
        Game g=new Game("j", 2008, false);

        if (2026-g.getTime()>10&&g.getPop()){
            System.out.println(g.getName()+" is a good product");
        } else{
            System.out.println(g.getName()+" is not a good product");
        }
    }
}
