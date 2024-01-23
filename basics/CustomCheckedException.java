//checkedExceptions are exception that needs to be handled 
//by a programmer
//example IOException
//other wise throws a Compile time error

//Ways to handle
//1. try{}catch(){}
//2. throws 
class MyCheckedException extends Exception{

}
class CustomCheckedException{
    public static void main(String[] args){
     //   throw new MyCheckedException(); need to handle
     try{
        throw new MyCheckedException();
     }
     catch(MyCheckedException e){

     }
     
    }
}