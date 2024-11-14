
public class Constructor {

    public void name(){
        System.out.println("I am method");
    }

    Constructor(){
        System.out.println("First constructor");
    }
    Constructor(int a){
        System.out.println("Second constructor");
    }

    public static void main(String[] args) {
        Constructor call = new Constructor();
        Constructor call1 = new Constructor(1);
        call1.name();
    }
}
