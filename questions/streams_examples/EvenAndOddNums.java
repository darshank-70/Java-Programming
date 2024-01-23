import java.util.*;
import java.util.stream.*;

class EvenAndOddNums{

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(11,2,3,45,67,9,90,87,8,2);

        List<Integer> evenNums = nums.stream()
                                      .filter(e->e%2==0)
                                      .collect(Collectors.toList());

        System.out.println(evenNums);

        List<Integer> oddNums = nums.stream()
                                    .filter(e->e%2==1)
                                    .collect(Collectors.toList());

        System.out.println(oddNums);

    }
}