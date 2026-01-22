package interviewGuide;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collections {
    public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
System.out.println(list);

Iterator<Integer> l = list.iterator();
while(l.hasNext())
{
    System.out.println(l.next());
}

    }
}
