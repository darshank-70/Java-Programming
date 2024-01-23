import java.util.*;
import java.util.stream.*;

class SquareOfListNums{

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1,10,20,30,15);
//ONE APPROACH
        List<Integer> squares = nums.stream()
                                    .map(n->n*n)
                                    .collect(Collectors.toList());

        System.out.println(squares);



    }
}