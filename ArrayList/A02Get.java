// package ArrayList;
import java.util.ArrayList;
public class A02Get {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList <Boolean> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        int element =list.get(1);
        System.out.println(element);
        System.out.println(list.get(2));

    }
}
