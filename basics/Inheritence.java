class Vehicle{
    //name, model
    protected String name;
   protected String model;
    //Constructor to initialize the instance var
    Vehicle(String name,String model){
        this.name=name;
        this.model=model;
    }

    //start 
    public void start(){
        System.out.println("Vehicle has Started");
    }                                                                                                                                                                     


    //stop

public void stop(){
    System.out.println("Vehicle has Stopped");    
}
}
class Car extends Vehicle{
    int year;
    //Constructor for initializing model and year and name
    Car(String name,String model,int year){
        super(name,model);
        this.year=year;
        
    }
    
}
class Inheritence{
    public static void main(String[] argas){
        Car myCar=new Car("Tata","harrier",2023);
        myCar.start();
        myCar.stop();
        System.out.println(myCar.name);
        System.out.println(myCar.model);
        System.out.println(myCar.year);
        
    }
}