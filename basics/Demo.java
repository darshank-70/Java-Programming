import java.util.Arrays;
class Demo{
    public static void main(String[] arfs){
        int[] a={1,2,3,4,5,6,7,8,9,0};
        int[] l=Arrays.copyOfRange(a,0,5);
        int[] r=Arrays.copyOfRange(a,5,10);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(r));
        int[] b=a;
        if(a==b){
            System.out.println("a is b");
        }
        int[] l1=Arrays.copyOfRange(a,0,5);
        if(l1==l){
            System.out.println("l1 is l");
        }
    }
}