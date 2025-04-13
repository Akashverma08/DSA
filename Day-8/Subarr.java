public class Subarr {

    public static void sub(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    

                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total Number of pairs: "+ts);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        sub(numbers);
    }
    
}
