import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={3,5,4,1,7};
        //Arrays.sort(arr,0,3);
        //printArr(arr);
        Arrays.sort(arr);
        printArr(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);


    }
    
}
