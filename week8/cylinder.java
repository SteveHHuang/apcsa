package week8;

public class cylinder {

    private int radius;
    private int height;

    public cylinder(int r, int h)
    {
        this.radius=r;
        this.height=h;
    }

    public Double getArea(){
        return radius*radius*3.14;
    }

    public Double getVolume(){
        return height*getArea();
    }

}

