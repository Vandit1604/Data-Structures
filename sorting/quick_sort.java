public class quick_sort {
    public static int partation(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                // swap
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        i++;
        int t=arr[i];
        arr[i]=pivot;
        arr[high]=t;
        return i;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pivotedindex=partation(arr,low,high);
            quicksort(arr,low,pivotedindex-1);
            quicksort(arr,pivotedindex+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,5,3,7,9,8};
        int n=arr.length;
        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
