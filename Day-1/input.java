import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(input);

        int number=sc.nextInt();
        System.out.println(number);

        //Sum of a and b

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        int product=a*b;
        System.out.println("Product "+product);
        //Area of Circle
        System.out.print("Enter Radius");
        float r=sc.nextFloat();
        float area=3.14f*r*r;
        System.out.println("Area Of Circle:"+area);


        
    }
    
}
