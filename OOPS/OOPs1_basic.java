
class Pen{

    String color="Neeraj";
    String type;
    public void write(){
        System.out.println("It is something");
        System.out.println(this.color);
    }
    public void print(){
    System.out.println(this.type);
    }
}

public class OOPs1_basic{
    public static void main(String[] args) {
        
        Pen p1 = new Pen();
        p1.color="white";
        p1.type = "Blue";

        p1.write();
    }
}



// public class OOPs1_basic{
//     public static void main(String[] args) {
        
//         Cooler c1 = new Cooler();
//         c1.coolerinfo();
//         // System.out.println(c1.motor);

//         // c1.coolerinfo(1);
//         c1.coolerinfo(1);
//         // System.out.println(c1.current);
        
//         // c1.motor = "one";
//         // c1.current = 2;
//     }
// }

// class Cooler{
//     String motor="ram";
//     int current;

//     void coolerinfo(){
//         System.out.println(motor);
//         // System.out.println(motor);
//     }
//     void coolerinfo(int current){
//         System.out.println(current);

//     }
// }