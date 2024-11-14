
// package HashSet;
import java.util.HashSet;
public class Hashset {
    
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(4);
        hs.add(2);

        hs.remove(2);
        System.out.println( hs.isEmpty());
        System.out.println(hs.contains(1));
        System.out.println(hs);
    }
}