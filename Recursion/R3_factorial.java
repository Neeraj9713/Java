public class R3_factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }

       int fact1 = n * fact(n-1);
        return fact1;
    }    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
