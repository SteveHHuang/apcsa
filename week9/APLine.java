package week9;

public class APLine {
    private int a,b,c;

    public APLine(int x,int y,int z){
        a=x;
        b=y;
        c=z;
    }

    public double getSlope(){
        return -a/b;
    }

    public boolean OnLine(int x, int y){
        if (a*x+b*y+c==0) return true;
        return false;
    }

    

}
