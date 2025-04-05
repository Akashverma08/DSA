import java.util.*;
public class condition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        /*System.out.print("Enter Your Salary:");
        int s=sc.nextInt();
        int tax;

        if(s<500000){
            tax=0;

        }
        else if(s>=500000 && s<=1000000){
            tax=(int)(s*0.2f);
            


        }
        else{
            tax=(int)(s*0.3f);
            
        }
        System.out.println("total tax taken:"+tax);*/

        //Largest Among 3 number
        System.out.print("Enter Number A:");
        int a=sc.nextInt();
        System.out.print("Enter Number B:");
        int b=sc.nextInt();
        System.out.print("Enter Number C:");
        int c=sc.nextInt();

        if( a>b && a>c){
            System.out.println("Number A is greatest");
        }
        else if(b>a && b>c ){
            System.out.println("Number B is greatest");
        }
        else{
            System.out.println("Number C is greatest");
        }

        //Check pass or fail usin ternary operator

        System.out.print("Enter Marks:");
        int marks=sc.nextInt();

        String result=(marks>=33)?"Pass":"Fail";
        System.out.println("Result:"+result);

        //Making Calculator using Switch statement:

        

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter Number 1:");
        int x=sc.nextInt();
        System.out.print("Enter Number 2:");
        int y=sc.nextInt();
        System.out.print("Enter the option:");
        int option=sc.nextInt();
        int r;
        switch(option){
            case 1: r=x+y; System.out.println("Addition:"+r);break;

            case 2:r=x-y; System.out.println("Substraction:"+r);break;

            case 3:r=x*y; System.out.println("Multiplication:"+r);break;

            case 4:r=x/y; System.out.println("divison:"+r);break;

            default:System.out.println("Invalid Option"); break;
        }


    }
}