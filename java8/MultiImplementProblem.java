//when we have Multiple inheritence[Implementing more than]
//one interface for a Class There may be chances of Having 
//methods with same Signature in both interfaces. 
//then the class which isi implementiing these interfaces 
//throws an COMPILE TIME ERROR

//TO solve this problem,[Ambiguity]
//1. [Override]The class need to Provide its own Implementation for that method
//2. or if it want to use the concrete method of any one of those iinterface's it should specify

///////********IMPORTANT *//////
//if default keyword is not used it gives an COMPILE ERROR
//error: interface abstract methods cannot have body
// /    void method(){
  
            
interface Left{
    default void method(){
        System.out.println("LEFT method");
    }
}
interface Right{
   default  void method(){
        System.out.println("RIGHT method");
    }
}

//Error: types Left and Right are incompatible;
class LeftRightDemo implements Left,Right{

    public void method(){
        System.out.println("My Own Implementation");
    }
}
//OR we can specify default Method from any one of those Interface

class LeftRightOne implements Left,Right{
    public void method(){
        Left.super.method();
        Right.super.method();
        System.out.println("execute our own code next.");
    }
}
class MultiImplementProblem{
    public static void main(String[] args){

        LeftRightDemo lrd=new LeftRightDemo();
        lrd.method();

        LeftRightOne lro=new LeftRightOne();
        lro.method();

    }
}