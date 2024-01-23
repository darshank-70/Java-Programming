//BinaryOperator<T> is a Functional Interface [child] of Bifunction<T,T,T>
//it takes 2 parameters of same type and returns same type

//1. method 
// T apply(T o1,T o2)

//2. default methods

//2. static methods
/// maxBy(Comparator )
/// minBy(Comparator )  
//both returns a BinaryOperator<T> greater or lesser accourding to their comparators

import java.util.function.BinaryOperator;

class BinaryOperatorDemo{
    
    public static void main(String[] args){

        BinaryOperator<Integer> addTwoNumbers=
                                            (n1,n2)->n1+n2;
        int result=addTwoNumbers.apply(5,5);
        System.out.println(result);
    }
}