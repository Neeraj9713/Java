// // Q.1    
// public class pattern {
//     public static void main(String[] args){
//         int r,c;
//         for(r=1; r<=4; r++){
//             for(c=1; c<=5; c++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }    
// }

// // Q.2     *****
// //         *   *
// //         *   *
// //         *****   
// public class pattern{
// public static void main(String[] args){
//     int r = 4;
//     int c = 5;
//     for(int i=1; i<=r; i++){
//         for(int j=1; j<=c; j++){

//         if(i==1|| j==1||i==r||j==c)
//         {
//         System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
//     }
// }
// }


// // Q.3      *
// //          **
// //          ***
// //          ****
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r,c;
//         for(r=1; r<=n; r++){
//             for(c=1; c<=r; c++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// // Q.4     ****
// //         ***
// //         **
// //         *
// import java.util.Scanner;
// public class pattern{
//     public static void main(String args[])
//     {
        
//         // Scanner sc = new Scanner(System.in);
//         int n=4;

//         for(int i=n; i>=1; i--)
//          {
//             for(int j=1; j<=i; j++) 
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// // Q.5        *
// //           **
// //          ***
// //         ****
// public class pattern{
//     public static void main(String[] args){
//         int n = 4;
//       for(int i=1; i<=n; i++)
//       {

//         for(int j=1; j<=n-i; j++)
//         {
//             System.out.print(" ");
//         }

//         for(int k=1; k<=i; k++)
//         {
//             System.out.print("*");
//         }
        
//         System.out.println();
//       }

//     }
// }

// // Q.6       1
// //           12
// //           123
// //           1234
// public class pattern{
//         public static void main(String[] args){
//             int n = 4;
        
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }


//         }
// }


// // Q.6       1234
// //           123
// //           12
// //           1
// public class pattern{
//     public static void main(String[] args){
//         int n = 4;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
    
// // Q.7      1
// //          2 3
// //          4 5 6
// //          7 8 9 10
// //          11 12 13 14

// public class pattern{
//     public static void main(String[] args){
//         int n=5;
//         int count = 1;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print(count+" ");
//                 count++;
//             }
//             System.out.println();
//         }

//     }
// }

// // Q.7      1
// //          0 1
// //          1 0 1
// //          0 1 0 1
// //          1 0 1 0 1

// public class pattern{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++)
//             {
//                 int sum = i+j;
//                 if(sum % 2==0){
//                 System.out.print("0 ");
//                 }
//                 else{
//                     System.out.print("1 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// // Q.8     solid rhombus
// //          *****
// //         *****
// //        *****
// //       *****
// //      *****
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your value: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n-i; j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=n; k++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// // Q.9     number pyramid
// //          1
// //         2 2
// //        3 3 3
// //       4 4 4 4
// //      5 5 5 5 5
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your value: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n-i; j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++)
//             {
//                 System.out.print(i+" ");
//             }
//             // for(int l=1; l<=i-1; l++)
//             // {
//             //     System.out.print(i);
//             // }
//             System.out.println();
//         }

//     }
// }

// // Q.10        1
// //            212
// //           32123
// //          4321234
// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();
//         int j,k,i,l;
        
//         for(i=1; i<=n; i++)
//         {
//             for(j=1; j<=n-i; j++)
//             {
//                 System.out.print(" ");
//             }

//             for( k=i; k>=1; k--)
//             {
//                 System.out.print(k);
//             }

//             for(l=2; l<=i; l++){
//                 System.out.print(l);
//             }
//         System.out.println();}
//     }
// }


// // Q..12    *      *
// //          **    **
// //          ***  ***
// //          ********
// //          ********
// //          ***  ***
// //          **    **
// //          *      *

// public class pattern{
//     public static void main(String[] args){
//         int n = 4;
//         int i,j,k,l;
//         for(i=1; i<=n; i++){
//             for(j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(k=1; k<=2*(n-i); k++){
//                 System.out.print(" ");
//             }
//             for(l=1; l<=i; l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//         //lower part
//         for(i=n; i>=1; i--){
//             for(j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(k=1; k<=2*(n-i); k++){
//                 System.out.print(" ");
//             }
//             for(l=1; l<=i; l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // Q..13      ****
//              *  *
//             *  *
//            ****

// import java.util.Scanner;
// public class pattern{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter your value: ");
//         // int n = sc.nextInt();
//         int  n=4;
//         for(int i=1; i<=n; i++)
//         {
//             for(int j=1; j<=n-i; j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=n; k++)
//             {
//                 if(k==1||k==n||i==n||i==1){
//                 System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }

// Q.14

// import java.util.*;
// public class pattern{
//     public static void main(String[] args)
//     {
//         int n=4;
//         int i,j,k;
//         for(i=1; i<=n; i++)
//         {
//             for(j=1; j<=n-i; j++)
//             {
//                 System.out.print(" ");
//             }
//             for(k=1; k<=2*i-1; k++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//             for(i=n; i>=1; i--)
//             {
//                 for(j=1; j<=n-i; j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(k=1; k<=2*i-1; k++)
//                 {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//     }
// }

// //Q.15       *
//     //     * * *
//     //   * * * * *
//     //   * * * * *
//     //     * * *
//     //       *
//     import java.util.*;
// public class pattern{
//     public static void main(String[] args)
//     {
//         int n=3;
//         int r,c;
//         for(r=1; r<=n; r++){
//             for(c=1; c<=n-r; c++){

//                 System.out.print(" ");
//             }
//             for(int k=1; k<=r; k++){
//                 System.out.print("*");
//             }
//             for(int m=1; m<=r-1; m++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//             for(r=n-1; r>=1; r--){
//                 for(c=1; c<=n-r; c++){
    
//                     System.out.print(" ");
//                 }
//                 for(int k=1; k<=r; k++){
//                     System.out.print("*");
//                 }
//                 for(int m=1; m<=r-1; m++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//     }
// }


public class pattern{
    public static void main(String[] args) {
        int n=6;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n-r; c++){
                System.out.print(" ");
            }
            int count=1;
            for(int i=1; i<=r; i++){
                System.out.print(count+" ");
                count = count*(r-i)/i;
            }
            System.out.println();
        }
    }
}