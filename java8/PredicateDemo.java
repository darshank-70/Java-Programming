//Predicate<T> is a Functional Interface.
//Predicate Has one method: boolean test(T ob)
///predicate Has 3 default methods
//1.  default Predicate<T> and(Predicate<? super T> ob) : logical and between 2 predicate results
//2. default Predicate<T> or(Predicate<? super T> obj) : logical or between two Predicates
//3. default Predicate<T> negate() : negation of result

/// predicate has 1 static methods
//1. static <T> Predicate<T> isEqual(Object target)
//returns predicate that test if two object are equal to Objects.equals(Object,Object)

import java.util.function.Predicate;
class PredicateDemo{
    public static void main(String[] args){
        Predicate <String > pred=str->str.equals("java");
        System.out.println(pred.test("java"));
    }

}
//uses in Stream API
//filter(Predicate<T> pred)