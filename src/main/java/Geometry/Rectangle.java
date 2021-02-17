package Geometry;

class Rectangle extends Parallelogram {

    Rectangle() {
        System.out.println("A Rectangle was created");
        area = 0;
        height = 0;
        LG = l = 0;
    }

    Rectangle(double height, double width){
            System.out.println("A Rectangle was created");
            this.height = height;
            this.LG = width;
            this.l = height;
            onAreaChange();
    }

    @Override
    public void onAreaChange() {
        area = LG * l;
    }

    @Override
    public void setLG(double LG) {
        super.setLG(LG);
    }
    @Override
    public void setl(double l) {
        super.setl(l);
    }
    @Override
    public void setHeight(double height) {
        super.setl(height);
    }
}
