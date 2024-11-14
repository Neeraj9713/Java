public class R4_natural {
    public static int sumNatural(int n){
        if(n==1){
            return 1;
        }
        int sum = sumNatural(n-1);
        int s = n + sum;
        return s;

    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sumNatural(n));
    }
}