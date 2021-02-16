package Geometry;

class Rectangle implements Shape {
    protected double area;
    protected double height;
    protected double width;

    Rectangle() {
        System.out.println("A Rectangle was created");
        area = 0;
        height = 0;
        width = 0;
    }

    Rectangle(double height, double width){
            System.out.println("A Rectangle was created");
            this.height = height;
            this.width = width;
            onAreaChange();
    }

    @Override
    public void onAreaChange() {
        area = height * width;
    }

    @Override
    public double Perimeter() {
        return 2 * (height + width);
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
