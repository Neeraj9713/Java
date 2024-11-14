// package Arrays;
public class array_trapped_water {
    public static int trappedRainWater(int height[]){
        //left MAX boundries
        int leftMax[] = new int[height.length];
        leftMax[0]= height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //right MAX boundries
        int rightMax[] = new int[height.length];
        rightMax[height.length-1]= height[height.length-1];
        for(int i=height.length-2; i>=0; i-- ){
            rightMax[i] = Math.max(height[i], rightMax[i+1]); 
        } 

        int trappedWater=0;
        // loop
        for(int i=0; i<height.length; i++){
            // waterlevel = min(left MAX, right MAX)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

              // trappedWater = min(left,right)
            trappedWater += waterlevel-height[i];

        }
      
         return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
    
}
