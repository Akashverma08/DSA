public class passArray {

    public static void update(int marks[],int unchangeable ){
        unchangeable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={98,97,90};//Reference type
        int unchangeable=100;//Primitive type
        update(marks,unchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("Unchangeable: "+unchangeable);

    }
    
}
