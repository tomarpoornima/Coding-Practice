import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        System.out.println("hello");
        //main();


        List<Integer> list = Arrays.asList(10, 15, 9, 49, 25, 98, 32);
        list.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<Integer> mmyList = Arrays.asList(10, 15, 8, 25, 98);
        mmyList.stream().map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);

        Set<Integer> set = new HashSet<>();
        mmyList.stream().filter(n -> !set.add(n))
                .forEach(System.out::println);

        mmyList.stream().findFirst().ifPresent(System.out::println);

        long count = mmyList.stream().count();
        int max = mmyList.stream().max(Integer::compare)
                .get();

        mmyList.stream().sorted().forEach(System.out::print);
        mmyList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        System.out.println(java.time.LocalDateTime.now());

        List<String> s1 = Arrays.asList("Java", "8");
        List<String> s2 = Arrays.asList("Explained", "through");

        Stream<String> concatStream = Stream.concat(s1.stream(),s2.stream());
        concatStream.forEach(str -> System.out.println(str+ " "));

        List<Integer> iList = Arrays.asList(4,5,6,7,8,1,2,3);
        iList.stream().map(i -> i*i*i).filter(i -> i>50)
                .forEach(System.out::println);



    }

   /* private static boolean isPrime(int num){
        return num > 1
                && IntStream.range(2, num).noneMatch((
                        index -> num % index == 0
                ));
    }
    private static int finaSquareOfMaxOdd(List<Integer> numbers){
        int max = 0;
        for(int i : numbers){
            if(i%2 != 0 && i>3 && i < 11 && i > max){
                max = i;
            }
        }
        return max * max;
    }
    private static int sumIterator(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while(it.hasNext()){
            int num = it.next();
            if(num > 10){
                sum += num;
            }
        }
        return sum;
    }
    private static int sumStream(List<Integer> list){
        return list.stream().filter( i -> i > 10).mapToInt(i -> i).sum();
    }
    Stream<Integer> stream = Stream.of(1,2,3,4);
    Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4,5});

    LongStream is = Arrays.stream(new Long[]{1,2,3});
    IntStream is2 = "abc".chars();

    Stream<Integer> intStream = Stream.of(1,2,3,4);
    List<Integer> intList = intStream.collect(Collectors.toList());
     //System.out.println(intList);

   Stream<Integer> intStream1 = Stream.of(1,2,3,4);
    Map<Integer, Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
    // //System.out.println(intMap);

    Stream<Integer> intStream2 = Stream.of(1,2,3,4);
    Integer[] intArray = intStream2.toArray(Integer[]::new);
    //System.out.println(Arrays.toString(intArray));

    Stream<String> names = Stream.of("aBc", "d", "ef");
    System.out.println(names.map(s -> {
        return s.toUpperCase();
    }).collect(Collectors.toList()));

    Stream<String> names2 = Stream.of("aBc", "d", "ef", "12345");
    List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(reverseSorted);

    Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");

    Stream<List<String>> namesOriginal = Stream.of(
            Arrays.asList("Pankaj"),
            Arrays.asList("David", "Lisa"),
            Arrays.asList("Amit"));
    Stream<String> flatStream = namesOriginal.flatMap(strList -> strList.stream());
    flatStream.forEach(System.out::println);


*/
}
