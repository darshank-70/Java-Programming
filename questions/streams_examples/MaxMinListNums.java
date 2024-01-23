//find the maximum and The minimum in the List 
//we can find it using IntStream max() and min() static functions


import java.util.*;
import java.util.stream.*;
class MaxMinListNums{

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,40,19,3);

        int max = nums.stream().mapToInt(e -> e).max().getAsInt();
        System.out.println(max); 

        int min = nums.stream().mapToInt(e -> e).min().getAsInt();
        System.out.println(min);

        //or directly apply the max() from stream() but provide a Comparator

        max = nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        min = nums.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
    }
}