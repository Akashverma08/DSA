import java.util.*;
public class breakl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("enter the number");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);

        }while(true);

        //continue

        for(int i=1;i<10;i++){
            if(i==4){
                continue;
            }
            System.out.println(i);

        }

        do{
            int input=sc.nextInt();
            if(input%10==0){
                continue;
            }
            if(input%11==0){
                break;
            }
            System.out.println(input);
        }while(true);

    }
    
}
