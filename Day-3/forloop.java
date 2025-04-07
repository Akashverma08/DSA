public class forloop{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("Hello World");
        }

        //Star Pattern
        for(int lines=1;lines<=4;lines++){
            System.out.println("****");
        }

        //Reverse of a number
        int n=10899;
        int r;
        int sum=0;
        while(n>0){
            r=n%10;
            sum=r + sum*10;
            n=n/10;


        }
        System.out.println("Reverse of number:"+sum);

        //Break Statement

        for(int i=1;i<=6;i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
    }

    

    
    
}
