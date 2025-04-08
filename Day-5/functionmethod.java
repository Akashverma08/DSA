import java.util.Scanner;

public class functionmethod{
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1,int num2){  //formal Parameter
        int sum=num1+num2;
        return sum;
    }

    public static int product(int a,int b){
        int product=a*b;
        return product;
    }


    public static void main(String[] args) {
        //printHelloWorld();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b); //actual Parameter
        System.out.println("Sum :"+sum);

        //Product of two number

        int product=product(12,4);
        System.out.println("Product :"+product);

        
    }
}
