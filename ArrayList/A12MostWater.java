import java.util.*;

public class A12MostWater {
    public static int mostWater(ArrayList<Integer> height){
        int compare = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int minHeight = Math.min(height.get(i) , height.get(j));
                int width = j - i;
                 int water = minHeight * width;
                 compare = Math.max(compare , water);
            }
        }
return compare;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
       System.out.println(mostWater(height));
    }
    
}
