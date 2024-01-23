import java.lang.StringBuilder;
class ReverseString{
    static String reverseUsingSB(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    static String reverseUsingFor(String s){
        //O(n) space
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    static String reverseUsingCharArr(String s){
        char[] arr=s.toCharArray();
        //we can use String(char[] array) to form a String 
        //from an Array :)

        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }     
        return sb.toString();
    }
    public static void main(String[] ags){
        String str="Hello World";

        //using StringBuilder's method reverse()
        String result=reverseUsingSB(str);
        System.out.println(result);

        //reverse using For loop
        result=reverseUsingFor(str);
        System.out.println(result);

        //reverse using Char array
        result=reverseUsingCharArr(str);
        System.out.println(result);
    }
}