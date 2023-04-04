package Immutability;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo {
    public static void main(String[] args) {
        Employee e = new Employee("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println(s1);

        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "Second");

        Student s = new Student("ABC", 101, map);
        System.out.println(s.getName());
        System.out.println(s.getRegno());
        System.out.println(s.getMetadata());

        //s.regNo = 102;

        map.put("3", "third");
        System.out.println(s.getMetadata());
        s.getMetadata().put("4", "fourth");
        System.out.println(s.getMetadata());

        final StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        //sb = new StringBuffer("World");
        //System.out.println(sb);


    }
}
