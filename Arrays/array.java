// package Arrays;
// // array type ..(1)

// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         int marks[] = new int[3];
//         marks[0]=94;
//         marks[1]=97;
//         marks[2]=98;

//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// // array type...(2)
// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         int marks[] = {65,55,77,88,99};
//         for(int i=0; i<5; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// // input output array
// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int marks[]=new int[size];
        
//         // input
//         for(int i=0; i<size; i++){
//             marks[i] = sc.nextInt();
//         }

//         //output
//         for(int i=0; i<size; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int marks[] = new int[size];

//         //input
//         for(int i=0; i<size; i++){
//             marks[i]=sc.nextInt();
//         }

//         int x = sc.nextInt();

//         //output
//         for(int i=0; i<marks.length; i++){
//             if(x == marks[i]){
//                 System.out.println("x is found at index :"+i);
//             }
//         }
//     }
// }


import java.util.*;
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i%j == 0){
                    System.out.print(i);
                }
            }
        }
    }
}
