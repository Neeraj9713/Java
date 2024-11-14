public class F5DecToBin {
    public static void decToBin(int n){
        int r = n;
        int decimal = 0;
    int pow = 0;
    while(n>0){
        int lastValue = n % 2;
        decimal = decimal + (lastValue * (int)Math.pow(10, pow));
        pow++;
        n = n/2;
    }
    System.out.println("Value is :"+ r + " Binary :"+decimal);
    
   }
    
    public static void main(String[] args) {
        decToBin(50);
    }
}
