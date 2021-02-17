package Geometry;

abstract class Parallelogram implements Shape{ //inheritance from class Shape

    protected double LG; // variable used for calculation
    protected double l;// variable used for calculation
    protected double height; // variable used for calculation
    protected double area; //variable which stores the area

    Parallelogram(){ //constructor
        System.out.println("A Parallelogram was created");
        LG = l = height = area =0;
    }

    //static polymorphism
    Parallelogram(double L, double l, double height) //constructor
    {
        System.out.println("A Parallelogram was created");
        this.LG = L;
        this.l = l;
        this.height = height;
        onAreaChange();
    }


    //dynamic polymorphism
    @Override
    public double Perimeter() {
        return 2*(LG + l);
    }

    //dynamic polymorphism
    @Override
    public double getArea() {
        return area;
    }

    //setter
    public void setLG(double LG) {
        this.LG = LG;
    }
    //setter
    public void setl(double l) {this.l = l; }
    //setter
    public void setHeight(double height) {
        this.height = height;
    }

    //getter
    public double getLG() {
        return LG;
    }
    //getter
    public double getHeight() {
        return height;
    }
    //getter
    public double getL() {
        return l;
    }
}
