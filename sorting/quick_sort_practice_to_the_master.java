public class quick_sort_practice_to_the_master {
    // performing partitaion
    public static int partitaion(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                //swap
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;

            }
        }
        // last swap for the first run
        i++;
        int t= arr[high];
        arr[high]=arr[i];
        arr[i]=t;

        return i;
    }

    //performing quickSort
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotedIndex= partitaion(arr,low,high);
            quickSort(arr,pivotedIndex+1,high);
            quickSort(arr,low,pivotedIndex-1);

        }
    }
    public static void main(String [] args){
        int arr[]={3,12,7,5,1,57,744,56,345};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}