import java.util.function.Predicate;
import java.util.Scanner;

class EvenOrOddPredicate{
    public static void main(String[] args){
        Predicate<Integer> isEvenNumber=num->num%2==0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        boolean result=isEvenNumber.test(n);
        System.out.println(result);
    }
}