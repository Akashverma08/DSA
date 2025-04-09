public class hollowRectangle{

    public static void hollowpattern(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            //cell - i,j
            //boundary condition
            for(int j=1;j<=totcol;j++){
                if(i==1||i==totrow||j==1||j==totcol){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    


    public static void main(String[] args) {

        hollowpattern(4, 5);
        
    }
}