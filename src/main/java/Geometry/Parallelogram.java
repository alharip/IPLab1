package Geometry;

public class Parallelogram implements Shape{
    protected double LG;
    protected double l;
    protected double height;
    protected double area;

    Parallelogram(){
        System.out.println("A Parallelogram was created");
        LG = l = height = area =0;
    }
    Parallelogram(double L, double l, double height)
    {
        System.out.println("A Parallelogram was created");
        this.LG = L;
        this.l = l;
        this.height = height;
        onAreaChange();
    }
    @Override
    public void onAreaChange() {
        area = height * LG;
    }
    @Override
    public double Perimeter() {
        return 2*(LG + l);
    }
    @Override
    public double getArea() {
        return area;
    }

    public void setLG(double LG) {
        this.LG = LG;
    }
    public void setl(double l) {
        LG = l;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getLG() {
        return LG;
    }
    public double getHeight() {
        return height;
    }
    public double getL() {
        return l;
    }
}
