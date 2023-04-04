package Immutability;
import java.util.*;
import com.google.common.collect.ImmutableList;

public class ImmutableListDemo {
    public static <T> void iList(List<T> list){
        //existing list using copyOf() fun
        ImmutableList<T> immutableList = ImmutableList.copyOf(list);
       //new list using of() fun
        ImmutableList<String> immutableList1 = ImmutableList.of("Hi", "Hello", "Bye");
        System.out.println(immutableList1);
        System.out.println(immutableList);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Geeks","For","Geeks"));
        iList(list);
        //java 9 factory method
       // List<String> list1 = List.Of("1","2","3");
       // System.out.println(list1);
    }
}
