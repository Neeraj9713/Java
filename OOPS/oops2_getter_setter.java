// public class oops2_getter_setter {
//     public static void main(String[] args) {

//         Pen p1 = new Pen();
//         p1.setColor("blue");
//         System.out.println(p1.getColor());
        
//         p1.setTip(5);
//         System.out.println(p1.getTip());

//         Test t1 = new Test();

//     }
// }

// class Pen{
//     private String color;
//     private int tip;

//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
    

//     void setColor(String newColor){
//         this.color = newColor;
//     }

//     void setTip(int newTip){
//         this.tip = newTip;
//     }
// }

// import javax.sound.sampled.SourceDataLine;

class A{
    int a = 10;
    public void m1(){
        System.out.println("Hello");
    }
}

class B extends A{
    public void m1(){
        System.out.println("Neer");
    }
    
    public void m2(){
        m1();
        this.m1();
        
        System.out.println(this.a);
        System.out.println(a);
    }
}

public class oops2_getter_setter{
    public static void main(String[] args) {
        B rn = new B();
     rn.m1();   
    }

}