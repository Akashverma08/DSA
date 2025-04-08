public class prime {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    //Find all prime number in range
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        primeRange(13);
        
    }
    
}