package Geometry;


class Circle implements Shape { //inheritance from class Shape

    private double area; //variable which stores the area
    private double radius; // variable used for calculation
    private final double pi = 3.1415; // variable used in aria calculation

    Circle() { //constructor
        System.out.println("A Circle was created");
        area = 0;
        radius = 0;
    }

    //static polymorphism
    Circle(double radius){ //constructor
        System.out.println("A Circle was created");
        this.radius = radius;
        onAreaChange();
    }

    //dynamic polymorphism
    @Override
    public double Perimeter() {
        return 2 * pi * radius;
    }

    //dynamic polymorphism
    @Override
    public double getArea() {
        return area;
    }

    //dynamic polymorphism
    @Override
    public void onAreaChange() {
        area = pi * radius * radius;
    }


    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return radius;
    }

}
