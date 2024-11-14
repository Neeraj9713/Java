public class R12_pairing {
    public static int pair(int n){
        if(n==1||n==2){
            return n;
        }

        //Single
        int single = pair(n-1);

        //Pair
        int twoPair = pair(n-2);
        int pairWays = (n-1)*twoPair;

        //total ways
        int totalWays = single + pairWays;
        return totalWays;

    }
 public static void main(String[] args) {
    System.out.println(pair(3));
 }   
}
