import java.util.Scanner;

public class factorial {

    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }

    public static int binomialCoff(int n,int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nr_fact=fact(n-r);
        int bc=(n_fact)/(r_fact * nr_fact);
        return bc;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int factorial=fact(n);
        System.out.println("Factorial :"+factorial);

        //Binomial Cofficient
        System.out.println("binomial Cofficient: ");
        System.out.print("Enter the number n: ");
        int a=sc.nextInt();
        System.out.print("Enter the number r: ");
        int b=sc.nextInt();
        int bc=binomialCoff(a,b);
        System.out.print("Binomial Cofficient of n and r is :"+bc);
    }
    
}