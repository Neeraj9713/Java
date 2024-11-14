// package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class iteration {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        map.add("Ram");
        map.add("Sita");
        map.add("Laxman");
        map.add("Bharat");

        // System.out.println(map);
        // Iterator it = map.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String city : map){
            System.out.println(city);
        }
    }
}
