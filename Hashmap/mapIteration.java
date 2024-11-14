
import java.util.HashMap;
import java.util.Set;
// import java.util.*;
public class mapIteration {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(1, "Noodles");
        map.put(2, "Dosa");
        map.put(3, "manchuriyan");
        map.put(4, "Rice");

        // System.out.println(map.keySet());
        // System.out.println(map.entrySet());
        // System.out.println(map.values());

        Set<Integer> key = map.keySet();
        for (Integer i : key) {
            System.out.print(i+" ");
        }
        System.out.println();
        HashMap<String , Integer> map1 = new HashMap<>();
        map1.put("Noodles" , 1);
        map1.put("Dosa", 2);
        map1.put("manchuriyan", 3);
        map1.put("Rice", 4);
        Set<String> key1 = map1.keySet();
        for(String n : key1){
            System.out.println("Key= "+n+" , " +"Value= "+map1.get(n));
        }
        
    }
}
