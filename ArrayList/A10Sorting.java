import java.util.ArrayList;
import java.util.Collections;
public class A10Sorting {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(6);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);  //ascending order

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}


https://youtu.be/Tnfs0MZsBBE