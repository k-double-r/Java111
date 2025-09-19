package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(9);
        al.add(19);
        al.add(-9);
        al.add(109);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);
    }
}
