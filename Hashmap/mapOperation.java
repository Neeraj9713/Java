
import java.util.HashMap;
public class mapOperation {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Noodles" , 1);
        map.put("Dosa", 2);
        map.put("manchuriyan", 3);
        map.put("Rice", 4);
        System.out.println(map);
     
        // get
        System.out.println(map.get("Rice"));

        // remove
        map.remove("Noodles");
        System.out.println(map);

        // isEmpty
        System.out.println(map.isEmpty());

        //contains
        System.out.println(map.containsKey("Dosa"));

        // remove all
        map.clear();
        System.out.println(map);

        // Size
        System.out.println(map.size());

    }
}
