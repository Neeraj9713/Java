public class R10_tiling {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //Vertical choice
        int vertical = tilingProblem(n-1);

        //Horizontal choice 
        int horizontal = tilingProblem(n-2);

        int totalWays = vertical + horizontal;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
    
}
