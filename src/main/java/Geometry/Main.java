package Geometry;

/***
 * Main class of program
 * @author Harip Alexandru & Danila Ana-Maria
 */

/*
 This file contains the 'main' function
 */
public class Main {
    static public void main(String[] args)
    {

        /*
        creating an object for every class
         */
        Circle C = new Circle(2.5);
        Triangle T = new Triangle(2,1);
        Rectangle R = new Rectangle(2,5);
        Square S = new Square(2);


        /*
        print the areas of the created objects
         */

        System.out.println("Aria cercului este:" + Double.toString(C.getArea()));
        System.out.println("Aria triunghiului este:" + Double.toString(T.getArea()));
        System.out.println("Aria dreptunghiului este:" + Double.toString(R.getArea()));
        System.out.println("Aria patratului este:" + Double.toString(S.getArea()));
    }
}
