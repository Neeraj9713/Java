import java.util.ArrayList;
public class A13pairSum {
    //  Brute force
    // public static boolean pSum(ArrayList<Integer> list , int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(target == list.get(i) + list.get(j) ){
    //                 // System.out.print(" ("+list.get(i)+" "+list.get(j)+") ");
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    
    public static boolean pSum(ArrayList<Integer> list , int target){
        int left = 0;
        int right = list.size() - 1;
        while (left!=right) {
        int value = list.get(left) + list.get(right);
        if(target == value){
            return true;
        }
        else if(value > target){
            right--;
        }           
        else{
            left++;
        } 
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pSum(list , target));
    }
    
}
