// import java.util.*;
// public class Q {
//     public static void main(String[] args) {
//         int input1=582109;
//         String str=""+input1;

//   int len=str.length();
//   int arr[]=new int[len];
//   int sum=0;

//   for(int i=0;i<len;i++)
//   {
//     arr[i]=input1%10;
//     input1 /=10;
//   }

//   for(int i=len-1;i>=0;i--)
//       for(int j=i;j>=0;j--)
//         sum+=arr[j];

//   System.out.println(sum);
//     }
// }


// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Q {
//     public static void sum1(int n){
//        String str = ""+n;
//         int len = str.length();
//         int arr[] = new int[len];
//         int sum=0;
//         for(int i=0; i<len; i++){
//             arr[i] = n%10;
//             n = n/10;
//         }
//         for(int i=len-1; i>=0; i--){
//             for(int j=i; j>=0; j--){
//                 sum = sum + arr[j];
//             }
//         }
//           System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//         sum1(n);
//     }
// }


import java.io.*;
import java.util.*;
public class Q
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        String input1 = sc.next().toUpperCase();
        String input2 = sc.next().toUpperCase();
       
        StringJoiner sj = new StringJoiner(":");
    
           String[] w = input2.split(":");
       boolean flag = true;
               for(int i=0; i<w.length; i++)
               {
                   flag = true;
                   if(input1.length()!=w[i].length())continue;
                   for(int j = 0; j< w[i].length(); j++)
                   {
                           if(input1.charAt(j) == '_')
                               continue;
                       if(input1.charAt(j)!= w[i].charAt(j)){
                           flag = false;
                       }
                   }  
           if(flag) sj.add(w[i]);
               }  
           System.out.println(sj);

        }

}





// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
public static void arrayFind(int arr[]){
    ArrayList<Integer>even = new ArrayList<>();
    ArrayList<Integer>odd = new ArrayList<>();
    int j=0;
    int k=0;
    for(int i=0; i<arr.length; i++){
        if(i%2 == 0){
            even.add(arr[i]); 
            j++;
        }
        else {
            odd.add(arr[i]);
            k++;
        }
    }
    Collections.sort(even);
    Collections.sort(odd);
    int size = even.size();
    int secLarg = even.get(size-2);
    int small = odd.get(1);
    int sum = secLarg + small;
    System.out.print(sum);
}
    public static void main(String[] args) {
      int arr[] = {3,2,1,7,5,4};
      arrayFind(arr);
    }
}


