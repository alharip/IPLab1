package Geometry;

/***
 *
 */
class Circle implements Shape {
    private double area;
    private double radius;
    private final double pi = 3.1415;

    Circle() {
        System.out.println("A Circle was created");
        area = 0;
        radius = 0;
    }

    Circle(double radius){
        System.out.println("A Circle was created");
        this.radius = radius;
        onAreaChange();
    }

    @Override
    public double Perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void onAreaChange() {
        area = pi * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}
