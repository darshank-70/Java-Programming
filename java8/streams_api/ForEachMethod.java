///for each method operates on a stream of data 
//takes one element at a time and performs specified operation
//PARAMETER: Consumer 
//RETURN: void 


import java.util.*;
import java.util.stream.*;
import java.util.function.Consumer;
class ForEachMethod{

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(){
            {
                add(10);
                add(20);
                add(30);
            }
        };//Double Braces Initializer
        System.out.println(list);

    Consumer<Integer> printElement= 
                        element-> System.out.println(element);
    list.stream().forEach(printElement);
    }
}