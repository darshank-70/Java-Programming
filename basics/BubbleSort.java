//✔✔✔
import java.util.Arrays;

class BubbleSort{

    static int[] sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        //int[] arr={9,3,1,0,-3,100};
        int[] arr={-5,999,90,12,0,-999};
        int[] result=sort(arr);
        System.out.println(Arrays.toString(result));
    }
}