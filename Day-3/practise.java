import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Sum of Integer
        System.out.print("Enter the range of Number: ");
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even=even+i;
            }else{
                odd=odd+i;
            }
        }
        System.out.println("Sum of Even Integer: "+even);
        System.out.println("Sum of Odd Integer: "+odd);

        //Question 2(Factorial Number)
        System.out.print("enter the Number: ");
        int input=sc.nextInt();
        int fact=1;
        for(int i=1;i<=input;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+input+" is "+fact);

        //Question 3(Multiplication of Number)
        System.out.print("Enter Number: ");
        int number=sc.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(number+"X"+j+"="+number*j);
        }
    }
    
}
