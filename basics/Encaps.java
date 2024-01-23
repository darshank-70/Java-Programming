class Person{
    private int age;
    private String name;
    
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
class Encaps{
    public static void main(String[] args){
        Person darshank=new Person("Darshan K",20);
        System.out.println(darshank.getAge());
        System.out.println(darshank.getName());
        darshank.age=20;//Cannot access member of the Person class 
        //directly 
        ///We can only access if that class is Providing access to that 
        ///through proper setters and getters
        
    }
}
