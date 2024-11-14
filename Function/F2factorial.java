import java.util.Scanner;

public class F2factorial {

    public static int fact(int n){
       int f=1;
       for(int i=1; i<=n; i++){
        f = f*i;
       }
        return f;
    }
    public static int binomial(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);
        int binocoffe = n_fact/(r_fact * nmr_fact);
        return binocoffe;
    }
    public static void main(String args[]){

    int b = binomial( 5 , 2);
    System.out.println( b);

    }
}
