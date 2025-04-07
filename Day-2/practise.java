import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        //Question 1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if (number>0) {
            System.out.println("Positive Number");
            
        }
        else{
            System.out.println("negative Number");
        }

        //Question 2
        double temp=103.5;
        if (temp>100) {
            System.out.println("You have Fever");
            
        }
        else{
            System.out.println("You don't have a Fever");
        }
        

        //Question 3
        System.out.print("Input Week number(1-7): ");
        int week=sc.nextInt();
        switch(week){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default:System.out.println("Invalid Input");break;
        }

        //Question 4
        System.out.print("Enter the Year: ");

        int year=sc.nextInt();
        
        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=((year%100==0) && (year%400==0));
        if(x && (y||z)){
            System.out.println(year+"is a leap year");

        }else{
            System.out.println(year+"is not a leap year");
        }
    }
    
}
