// import java.util.Scanner;
// public class practise {

//     public static void circumference(float r){
//         double circum = 2*(3.14)*r;
//         System.out.println(circum);
//     }


//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         float r = sc.nextFloat();
//         // System.out.println("Your max number is:"+ Math.max(a , b));
//         circumference(r);
//     }
    
// }


// public class practise {
//     public static void main(String[] args){
//         int n=5;y
//         int a=1;
//         do{
//             System.out.println(a);
//             a++;
//         }while(a>1);
//     }
// }


import java.util.*;
public class practise 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number,
        negative=0, positive=0,zero=0;
        char choice;

        do{
            System.out.print("Enter the number:");
             number = sc.nextInt();
             if(number>0){
                positive++;
             }
             else if(number<0){
                negative++;
             }
             else{
                zero++;
             }
            System.out.println("Do you want to continue y/n?");
            choice = sc.next().charAt(0);

        }while(choice=='y'||choice=='Y');

        System.out.println("Positive numbers:"+positive);
        System.out.println("Positive numbers:"+negative);
        System.out.println("Positive numbers:"+zero);
       
    }
}
