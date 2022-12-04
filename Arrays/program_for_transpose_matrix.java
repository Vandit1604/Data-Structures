import java.util.Scanner;

public class program_for_transpose_matrix {
    // transpose of matrix
    public static void transpose(int arr[][],int p,int q){
        int ans[][]=new int[p][q];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                ans[i][j]=arr[j][i];
            }
        }
        // output
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    // main calling function;
    public static void main(String[] args) {
        int p=3,q=3;
        int arr[][]=new int[p][q];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element of array: ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr[i][j]=input.nextInt();
            }
        }
        transpose(arr,p,q);
    }
}
