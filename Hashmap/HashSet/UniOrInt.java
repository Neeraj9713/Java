// package HashSet;
import java.util.*;
public class UniOrInt {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<arr1.length; i++){
        //     map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
        // }
        // for(int i=0; i<arr2.length; i++){
        //     map.put(arr2[i], map.getOrDefault(arr2[i],0)+1);
        // }
        // int count = 0;
        // for(Integer i : map.keySet()){
        //     if(map.get(i)>1){
        //         count++;
        //     }
        // }
        // System.out.println("Union="+map.size());
        // System.out.println("InterSection=" + count);

        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            map.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            map.add(arr2[i]);
        }
        //Union
        System.out.println("Union="+map.size());
        for(Integer i : map){
            System.out.print(i+" ");
        }
        System.out.println();

        // InterSection
        map.clear();
        for(int i=0; i<arr1.length; i++){
            map.add(arr1[i]);
        }
        
        int count =0;
        for(int i=0; i<arr2.length; i++){
            if(map.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
                map.remove(arr2[i]);
            }
        }
        System.out.println();
        System.out.print("InterSection=" + count);
    }
}
