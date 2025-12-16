package interviewGuide;

import java.util.HashSet;
import java.util.Iterator;

public class sets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple"); // Duplicate entry
        System.out.println(set); // Output will show unique elements only
       /* for (String fruit : set) {
            System.out.println(fruit);
        }*/
      Iterator<String> set1= set.iterator();
        while(set1.hasNext())
        {
            System.out.println(set1.next());
        }
    }
}
