///Supplier<T> is a Functional Interface.
//has 1 method
//T get() : returns an Object of type T
import java.util.function.Supplier;
class SupplierDemo{
    public static void main(String[] ars){
        Supplier<String> nameSupplier=()->new String("John");
        System.out.println(nameSupplier.get());
    }
}
//uses in Stream API 
//generate(Supplier<T> supplier)