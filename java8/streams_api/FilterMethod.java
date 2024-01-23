///filter is a method in Stream 
////Stream<T>	filter(Predicate<? super T> predicate)


import java.util.*;
import java.util.stream.*;
import java.util.function.Predicate;

class FilterMethod{
    public static void main(String[] args){
        
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> isEven=n->n%2==0;

        Stream<Integer> evenNums=list.stream().filter(isEven);
        

        
        evenNums.forEach(n->System.out.println(n));
    }
}