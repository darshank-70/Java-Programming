import java.util.*;
import java.util.stream.*;

class Prefix2InListNums{


    public static void main(String[] args){

        List<Integer> nums=Arrays.asList(2,222,234,567,890,432,236,211,22);

        int[] result=nums.stream()
                        .map(num->String.valueOf(num))
                        .filter(str->str.startsWith("2"))
                        .mapToInt(e->Integer.parseInt(e))
                        .toArray();
        
        System.out.println(Arrays.toString(result));




        //Another Approach 

        List<Integer> resultNums = nums.stream()
                                    .map(String::valueOf)
                                    .filter(e->e.startsWith("2"))
                                    .map(Integer::valueOf)
                                    .collect(Collectors.toList());


        System.out.println(resultNums);
    }
}