// import java.util.Arrays;
// public class sort {
// public static void main(String[] args) {
        
//         int arr[] = {5,4,1,3,2};
//         Arrays.sort(arr , 0,3);
//         for(int i=0; i<5; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
    
// }


import java.util.Collections;
import java.util.Arrays;
public class sort {
public static void main(String[] args) {
        
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr , 0,3);
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
