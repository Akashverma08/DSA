public class binaryDecimal{

    public static void bintodec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum + (lastDigit)*(int)Math.pow(2, pow);
            binNum=binNum/10;
            pow++;
        }
        System.out.println("Decimal number  of "+myNum+" is "+decNum);
    }
    public static void main(String[] args) {

        bintodec(101);
        
    }
}