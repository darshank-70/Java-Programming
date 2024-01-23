
//✔✔✔
import java.util.Arrays;
class MergeSort{

    static void merge(int[] arr, int l, int mid, int r) {
    int i = 0, j = 0, k = l;  // Start k at the leftmost index 'l'.

    int[] leftArray = Arrays.copyOfRange(arr, l, mid + 1);
    int[] rightArray = Arrays.copyOfRange(arr, mid + 1, r + 1);

    while (i < leftArray.length && j < rightArray.length) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k] = leftArray[i];
            i++;
        } else {
            arr[k] = rightArray[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements from both arrays back into 'arr'.
    while (i < leftArray.length) {
        arr[k] = leftArray[i];
        i++;
        k++;
    }
    while (j < rightArray.length) {
        arr[k] = rightArray[j];
        j++;
        k++;
    }
}

    static int[] mergeSort(int[] arr,int l,int r){

       
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
        return arr;
    }

    public static void main(String[] args){
        //int[] arr={9,3,1,0,-3,100};
        int[] arr={-5,999,90,12,0,-999};
        int[] result=mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(result));

    }
}