import java.util.Scanner;

public  class loop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int i=1;
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }*/

        //Sum of first n natural number
        int i=1;
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.print("Sum of n natural Number :"+sum);


    }
}