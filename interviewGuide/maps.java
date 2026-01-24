package interviewGuide;

import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        for(HashMap.Entry<Integer,String> e : map.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }
}
