
// //Single level inheritance
// public class oops4_inheritance {
//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }

// //Base class 
// class Animal{
//     String color;
    
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// //Derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swim in water");
//     }
// }

// // multilevel inheritance
// public class oops5_typesOfInheritance{
//     public static void main(String[] args) {
//         Dog dobby = new Dog();        
//         dobby.eat();
//         dobby.legs = 4;
//        System.out.println(dobby.legs);
//     }
// }

// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breadth(){
//         System.out.println("breadths");
//     }
// }

// class mammal extends Animal{
//     int legs;
// }

// class Dog extends mammal{
//     String breed;
// }


//Hierarchical inheritance
public class oops5_typesOfInheritance{
    public static void main(String[] args) {
        Mammal call = new Mammal();
        call.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breadth(){
        System.out.println("breadth");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
