import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;

            }
        }
        if(count>1){
            System.out.println(n+" is not a Prime Number");
        }else{
            System.out.println(n+" is a Prime Number");
        }
    }
    
}
