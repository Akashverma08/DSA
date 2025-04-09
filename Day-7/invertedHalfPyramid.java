public class invertedHalfPyramid {

    public static void halfpyramid(int n){
        System.out.println("Inverted Half Pyramid: ");
        for(int i=1;i<=n;i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }

    public static void pyramidNumber(int n){
        /*for(int i=1;i<=n;i++){
            int x=1;
            for(int j=n;j>=i;j--){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }*/

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfpyramid(10);
        pyramidNumber(5);
    }
    
}
