import java.io.*;
import java.util.*;

abstract class Shape{
    abstract void numberOfSides();
}

class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("No.of sides of Rectangle = 4 ");
    }
}

class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("No.of sides of Triangle = 3 ");
    }
}

class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("No.of sides of Hexagon = 6");
    }
}

class AbstractExample{
    public static void main(String args[]){
        Rectangle ob1 = new Rectangle();
        Triangle ob2 = new Triangle();
        Hexagon ob3 = new Hexagon();
        ob1.numberOfSides();
        ob2.numberOfSides();
        ob3.numberOfSides();
    }
}
