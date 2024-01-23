import java.util.stream.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
class AverageOfListNums{

    public static void main(String[] args){

        List<Integer> nums= Arrays.asList(1,2,3,4,5);

//i am converting the nums to a Stream<Integer>
//calculating the total summ of list nums using .reduce(BinaryOperator<Integer>)
//to divide the nums by total length im using .map(Function<Integer>)
        int result=nums.stream().reduce((c,e)->c+e).map(sum->sum/nums.size()).get();
        System.out.println(result);


//ANOTHER APPROACH 
    //ToIntFunction<T>  
//            int and has applyAsInt(T ob)
///    Stream class's IntStream mapToInt(ToIntFunction )

//        IntStream has methods suct as min() max() average() count() etc
//    average() function returns Optional<Double>

    OptionalDouble res= nums.stream().mapToInt(e->e).average();
//System.out.println(res.getClass().getName());

    System.out.println(res.getAsDouble());
    }
}