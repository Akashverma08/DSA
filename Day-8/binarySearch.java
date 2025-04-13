import java.util.Scanner;

public class binarySearch {
    public static int binary(int numbers[],int key){
        int start=0;
        int end=numbers.length -1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
           
        }
        return -1;

    }
        
    


    public static void main(String[] args) {
        int numbers[]={1,2,3,4,55,66,77,89,100};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int result=binary(numbers,key);
        if(result==-1){
            System.out.println("Element not found in Array");
        }
        else{
            System.out.println(numbers[result]+" found in Array");
        }

    }
}
