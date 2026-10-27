package week8;

public class Game {
    private String name;
    private int publishTime;
    private boolean popu;

    public Game(String n, int pt, boolean p){
        name=n;
        publishTime=pt;
        popu=p;
    }

    public void setPop(boolean a){
        popu=a;
    }
    public void setTime(int b){
        publishTime=b;
    }

    public int getTime(){
        return publishTime;
    }
    
    public boolean getPop(){
        return popu;
    }
    
    public String getName(){
        return name;
    }

}
