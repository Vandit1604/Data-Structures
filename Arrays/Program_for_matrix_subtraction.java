import java.util.Scanner;

public class Program_for_matrix_subtraction{
    // subtraction function
    public static void subtraction(int arr[][],int arr1[][],int p,int q){
        int ans[][]=new int[p][q];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                ans[i][j]=arr[i][j]-arr1[i][j];
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++ ){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    // main calling function;
    public static void main(String[] args) {
        int p= 3;// rows
        int q= 3;// column
        int arr[][]= new int[p][q];
        int arr1[][]=new int[p][q];
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the elements of first 2D matrix ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the elements of second 2D matrix: ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr1[i][j]=input.nextInt();
            }
        }
        subtraction(arr,arr1,p,q);
    }
}
