
public class oops10_Super_class {

    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
    
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor...");
    }
    
}

class Horse extends Animal{
   String color = "YELLOW";
    Horse(){
        super();
        super.color = "Brown";
        System.out.println("Horse constructor...");
    }
}