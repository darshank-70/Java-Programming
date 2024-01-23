//Function<T,R> is a Functional interface
///has 1 abst method
//R apply(T obj){} : takes any object and return anyObject

////2 default methods
//default Function<V,R> compose() -- it execute function Right to Left
//default Function<T,V> andThen(Function<T,R> ) -- it execute function Left to Right

///1 static method
//static Function<T,T> identity() : 
// it looks maps same object ex: .map(str-> str) is same as .map(Function.identity())
import java.util.function.Function;
import java.util.*;
import java.util.stream.*;
class FunctionDemo{
    public static void main(String[] args){

        Function<Integer,Integer> incrementOne=n->n+1;
        Function<Integer,Integer> addFive=(n)->n+5;

        List<Integer> x=Arrays.asList(1,2,3,4,5,6,7,8,9);
        x=x.stream().map(incrementOne.andThen(addFive)).collect(Collectors.toList());
        System.out.println(x);
    }
}

