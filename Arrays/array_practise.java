// package Arrays;
// //1 = Take an array of names as input from the user and print them on the screen.
// import java.util.*;
// public class array_practise {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String names[] = new String[size];

//         //input
//         for(int i=0; i<size; i++){
//             names[i] = sc.next();
//         }

//         //output
//         for(int i=0; i<names.length; i++){
//             System.out.println("name "+(i+1)+" is = "+ names[i]);
//         }
//     }
// }

// // 2 = Find the maximum & minimum number in array of integers.
// // [hint: read about]
// // [integer.MIN_VAlUE &
// // integer.MAX_VALUE in java]
// import java.util.*;
// public class array_practise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         //input
//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }
        
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i]<min){
//                 min = numbers[i];
//             }
//             if(numbers[i]>max){
//                 max = numbers[i];
//             }
//         }

//         System.out.println("Largest number is :"+ max);
//         System.out.println("Smallest number is :"+ min);
//     }
// }


// // 3 = Take an array of numbers as input and check if it is an array sorted in ascending order.
// // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// //        {3, 4, 6, 2} is not sorted in ascending order.
// import java.util.*;
// public class array_practise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         //input
//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt(); 
//         }

//         boolean isAscending = true;

//         for(int i=0; i<numbers.length-1; i++){
//             if(numbers[i]>numbers[i+1]){
//                 isAscending = false;
//             }
//         }
//         if(isAscending){
//             System.out.println("the array is sorted in ascending order");
//         }
//         else{
//             System.out.println("The array is not sorted in ascending order");
//         }
//     }
// }

// // sorting in ascending order
// import java.util.*;
// public class array_practise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your size :");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
         
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Your number is:");
//         for(int j=0; j<arr.length; j++){
//             for(int i=j+1; i<arr.length; i++){
//                 if(arr[j]>arr[i]){
//                     int temp = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = temp;
//                 }
//             }
//         }

//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


// //sorting in descending order
// import java.util.*;
// public class array_practise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your size :");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Your number is:");
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]<arr[j]){
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
        
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// // sort method
// import java.util.*;
// public class array_practise{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = {5,6,1,8,3,4,2};

//         System.out.println("Your number is:");
//         Arrays.sort(arr);
//         // System.out.printf("\n\nSorted Array : %s", Arrays.toString(arr)); 
//         System.out.println(Arrays.toString(arr));
//     }
// }

// //array in descending order
// import java.util.Arrays; 
// import java.util.Collections; 
 
// public class array_practise 
// { 
//     public static void main(String[] args) 
//     { 
//         //Collections.reverseOrder do not work for primitive Types 
//         //define an array with Integer
//         Integer[] IntArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};  
 
//         //print original array
//         System.out.printf("Original Array: %s", 
//                  Arrays.toString(IntArray)); 
 
//         // Sorts IntArray in descending order 
//         Arrays.sort(IntArray, Collections.reverseOrder()); 
 
//         //print sorted array  
//         System.out.printf("\n\nSorted Array: %s", 
//                Arrays.toString(IntArray)); 
//     } 
// }

// // Write a Java program to sort a numeric array and a string array
// import java.util.*;
// public class array_practise{
//   public static void main(String args[]){
//     int arr1[] = {5,4,6,4,2,1 };
//     System.out.println(Arrays.toString(arr1));
//     String arr2[] = {"zeb","lo","name","ram", "sita"};
//     System.out.println(Arrays.toString(arr2));
    
//     Arrays.sort(arr1);
//     Arrays.sort(arr2);
//     System.out.println(Arrays.toString(arr1));
//     System.out.println(Arrays.toString(arr2));
//   }
// }

// //reverse a array
// import java.util.*;
// public class array_practise{
//     public static void main(String args[]){
//         String sc = "hello";
//         char chr[] = sc.toCharArray();
//         for(int i = chr.length-1; i>=0; i--){
//             System.out.print(chr[i]);
//         }
//     }
// }

// // Linear search datatype
// // pass by refrence
// import java.util.*;
// public class array_practise{
//     public static void linearsearch(String menu[], String key ){
//         for(int i=0; i<=menu.length; i++){
//             if(menu[i]==key){
//                 return i;
//             }    
//         }
//         return -1;
//     }
    
//     public static void main(String args[]){
//     String menu[] = {"Dosa","pizza","burgur","pasta"};
//     String key = "burgur";
    
//     int index = linearsearch(menu, key);
    
//     if(index==-1){
//         System.out.println("Not found");
//     }
//     else{
//         System.out.println("found at index :"+index);
//     }


//     }
// }


// // largest value
// //Smallest value

// import java.util.*;
// import javax.sound.sampled.SourceDataLine;
// public class array_practise{
//     public static int larg(int numbers[]){
//     int largest = Integer.MIN_VALUE;
//     int smallest = Integer.MAX_VALUE;
//     for(int i=0; i<numbers.length; i++){
//         if(largest < numbers[i]){
//             largest = numbers[i];
//         }

//         if(smallest>numbers[i]){
//             smallest = numbers[i];
//         }
//     }
//     System.out.println("Smallest value is :"+ smallest);
//     return largest;
// }
//     public static void main(String args[]){
//         int numbers[] = {1,2,3,5,4};
    
//     int a = larg(numbers);


//     System.out.println("Greater value is : "+a);
        
//     }
// }


// // time complexity =>  k=log2^n
// //Binary search 
// import java.util.*; 
// public class array_practise{
//     public static int binarySearchKey(int numbers[],int key){
//         int start =0 , end = numbers.length-1;
//         while(start<=end){
//            int mid = (start+end)/2;
//             if(numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start = mid+1;
//             }else{
//                 end = mid -1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12};
//         int key = 10;

//         int a = binarySearchKey(numbers,key);
//         System.out.println("your index is :"+a);
//     }
// }


// // reverse array
// import java.util.*;
// public class array_practise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[] = new int[size];
        
//         for(int i=0; i<number.length; i++){
//             number[i] = sc.nextInt();
//         }

       
//         System.out.println("Array all number :"+ Arrays.toString(number));

//         for(int i=number.length; i>0; i--){
//             System.out.print(i+" ");
//         }
//     }
// }


// // pairs of array
// import java.util.*;
// public class array_practise{
//     public static void main(String[] args) {
//         int tp=0;
//         int arr[] = {2,4,6,8,10};
//         for(int i=0; i<arr.length-1; i++){
//             int curr = arr[i];
//             for(int j=i+1; j<arr.length; j++){
//                 System.out.print("("+curr+","+arr[j]+")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total number :"+tp);
//     }
// }


// sub array part:- 1
import java.util.*;
public class array_practise{
    public static void arr(int number[]){
       int  currsum=0;
       int j,i,k;
        int tp=0;
        int maxsum=Integer.MIN_VALUE;
        for( i=0; i<number.length; i++){
            
            for( j=i; j<number.length; j++){
                
                currsum=0; 
                for( k=i; k<=j; k++){
                    System.out.print(number[k]+" ");
                    currsum = currsum + number[k]; 
                }
                
                System.out.println("sum is :"+currsum);
                tp++;
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum :"+maxsum);
        System.out.println("total sub array :"+tp);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        // int number[] = {1,-2,6,-1,3};

        arr(number);
        
    }
}

// //  sub array part:-2
// import java.util.*;
// public class array_practise{


//     // public static void arr(int number[]){
//     //    int  currsum=0;
//     //    int j,i ;
        
//     //     int maxsum=Integer.MIN_VALUE;
//     //     int prefix[] = new int[number.length];

//     //     prefix[0] = number[0];
//     //     for(i=1; i<prefix.length; i++){
//     //         prefix[i] = prefix[i-1] + number[i];
//     //     }


//     //     for( i=0; i<number.length; i++){
//     //         int start = i;
//     //         for( j=i; j<number.length; j++){
//     //             int end = j;
//     //             currsum = start ==0 ?prefix[end] : prefix[end]- prefix[start-1];       
                
//     //             if(maxsum<currsum){
//     //                 maxsum=currsum;
//     //             }
//     //         }
//     //     }
//     //     System.out.println("Max sum :"+maxsum);
//     // }


//     public static void kadanes(int number[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i=0; i<number.length; i++){
//             cs = cs + number[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("Enter max number :"+ms);
//     }
//     public static void main(String[] args) {
//         // int number[] = {2,4,6,8,10};
//         // int number[] = {1,-2,6,-1,3};
//         int number[] = {-2,-3,4,-1,-2,1,5,-3};
//         // arr(number);
//         kadanes(number);
//     }
// }



