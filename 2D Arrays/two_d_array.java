// //Taking a matrix as an input and printing its elements.
// import java.util.*;
// public class two_d_array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row size :");
//         int rows = sc.nextInt();
//         System.out.print("Enter column size :");
//         int cols = sc.nextInt();
//         int numbers[][] = new int[rows][cols];

//         //input
//         //rows
//         System.out.println("Enter rows and column :");
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 numbers[i][j]= sc.nextInt();
//             }
//         }

//         //output
//         System.out.println("Your output is :");
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// //take a matrix as input from the user search for a given number x and print the indices at which it occur..?
// import java.util.*;
// public class two_d_array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter row size :");
//         int rows = 3; //sc.nextInt();
//         // System.out.print("Enter row column :");
//         int cols = 3;//sc.nextInt();

//         int numbers[][] = new int[rows][cols];

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         int x = sc.nextInt();

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 if(x == numbers[i][j]){
//                     System.out.println("x is found in :" + i+j);
//                 }
                
//             }
//         }

//     }
// }


import java.util.*;
public class two_d_array{

    public static boolean search( int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key){
                    System.out.println("found at INdex: "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int m = arr.length ,n = arr[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int key = sc.nextInt();
        search(arr,key);
    }
}





