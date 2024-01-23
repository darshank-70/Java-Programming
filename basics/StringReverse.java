import java.util.Scanner;
class StringReverse{

    static String reverseChars(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String given=sc.nextLine();
        String result=reverseChars(given);
        System.out.println("reversed String is + "+result);

    }
}