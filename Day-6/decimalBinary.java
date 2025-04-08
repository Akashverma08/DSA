public class decimalBinary {

    public static void dectobin(int decNum){
        int myNum=decNum;
        int rem;
        int binNum=0;
        while(decNum>0){
            rem=decNum%2;
            binNum=binNum*10 + rem;
            decNum=decNum/2;
        }
        System.out.println("Binary of "+myNum+" is "+binNum);
    }

    //ALternative way

    public static void decBin(int decNum){
        int myNum=decNum;
        int pow=0;
        int rem;
        int binNum=0;
        while(decNum>0){
            rem=decNum%2;
            binNum=binNum + (rem*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("Binary of "+myNum+" is "+binNum);
    }


    public static void main(String[] args) {
        dectobin(11);
        decBin(5);
    }
    
}
