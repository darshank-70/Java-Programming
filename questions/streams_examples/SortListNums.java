//Traditional Way of Sorting vs Streams API
import java.util.*;
import java.util.stream.*;
class SortListNums{

    static void usingCollections(List<Integer> nums){

        // //Ascending Order : Collections.sort(list);
        // Collections.sort(nums);
        // System.out.println(nums);

        // //Descending Order : first sort in Ascending order and Collections.sort(list,Comparator)
        // Collections.sort(nums);
        // Collections.reverse(nums);
        // System.out.println(nums);

        // //Ascending With Comparator 
        // Collections.sort(nums, (a,e)-> a-e );
        // System.out.println(nums);

        // //Descending  With Comparator 
        // Collections.sort(nums, (a,e)-> e-a );
        // System.out.println(nums);
    }

    static void usingStreams(List<Integer> nums){
       //Ascending Order 
       List<Integer> asc1 = nums.stream().sorted((a,b)->a-b).collect(Collectors.toList());
        System.out.println(asc1);
        List<Integer> asc2=nums.stream().mapToInt(e->e).sorted().boxed().collect(Collectors.toList());
        System.out.println(asc2);


        //Descending Order
        List<Integer> dsc2=nums.stream().sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println(dsc2);
    }

    public static void main(String args[] ){

        List<Integer> nums = Arrays.asList(-10, 99, 89,0,1001,2);

        usingCollections(nums);
        usingStreams(nums);
    }
}