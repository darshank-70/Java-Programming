//✔✔✔
import java.util.Arrays;
class SelectionSort{

    static int[] sort(int[] arr){
        
        int temp,minIndex=0,right=1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
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