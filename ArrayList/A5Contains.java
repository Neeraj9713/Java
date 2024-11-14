// package ArrayList;

import java.util.ArrayList;
public class A5Contains {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        System.out.println(list.contains(2));
        System.out.println(list.contains(11));     
    }
}
