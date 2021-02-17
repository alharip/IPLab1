package Geometry;

class Rectangle extends Parallelogram { //inheritance from class Parallelogram

    Rectangle() { //constructor
        System.out.println("A Rectangle was created");
        area = 0;
        height = 0;
        LG = l = 0;
    }

    //static polymorphism
    Rectangle(double height, double width){ //constructor
            System.out.println("A Rectangle was created");
            this.height = height;
            this.LG = width;
            this.l = height;
            onAreaChange();
    }

    //dynamic polymorphism
    @Override
    public void onAreaChange() {
        area = LG * l;
    }

    //dynamic polymorphism
    @Override
    public void setHeight(double height) {
        super.setl(height);
    } //setter
}
