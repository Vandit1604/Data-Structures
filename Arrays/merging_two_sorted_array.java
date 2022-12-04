import java.util.Scanner;

public class merging_two_sorted_array {
    // merging array function
    public static void merge(int arr[],int size,int arr1[]){

        for(int i=0;i<size;i++){
            arr1[size+i]= arr[i];
        }
        // bubble sorting
        for(int i=0;i<2*size-1;i++){
            for(int j=0;j<2*size-1-i;j++){
                if(arr1[j]>arr1[j+1]){
                    int t= arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=t;
                }
            }
        }
        for(int i=0;i<2*size;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    // main calling function;
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int size= 5;
        int arr[]= new int[size];
        int arr1[]=new int[2*size];
        System.out.println("Enter the first array sorted element:");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the second array sorted element:");
        for(int i=0;i<size;i++){
            arr1[i]=input.nextInt();
        }
        merge(arr,size,arr1);

    }
}
