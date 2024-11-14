import java.util.*;

public class countSort {

    // public static void count(int arr[], int n){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         largest = Math.max(largest, arr[i]);
    //     }
    //     int count[] = new int[largest+1];
    //     for(int i=0; i<n; i++){
    //         count[arr[i]]++;
    //     }

    //     int j=0;
    //     for(int i=0; i<count.length; i++){
    //         while(count[i]>0){
    //             arr[j] = i;
    //             j++;
    //             count[i]--;
    //         }
    //     }

    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }

        
    public static void sort(int arr[], int n){
        int largest =Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,0,0,1};
        int n = arr.length;
        sort(arr, n);
    }
}