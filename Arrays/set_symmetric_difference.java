public class set_symmetric_difference {

    public static void setSymmetricDiffer(int setA[],int setB[]){

        int setC[]=new int[setA.length];
        int setD[]=new int[setB.length];
        int k=0,count=0,k1=0,count1=0;
        // set difference(A-B)
        for(int i=0;i<setA.length;i++){
            for(int j=0;j<setB.length;j++){
                if(setA[i]!=setB[j]){
                    setC[k]=setA[i];
                }
                else{
                    count++;
                }
            }
            k++;
        }

        for(int i=0;i<setA.length-count;i++ ){
            System.out.print(setC[i]+" ");
        }
        System.out.println();
        // set difference (B-A);
        for(int i=0;i<setB.length;i++){
            for(int j=0;j<setA.length;j++){
                if(setB[i]!=setA[j]){
                    setD[k1]=setB[i];
                }
                else{
                    count1++;
                }
            }
            k1++;
        }
        for(int i=0;i<setB.length-count1;i++){
            System.out.print(setD[i]+" ");

        }

        }
        // main calling function;
    public static void main(String[] args) {
        int setA[]={3,5,6,7,8,9};
        int setB[]={10,11,7,8,12,24};
        setSymmetricDiffer(setA,setB);
    }
}
