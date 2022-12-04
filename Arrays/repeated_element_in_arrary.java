import java.util.Scanner;

public class repeated_element_in_arrary {
    // repeated element function
    public static void repetedElement(int arr[],int size){
        int count;
        for(int i=0;i<size;i++){
            count=0;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.println(arr[i]+" is repeated "+count+" times.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int size=5;
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        repetedElement(arr,size);
    }
}
