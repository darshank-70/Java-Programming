//✔✔✔
public class BinarySearchIterative{
    static int search(int[] arr,int key){
        int left=0,right=arr.length-1;
        
        
        while(left<=right){
            int mid=(left+right)/2;
            System.out.println("mid, left, right  "+mid+ ""+left+""+right);
            if(arr[mid]==key)return mid;
            if(key<arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
       int result = search(arr,8);
        System.out.println("Hello World");
      System.out.println(result);
    }
}