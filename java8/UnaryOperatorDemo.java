//UnaryOperator is an Functional interface
//It is a child of Function<T,R> interface
//but UnaryOperator takes "Any object T" and returns "Same object T"

import java.util.function.UnaryOperator;
class UnaryOperatorDemo {
    
//UnaryOperator<T> is just Function<T,T> 
// which means it takes any Object and returns Same object

    public static void main(String[] args){
        // UnaryOperator<Integer> addTen=new UnaryOperator<>(){
        
        //     public Integer apply(Integer n){
        //         return n+10;
        //     }
        // };

        UnaryOperator<Integer> addTen=n->n+10;
        int result=addTen.apply(5);
        System.out.println(result);
    }
}