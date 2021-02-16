package Geometry;

public class Square extends Rectangle{
    Square(){
        System.out.println("A Square was created");
        area = 0;
        height = width = 0;
    }
    Square(double edge){
        System.out.println("A Square was created");
        setHeight(edge);
        onAreaChange();
    }
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }




}
