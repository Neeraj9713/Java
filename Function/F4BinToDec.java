public class F4BinToDec {
    public static void BinToDec(int n){
        int r = n;
        int pow = 0;
        int decimal = 0;
        while(n>0){
            int lastValue = n % 10;
             decimal = decimal+(lastValue * (int)Math.pow(2,pow)); 
            pow++;
            n = n/10;
        }
        System.out.println("Binary no.. is "+ r +" decimal value is.. " + decimal);
    }
    public static void main(String[] args) {
        BinToDec(100);
    }
    
}
