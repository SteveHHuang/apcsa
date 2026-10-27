package week7;

public class cat {

    private int weight,height,age;
    private String color;

    public cat(int w,int h,int a,String c){
        this.weight=w;
        this.height=h;
        this.age=a;
        this.color=c;
    }

    public int getWeight(){
        return this.weight;
    }
    public int getHeight(){
        return this.height;
    }
    public int getAge(){
        return this.age;
    }
    public String getColor(){
        return this.color;
    }

    public void setWeight(int nw){
        this.weight=nw;
    }
    public void setHeight(int nh){
        this.height=nh;
    }
    public void setAge(int na){
        this.age=na;
    }
    public void setColor(String nc){
        this.color=nc;
    }

}
