package Geometry;

public class Square extends Rectangle{ //inheritance from class Rectangle

    Square(){ //constructor
        System.out.println("A Square was created");
        area = 0;
        LG = l = height = 0;
    }

    //static polymorphism
    Square(double edge){ //constructor
        System.out.println("A Square was created");
        setHeight(edge);
        onAreaChange();
    }

    //dynamic polymorphism
    @Override
    public void setHeight(double height) { //setter
        super.setHeight(height);
        super.setLG(height);
        super.setl(height);
    }

    //dynamic polymorphism
    @Override
    public void setLG(double LG) { //setter
        super.setLG(LG);
        super.setHeight(LG);
        super.setl(LG);
    }

    //dynamic polymorphism
    @Override
    public void setl(double l) { //setter
        super.setLG(l);
        super.setHeight(l);
        super.setl(l);
    }



}
