// package ArrayList;

import java.util.ArrayList;
public class A4Set {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        list.set(1, 33);
        System.out.println(list);
    }
}
