import java.util.Scanner;

public class Program_for_finding_determinant_of_matrix {
    // matrix function
    public static void determinant(int arr[][],int n){
        int ans=1;
        int ans1=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0 || i==1 && j==1){
                    ans = ans*arr[i][j];
                }
                else{
                    ans1 = ans1*arr[i][j];
                }
            }
        }
        int n1=ans-ans1;
        System.out.println("determinant of matrix is: "+n1);

    }
    // determinate of 2X2 matrix
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=2;
        int arr[][]=new int[n][n];
        System.out.println("Enter the element of 2X2 matrix: ");
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               arr[i][j]=input.nextInt();
          }
        }
        determinant(arr,n);
 }
}
