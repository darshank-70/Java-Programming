//Consumer is s Functional Interface
//////has 1 method
//void accept(T obj)
//used to process some objects
//////1 default method
//default Consumer<T> andThen(Consumer<T> after) to chain the consumers
import java.util.function.Consumer;
class ConsumerDemo{
    public static void main(String[] args){
        Consumer<String> printLength=(str)->System.out.println(str.length());
        String str="Hello World";
        printLength.accept(str);
    }
}