// // package Basic_sort;

// public class SelectionSort {
//     public static void sort(int arr[]){
//         for(int i=0; i<arr.length; i++ ){
//             int min = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[min]>arr[j]){
//                     min = j;
//                 }
//             }
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {5,4,1,3,2};
//         sort(arr);
//        for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i]+" ");
//        }
//     }
    
// }
 

import java.util.*;
public class SelectionSort{

    public static void sort(int arr[] , int n){
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]<arr[j]){
                    min = j;
                }
            }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;
        sort(arr, n);
    }
}