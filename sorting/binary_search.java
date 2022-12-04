public class binary_search {
    // binary search using recurssion
    public static void binarySearch(int arr[],int lower,int upper,int key){
        int mid=0;
        if(lower<=upper){
            mid=lower+(upper-lower) /2;
        }
        if(key==arr[mid]){
            System.out.println("Element is found");
            return;
        } else if (key>arr[mid]) {
            binarySearch(arr,mid+1,upper,key); ;
        }
        else{
            binarySearch(arr,lower,mid-1,key);
        }
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,13,23,34,45};
        int upper=arr.length;
        int lower=0;
        int key=1;
        binarySearch(arr,lower,upper-1,key);
    }
}
