
import java.util.*;

public class Treehash {
    public static void main(String[] args) {
        TreeMap<String , Integer> map = new TreeMap<>();
        map.put("Neeraj" , 11);
        map.put("Raju" , 2);
        map.put("Shree" , 3);
        map.put("Karan" , 4);
        System.out.println(map);

        // System.out.println(map.get("Shree"));

        // System.out.println(map.values());
        // System.out.println(map.entrySet());
        // System.out.println(map.keySet());
        // System.out.println(map.ceilingEntry("Neeraj"));
        // System.out.println(map.containsValue(2));


        Set <String> key = map.keySet();
        for(String s : key){
            System.out.println(s);
        }
    }    
}

