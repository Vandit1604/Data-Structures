import java.util.Scanner;

public class Program_for_matrix_multiplication {
    // multiplication function
    public static void multiplication(int arr[][],int arr1[][],int p,int q){
        int ans[][]=new int[p][q];
        int ans1;
        // traversing row;
        for(int i=0;i<p;i++){
            // traversing column;
            for(int k=0;k<q;k++) {
                ans1=0;
                for (int j = 0; j < q; j++) {
                    ans1 = ans1 + arr[i][j] * arr1[j][k];
                }
                ans[i][k]=ans1;
            }
        }
        // output.
        System.out.println("Multiplication of matrix is: ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    // main calling function
    public static void main(String[] args) {
        int p= 3;// rows
        int q= 3;// column
        int arr[][]= new int[p][q];
        int arr1[][]=new int[p][q];
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the elements of first 2D matrix ");
        // input 1;
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the elements of second 2D matrix: ");
        // input 2;
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr1[i][j]=input.nextInt();
            }
        }
        multiplication(arr,arr1,p,q);
    }
}
