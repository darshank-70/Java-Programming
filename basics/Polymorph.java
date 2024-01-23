///Polymorphism is a fundamental concept of OOP in which 
///the Objects of the Different classes are treated as the objects of the common Superclass
//about method Overriding 
class Shape{
    public void draw(){
        System.out.println("Drawing a Shape");
    }
}
class Rectangle extends Shape{
   
    public void draw(){
        System.out.println("Drawing a Rectange");
    }
}
class Circle extends Shape{
public void draw(){
        System.out.println("Drawing a Circle");
    }
}
class Polymorph{
    static void drawShape(Shape anyShape){
        anyShape.draw();

    }
        public static void main(String[] args){
        Shape rect=new Rectangle();
        Shape circ=new Circle();
        drawShape(rect);
        drawShape(circ);
        
    }
}