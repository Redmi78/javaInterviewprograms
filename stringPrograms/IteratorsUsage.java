package stringPrograms;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorsUsage {
    public static void main(String[] args) {
List<String> list = new ArrayList<>();
list.add("Hello");
list.add("test user");
/*Iterator<String> ls = list.iterator();
while(ls.hasNext())
{
    System.out.println(ls.next());
}*/


       // ListIterator<String> li = list.listIterator();
        ListIterator<String> li = list.listIterator(list.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }

}