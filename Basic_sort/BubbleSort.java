

// public class BubbleSort {
//     public static void sort(int arr[]){
//       for(int i=0; i<arr.length-1; i++){
//         for(int j=0; j<arr.length-i-1; j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }
//       }
        
//             for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");

//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {5,4,1,3,2};
//         sort(arr);
    
//     }
// }


import java.util.*;
public class BubbleSort{

    public static void sort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;
        sort(arr, n);
    }
}