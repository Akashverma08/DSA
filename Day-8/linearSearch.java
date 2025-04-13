public class linearSearch {

    public static int linear(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,4,5,6,10,12,45,55};
        int key=11;
        int index=linear(numbers,key);
        if(index==-1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element found at Position: "+index);
        }
    
        
    }
    
}
