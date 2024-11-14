
//                         //multiple Inheritance
// interface Harbivore{
//     void true();
// }
// interface Carnivore{
//     void false();
// }
// class Bear implements Harbivore, Carnivore{
//     public void true(){
//         System.out.println("Eats...");
//     }
//     public void false(){
//         System.out.println("rats...");
//     }
// }



interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, down, left, right, diagonal (in all 4 dirns)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}
 
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal (by 1 step)");
    }
}

public class oops8_Interfaces {
    public static void main(String[] args) {
     Queen q = new Queen();
     q.moves();   

    //  Bear h = new Bear();
    //  h.eat();

    }
}