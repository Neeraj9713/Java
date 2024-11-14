// import java.util.*;
// public class loop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(a = 1; a<=100;a++)
//         {
//             System.out.println(a);
//         }
//     }
// }

// import java.util.Scanner;
// public class loop
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the value of n");
//         int n = sc.nextInt();
//         int i,j;
//         for(i=1;i<n;i++)
//         {
//             for(j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }


// while(condition){
    //do something
// }

// import java.util.Scanner;
// public class loop{
//     public static void main(String[] args){
//         try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//             int i = 1;
//             while(i<=n){
//                 System.out.println(i);
//                 i++;
//             }
//         }

//     }
// }


// public class loop{
//     public static void main(String[] args){
//         int i=1;
//         do{
//             System.out.println("Neeraj");
//             i=i+1;
//         }
//         while(i<=100);
//     }
// }



// // Q.1 = print sum of all natural no..?
// import java.util.Scanner;
// public class loop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number: ");
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i=1; i<=n; i++){
//             sum = sum + i;
//         }
//         System.out.print(sum);
//     }
// }

// // Q.2 = print the table of a number input by the user...?
// import java.util.Scanner;
// public class loop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i;
//         for(i=1; i<=10; i++){
//             System.out.println(n*i);
//         }
//     }
// }


// Q.2 = print the table of a number input by the user...?
import java.util.Scanner;
public class loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int i;
        for(i=1; i<=10; ){                     // loop me teno condition optional hoti he  if i =1 hoga to bhi run  hogA
           
            // for(i=1; ; ){      this is also run
                 System.out.println(i);
        }
    }
}