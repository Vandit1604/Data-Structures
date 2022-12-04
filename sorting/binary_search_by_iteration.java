public class binary_search_by_iteration {
    // binary search using the loop (iteration)
    public static void binarySearch(int arr[],int lower,int upper,int key){
        while(lower!=upper){
            int mid=(lower+upper)/2;
            if(key==arr[mid]){
                System.out.println("element is found");
            } else if (key>arr[mid]) {
                lower= mid+1;
            }
            else {
                upper=mid-1;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,12,23,34};
        int upper=arr.length;
        int lower=0;
        int key=12;
        binarySearch(arr,lower,upper-1,key);
    }
}
