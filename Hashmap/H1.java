// package Hashmap;
import java.util.*;
// import java.util.HashMap;

public class H1 {
    
    public static int maps(ArrayList<Integer> arr){
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i=0; i<arr.size(); i++ ){
                // map.get(arr.get(i))++;
                map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
            }
            int mx = -1;
            int val=0;
            for(int i=0; i<arr.size(); i++){
                if(map.get(arr.get(i))>mx){
                    mx = map.get(arr.get(i));
                    val = arr.get(i); 
                }
            }
            return val;
        }
        public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(5);
        System.out.println(maps(arr));
    }
}





/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static int count(List<Integer> v) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < v.size(); i++) {
            m.put(v.get(i), m.getOrDefault(v.get(i), 0) + 1);
        }
        int mx = -1;
        int val = 0;
        for (int i = 0; i < v.size(); i++) {
            if (mx < m.get(v.get(i))) {
                mx = m.get(v.get(i));
                val = v.get(i);
            }
        }
        return val;
    }

    public static void main(String[] args) {
        List<Integer> v = new ArrayList<>();
        v.add(2);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(3);
        v.add(2);
        v.add(5);
        System.out.println(count(v));
    }
} */