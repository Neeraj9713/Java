public class First {

    public void name(){
        System.out.println("I am method");
    }
    public void name2(int a){
        System.out.println("I am method2");
    }

    public static void main(String[] args) {
        First call = new First();
        call.name();
        call.name2(5);
    }    
}
