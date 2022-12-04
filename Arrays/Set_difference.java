public class Set_difference {
    // set different (set A-B);
    public static void setDifference(int arr[],int arr1[]){
        int arr3[]=new int[arr.length];
        int k=0,count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]!=arr1[j]){
                    arr3[k]=arr[i];
                }
                else{
                    count++;
                }
            }
            k++;
        }
        for(int i=0;i<arr.length-count;i++){
            System.out.print(arr3[i]+" ");
        }
    }
    // main calling function;
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8};
        int arr1[]={7,8,9,14,26};
        setDifference(arr,arr1);
    }
}
