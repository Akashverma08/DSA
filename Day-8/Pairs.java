public class Pairs {

    public static void pairArr(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){

            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs: "+tp);

    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,8,9,90};
        pairArr(numbers);
    }
    
}
