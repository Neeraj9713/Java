// package ArrayList;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class A01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
    //    list.add(5);
    //    System.out.println(list);

    //    // Get operation      O(1)   <- time complexity
    //    int n =list.get(2);
    //    System.out.println(n);
       
       // Remove operation
    //    list.remove(3);
    //    System.out.println(list);
       

    //    //set 
    //    list.set(2,10);
    //    System.out.println(list);


    //    //contains
    //    System.out.println(list.contains(2));
    //    System.out.println(list.contains(11));

       ArrayList<Integer> list1 = new ArrayList<>();
       list1.add(25);
       list1.add(300);
       list1.add(4);
       list1.add(50);
       list1.add(60);
    //    list1.clear();
        // list1.remove(2);
        list1.iterator();
        // list1.set(0,55);
        System.out.println(list1);
    //    System.out.println(list1.contains(55));
        // System.out.println( list.size());
        // System.out.println(list1);
        // System.out.println(list1.get(0));
    }
}
    