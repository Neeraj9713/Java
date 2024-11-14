// Type --->1

// public class oops5_typesOfInheritance {
//     public static int optimizedPower(int a, int n){
//         if(n==0){
//             return 1;
//         }

//         int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
//         //n is odd
//         if(n%2 !=0){
//             halfPowerSq = a*halfPowerSq;
//         }
//         return halfPowerSq;
//     }
//     public static void main(String[] args) {
//         int a = 2;
//         int n = 5;
//         System.out.println(optimizedPower(a, n));
//     }
    
// }

// // Type --->2
// public class oops5_typesOfInheritance {
//     public static int optimizedPower(int a, int n){
//         if(n==0){
//             return 1;
//         }

//         int halfPower = optimizedPower(a, n/2);
//         int halfPowerSq = halfPower * halfPower;

//         //n is odd
//         if(n % 2 != 0){
//             halfPowerSq = a * halfPowerSq;
//         }
//         return halfPowerSq;
//     }
//     public static void main(String[] args) {
//         int a = 2;
//         int n = 5;
//         System.out.println(optimizedPower(a, n));
//     }
// }

// class A{
//     void show(int a)
//     {
//         System.out.println("Hello namandeep");
//     }
    

// }
// class B extends A
// {
//     void show()
//     {
//         System.out.println("Hello neeraj");
//     }
// }
// class C extends B{
//     void show()
//     {
//         System.out.println("Hello mayur");
//     }
// }

// public class oops4_inheritance{
//     public static void main(String[] args) {
//         A obj =new B();
//         obj.show(100);
       
//     }
// }

import javax.sound.sampled.SourceDataLine;
import java.lang.*;
class mythread implements Runnable{
    public void run(){
        System.out.println("I am threat");
    }
}
class mythread2 implements Runnable{
    public void run(){
        System.out.println("i am don");
    }
}
public class oops4_inheritance{
    public static void main(String[] args) {
        mythread m1 = new mythread();
        Thread t = new Thread(m1);
        mythread2 m2 = new mythread2();
        Thread t2 = new Thread(m2);
        for(int i=0; i<10; i++){

            t.start();
            t2.start();
        }
    }
}


