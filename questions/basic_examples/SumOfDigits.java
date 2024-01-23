//Given a number. find the sum of the digits of the number.
//1. Iterate through the Number and add it.
//2. get the units place each time and add it
import java.util.Scanner;
class SumOfDigits{
//1. Iterate through String format of number and find Sum
static int findSum(String s){
    int sum=0;
    for(int i=0;i<s.length();i++){
        sum+=Character.getNumericValue(s.charAt(i));
    }
    return sum;
}

//2. Units place

    static int findSum(int num){
        int sum=0;
        while(num>0){
            // int lastDigit=num%10;
            // sum+=lastDigit;
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        number=sc.nextInt();
        int resultSum=findSum(number);
        System.out.println(resultSum);

        //using String 
        System.out.println("Enter a Number (s)");
        String inputStr=sc.next();
        int result=findSum(inputStr);
        System.out.println(result);
    }
}