import java.util.*;

public class practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter c: ");
        int c=sc.nextInt();

        int avg=(a+b+c)/3;
        System.out.println("Average :"+avg);

        //Area of Square
        System.out.print("Input side of square:");
        int s=sc.nextInt();
        int area=s*s;
        System.out.println("Area Of Square:"+area);

        //Find total cost of item using float
        System.out.print("Enter price of pencil:");
        float x=sc.nextFloat();
        System.out.print("Enter price of pen:");
        float y=sc.nextFloat();
        System.out.print("Enter price of eraser:");
        float z=sc.nextFloat();
        float total=x+y+z;
        System.out.println("Total Cost:"+total);
        float gst=total+ total*0.18f;
        System.out.print("Total Cost with GST:"+gst);


        byte p=4;
        char q='a';
        short r=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;
        double result=(f*p)+(i%q)-(d*r);
        System.out.println("Result:"+result);

        int $=24;
        System.out.println($);
        

    }
    
}
