//given a List<Integer> 
//Fiind all The duplicate NUmbers in THe List

import java.util.*;
import java.util.stream.*;

class DuplicatesInListNums{

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1,3,10,20,30,25,1,13,1,2,2,10,30,19,3);

        nums.stream()
            .filter(e->Collections
            .frequency(nums,e)>1)
            .collect(Collectors.toSet())
            .forEach(System.out::println) ;
            
        


    }
}