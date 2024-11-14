public class R9_power {
    public static int power(int n, int i){
        if(i==0){
            return 1;
        }
        // int nim1 = power(n,i-1);            // 1 - type
        // int a = n * nim1;
        // return a;
        return n * power(n , i-1);               // 2 - type
    }
    public static void main(String[] args) {
        int n=2 , i=10;
        System.out.println(power(n, i));
    }
    
}
