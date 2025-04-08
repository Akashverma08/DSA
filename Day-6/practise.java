public class practise {

    public static int average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }

    //isEven test 

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    //Palindrome
    public static void isPalindrome(int n){
        int orgNum=n;
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            sum=sum*10 +r;
            n=n/10;
        }
        if(orgNum==sum){
            System.out.println(orgNum+" is a Palindrome "+sum);
        }
        else{
            System.out.println(orgNum+" is not a Palindrome "+sum);
        }
    }

    //SUM OF DIGIT
    public static void sumDigit(int n){
        int rem;
        int sum=0;
        while(n>0){
            rem=n%10;
            sum=sum +rem;
            n=n/10;
        }
        System.out.println("Sum of digit: "+sum);
    }




    public static void main(String[] args) {
        int avg=average(12,34,56);
        System.out.println("Average of 3 Numbers :"+avg);
        System.out.println(isEven(3));
        isPalindrome(231);
        sumDigit(123);
    }
    
}
