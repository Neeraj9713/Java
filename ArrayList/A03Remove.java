// package ArrayList;

import java.util.ArrayList;
public class A03Remove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println(list);
        list.remove(1);                           //Index remove 
        System.out.println(list);
    }
}
