package Unit3;

import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("one");
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        System.out.println(lhs);
    }
}
/*Oppa Gangnam Style*/