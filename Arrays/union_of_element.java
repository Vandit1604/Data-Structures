public class union_of_element {
    public static void union(int arr1[],int arr2[]){
        int count,k=0,count1=0;
        int total= arr1.length+arr2.length;
        int arr3[]= new int[total];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            count=0;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    count++;
                    count1++;
                }

            }
            if(count==0) {
                arr3[arr1.length+k]=arr2[i];
                k++;
            }
        }
        // sorting arr3;
        // bubble sort;
        for(int i=0;i<total-count1-1;i++){
            for(int j=0;j<total-count1-1-i;j++){
                if (arr3[j]>arr3[j+1]) {
                    int t=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=t;
                }
            }
        }
        for(int i=0;i<total-count1;i++){
            System.out.print(arr3[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[]={34,6,7,2,8};
        int arr2[]={5,6,7,8,9,10};
        union(arr1,arr2);
    }
}
