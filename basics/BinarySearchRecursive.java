//✔✔✔
class BinarySearchRecursive{

    static int search(int[] arr,int key,int left,int right ){
        
        int mid=(left+right )/2;
        System.out.println("mid is "+mid);
        if(left>right)return -1;
        if(arr[mid]==key)return mid;
        if(key<arr[mid]) return search(arr,key,left,mid-1);
        return search(arr,key,mid+1,right);
    }

    public static void main(String[] args){
         int[] arr={1,2,3,4,5,6,7,8};
         int result = search(arr,1,0,8);
         System.out.println("Hello World");
         System.out.println(result);
    }
}