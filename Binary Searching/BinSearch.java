// package Binary Searching;






//Lower Bound
// import java.util.*;

// public class BinSearch {
//     public static int lowerBound(int []arr, int n, int x) {
//       int i=0, j= arr.length-1;
//       int lower= n;
//       while(i<=j){
//           int mid = (i+j)/2;
//           if(arr[mid]>=x){
//               lower = mid;
//               j = mid - 1;
//           }
//           else{
//               i = mid +1;
//           }
//       }
//       return lower;
//     }
     
     
//      public static void main(String[] args) {
//         int[] arr = {3, 5, 8, 15, 19};
//         int n = 5, x = 2;
//         int ind = lowerBound(arr, n, x);
//         System.out.println("The lower bound is the index: " + ind);
//     }
// }


//upper Bound
public class BinSearch {
    public static int lowerBound(int []arr, int n, int x) {
        int i=0, j=arr.length-1;
        int ans =n;
        while(i<=j){
            int mid= (i+j)/2;
            if(arr[mid]>x){
                ans = mid;
                j = mid -1;
            }
            else{
                i = mid+1;
            }
        }
        return ans;
    }
  public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 6;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}