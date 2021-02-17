package Geometry;

public class Square extends Rectangle{
    Square(){
        System.out.println("A Square was created");
        area = 0;
        LG = l = height = 0;
    }
    Square(double edge){
        System.out.println("A Square was created");
        setHeight(edge);
        onAreaChange();
    }
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setLG(height);
        super.setl(height);
    }
    @Override
    public void setLG(double LG) {
        super.setLG(LG);
        super.setHeight(LG);
        super.setl(LG);
    }
    @Override
    public void setl(double l) {
        super.setLG(l);
        super.setHeight(l);
        super.setl(l);
    }



}
