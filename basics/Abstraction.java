import java.lang.Math;
abstract class Shape{
    //abstract method
    public abstract double calculateArea();
    //concrete method
    public void display(){
        System.out.println("this is a Shape");
    }
}

//A Circle that extends Shape and provide implementation for the calculateArea()
 class Circle extends Shape{
    //radius variable
    private double radius;


    //constructor reading radius
    Circle(double radius){
        this.radius=radius;
    }
    //provide implementation
    public double calculateArea(){
      return   Math.PI * radius* radius;
    }
//overriding a concrete method is OPTIONAL
    //override the display()
    // @Override
    // public void display(){
    //     System.out.println("This is a Circle");
    // }
}

class Abstraction{
    public static void main(String[] args){
            Circle circle=new Circle(5.0);
            double resultArea=circle.calculateArea();
            System.out.println("Area of circle is "+resultArea);
            circle.display();
    }
}