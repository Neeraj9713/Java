
abstract class Animal{
    void eat(){
        System.out.println("Animal");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chiken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class oops7_AbstractClass{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chiken c = new Chiken();
        c.eat();
        c.walk();
    }
}


// public class oops7_AbstractClass{
//     public static void main(String[] args) {
//         Horse h = new Horse();
//         System.out.println(h.color);
//     }    
// }                   

// abstract class Animal{
//     String color;
//     Animal(){
//         color = "Brown";
//     }
    
// }

// class Horse extends Animal{
//     void changeColor(){
//         color = "dark brown";
//     }
// }

// class Chiken extends Animal{
//     void colorChange(){
//         color = "yellow";
//     }
// }



//                                         // Herrarical constructor
// public class oops7_AbstractClass{
//     public static void main(String[] args) {
//       Chiken ch = new Chiken();
//     }    
// }                   

// abstract class Animal{
//     String color;
//     Animal(){
//         System.out.println("Animal constructor...");
//     }
    
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor...");
//     }
//     void changeColor(){
//         color = "dark brown";
//     }
// }

// class Chiken extends Horse{
//     Chiken(){
//         System.out.println("Chiken constructor...");
//     }
//     void colorChange(){
//         color = "yellow";
//     }
// }



