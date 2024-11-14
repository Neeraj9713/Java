import java.util.*;
public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
        map.put("Noodles" , 1);
        map.put("Dosa" , 2);
        map.put("Burger", 3);
        map.put("Friench", 4);

        System.out.println(map);
    }
}