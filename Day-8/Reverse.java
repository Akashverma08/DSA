public class Reverse {

    public static void reverse(int numbers[]){
        int start=0;
        int last=numbers.length-1;
        while(start<last){
            int temp=numbers[last];
            numbers[last]=numbers[start];
            numbers[start]=temp;
            start++;
            last--;


        }
    }

    public static void main(String[] args) {
        int numbers[]={1,2,4,90,12,111};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    
}
