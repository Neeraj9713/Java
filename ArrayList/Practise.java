// import java.util.ArrayList;
// public class Practise {

//     public boolean isMonotonic(ArrayList<Integer> A) {
//         boolean inc = true;
//         boolean dec = true;
//         for (int i=0; i<A.size()-1; i++) {
//         if (A.get(i) > A.get(i+1))
//         inc = false;
//         if (A.get(i) < A.get(i+1))
//         dec = false;
//         }
//         return inc || dec;
//         }
//     public static void main(String[] args) {
//         ArrayList<Integer> A = new ArrayList<>();
//         // A.add(6);
//         A.add(1);
//         A.add(2);
//         A.add(1);
//        System.out.print(check(A));
//     }
    
// }



import java.util.ArrayList;
public class Practise {
    public static void check(ArrayList<Integer> nums){
        
    }
   
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
       check(nums);
    }
    
}
