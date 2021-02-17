package Geometry;

class Triangle implements Shape { //inheritance from class Shape

    private double area; //variable which stores the area
    private double base; // variable used for calculation
    private double height; // variable used for calculation

    Triangle(){ //constructor
        System.out.println("A Triangle was created");
        base = 0;
        height = 0;
    }

    //static polymorphism
    Triangle(double base, double height) //constructor
    {
        System.out.println("A Triangle was created");
        this.base = base;
        this.height = height;
        onAreaChange();
    }

    //dynamic polymorphism
    @Override
    public void onAreaChange() {
        area = (base * height)/2;
    }

    //dynamic polymorphism
    @Override
    public double Perimeter() {
        return 3*base;
    }

    //dynamic polymorphism
    @Override
    public double getArea() {
        return area;
    }

    //setter
    public void setBase(double base) {
        this.base = base;
    }
    //setter
    public void setHeight(double height) {
        this.height = height;
    }

    //getter
    public double getHeight() {
        return height;
    }
    //getter
    public double getBase() {
        return base;
    }
}
