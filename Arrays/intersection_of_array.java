import java.util.Scanner;

public class intersection_of_array {
    public static void intersection(int arr1[],int arr2[]){
        int arr3[]=new int[100],k=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3[k]=arr1[i];
                    k++;
                }
            }
        }
        for(int i=0;i<k-1;i++) {
            for (int j = 0; j < k - 1 - i; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int t = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = t;
                }
            }
        }
        System.out.println("Intersection of array is: " );
        for(int i=0;i<k;i++){
            System.out.print(arr3[i]+" ");

        }
    }

    public static void main(String [] args){
        int arr1[]={34,8,7,2,6};
        int arr2[]={5,6,7,8,9,10};
        intersection(arr1,arr2);
    }
}
