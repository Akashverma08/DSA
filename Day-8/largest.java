import java.util.*;
public class largest {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<=numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int numbers[]={1,45,2,45,78,11,89};
        int max=getLargest(numbers);
        System.out.println("Max value from Number array is: "+max);

        
    }
    
}
