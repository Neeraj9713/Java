// public class oops6_polymorphism {
//     public static void main(String[] args){
//         Calculator call = new Calculator();
//         System.out.println(call.sum(2, 5));
//         System.out.println(call.sum((float)2.5, (float)5.2));
//         System.out.println(call.sum(2, 5 , 6));
//     } 
    
// }

// //Two types of polymorphism...
// // Method overloading
// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float a, float b){
//         return a+b;
//     }

//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }

//Method overriding
public class oops6_polymorphism {
    public static void main(String[] args){
        Deer d = new Deer();
        d.name();
    } 
    
}

class Animal{
    void eat(){
        System.out.println("Eats");
    }
}

class Deer extends Animal{
    void name(){
        System.out.println("Eats grass");
    }
}
