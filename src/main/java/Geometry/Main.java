package Geometry;

/***
 * Main class of program
 * @author Harip Alexandru & Danila Ana-Maria
 */
public class Main {
    static public void main(String[] args)
    {
        Circle C = new Circle(2.5);
        Triangle T = new Triangle(2,1);
        Parallelogram P = new Parallelogram(2,2,1);
        Rectangle R = new Rectangle(2,5);
        Square S = new Square(2);
        System.out.println("Aria cercului este:" + Double.toString(C.getArea()));
        System.out.println("Aria triunghiului este:" + Double.toString(T.getArea()));
        System.out.println("Aria paralelogramului este:" + Double.toString(P.getArea()));
        System.out.println("Aria dreptunghiului este:" + Double.toString(R.getArea()));
        System.out.println("Aria patratului este:" + Double.toString(S.getArea()));
    }
}
