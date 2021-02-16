package Geometry;

class Triangle implements Shape {
    private double area;
    private double base;
    private double height;
    Triangle(){
        System.out.println("A Triangle was created");
        base = 0;
        height = 0;
    }
    Triangle(double base, double height)
    {
        System.out.println("A Triangle was created");
        this.base = base;
        this.height = height;
        onAreaChange();
    }

    @Override
    public void onAreaChange() {
        area = (base * height)/2;
    }
    @Override
    public double Perimeter() {
        return 3*base;
    }
    @Override
    public double getArea() {
        return area;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
}
