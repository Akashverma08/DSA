import java.util.*;
public class prefixSum {

    public static void sumSub(int numbers[]){
        int prefix[]=new int[numbers.length];
        int currSum;
        int maxSum=Integer.MIN_VALUE;
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];

        }
        for(int i=0;i<numbers.length;i++){
            int start=0;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("MAX Sum value : "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        sumSub(numbers);
    }
    
}
