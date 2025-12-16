package Streams;

import java.util.HashSet;
import java.util.Iterator;

public class secondsets {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("testing");
        set.add("user");
        set.add("with");
        set.add("testing"); // Duplicate entry
        System.out.println(set); // Output will show unique elements only
        for (String s : set) {
            System.out.println(s);
        }
        Iterator<String> set1 = set.iterator();
        while (set1.hasNext()) {
            System.out.println(set1.next());

        }
    }
}
