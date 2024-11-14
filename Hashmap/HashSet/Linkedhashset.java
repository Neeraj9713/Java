// package HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> map = new LinkedHashSet<>();
        map.add("Raju");
        map.add("Arjun");
        map.add("Shivi");
        map.add("Rivan");

        System.out.println(map);
        map.remove("Arjun");
        for(String s : map){
            System.out.println(s);
        }
    }
}
