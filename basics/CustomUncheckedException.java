class MyUncheckedException extends RuntimeException{

}
class CustomUncheckedException{
    public static void main(String[] arg){
        throw new MyUncheckedException();
        //no compile time error as it is Unchecked Exception
    }
}