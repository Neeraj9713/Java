// import java.util.Arrays;

// public class InsertionSort {
//     public static void sort(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             int curr = i;
//             int prev = i-1;
//             while(prev>=0 && arr[prev] > arr[curr]){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }

//             arr[prev+1] = arr[curr];
//         }
//       }
//     public static void main(String[] args) {
//         int arr[] = {5,4,1,3,2};
//         Arrays.sort(arr);

//         // sort(arr);
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     } 
// }

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int arr[] , int n){
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
          for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

     public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;
        sort(arr, n);
    }
    
}









