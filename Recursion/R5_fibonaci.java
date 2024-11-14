public class R5_fibonaci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fibo(n-1);
        int fib2 = fibo(n-2);
        int fib = fib1 + fib2;
        return fib;
    }
    public static void main(String[] args) {
        int n=20;
        System.out.println(fibo(n));
    }
}
