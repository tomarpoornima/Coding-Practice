package stream_api;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //filter method
        List<Integer>  list = Arrays.asList(10,15,8,49,98,32);
        list.stream().filter(n -> n%2 ==0).forEach(System.out::println);
        System.out.println();

        //flatMap() method
        List<Integer> evens = Arrays.asList(2,4,6);
        List<Integer> odds = Arrays.asList(3,5,7);
        List<Integer> primes = Arrays.asList(2,3,5,7,11);
        List<Integer> numbers = Stream.of(evens,odds,primes)
                .flatMap(list1 -> list1.stream())
                .collect(Collectors.toList());
        System.out.println("Flattened list: "+ numbers);
        System.out.println();
        List<List<String>> names1 = Arrays.asList(Arrays.asList("Saket", "Trevor"), Arrays.asList("John","Michale"),
                Arrays.asList("Shawn", "Franklin"), Arrays.asList("Jonty", "Sean"));
        List<String> start = names1.stream().flatMap(FirstName -> FirstName.stream()).filter(s -> s.startsWith("S")).collect(Collectors.toList());
        start.forEach(System.out::println);
        System.out.println();

        //map() method
        List<String> names = Arrays.asList("Saket", "Trevor", "Franklin", "Poornima");
        List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperCase.forEach(System.out::println);
        System.out.println();

        //array to stream conversion
        String[] langauages = {"Java", "Python", "Javascript"};
        Stream num = Stream.of(langauages);
        num.forEach(System.out::println);

        //parallel stream
        List<String> mylist = Arrays.asList("a","b","c","d","e","f","g","h");
        mylist.stream().parallel().peek(t -> {
            System.out.println("Before");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).forEachOrdered(System.out::println);
    }
}
