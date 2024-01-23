
import java.util.*;
import java.util.stream.*;
class SumOfListNums{

    public static void main(String[] args){
        
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Map Takes a Function<T,R>
        //since we are passing in ArrayList and returning int we can use UnaryOperator<T>
       // BinaryOperator<Integer> sumFunction= ;


// reduce(T identity, BinaryOperator) returns back an T type
       int result = nums.stream().reduce(0,(c,e)->c+e);
        System.out.println(result);

//reduce(BinaryOperator ) returns back an Optional<T> 
        Optional<Integer> opInt=nums.stream().reduce((c,e)->c+e);
        System.out.println(opInt.get());

        
    }
}