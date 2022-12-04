import java.util.Scanner;

public class reversal_array {
    // reversal array
    public static void reversal(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[size-i-1]+" ");
        }
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int size=5;
        int arr[]=new int[size];
        System.out.println("Enter the element of array:");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        reversal(arr,size);
    }
}
