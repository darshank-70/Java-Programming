import java.util.Scanner;
class ReverseWords{
    //one approach is to Split string at white spaces and join it reverse
    static String reverse(String str){
        String[] arr=str.split(" ");
        String result="";
        for(int i=arr.length-1;i>=0;i--){
            result=result+" " +arr[i];
        }
        return result;
    }
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inputStr=sc.nextLine();
        String result=reverse(inputStr);
        System.out.println("result: "+result);

    }
}