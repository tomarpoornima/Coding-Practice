import com.google.common.primitives.Ints;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class TwoGame {


    public static void main(String[] args) {
        System.out.println("j"+"a"+"v"+"a"); //java
        System.out.println('j'+'a'+'v'+'a'); // 418



        /*Integer number_1 = 50;
        Integer number_2 = 50;
        Integer number_3 = 150;
        Integer number_4 = 150;

        if(number_1 == number_2)
            System.out.println("Number 1 and Number 2 are Equal");
        else
            System.out.println("Number 1 and Number 2 are not Equal");

        if(number_3 == number_4)
            System.out.println("Number 3 and Number 4 are Equal");
        else
            System.out.println("Number 3 and Number 4 are not Equal");
*/
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);

        //System.out.println(Integer.MAX_VALUE+1);

        //System.out.println(parseInt("123Hello"));
        //System.out.println(parseInt("Hello123"));

        int[] arr = {1,2,3,4,5};
        //apache common lang method
        Integer[] a = ArrayUtils.toObject(arr);
        List<Integer> ans = Arrays.asList(a);
        System.out.println(Collections.min(ans));
        System.out.println(Collections.max(ans));

        //stream api to convert primitive array to list
        List<Integer> input = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> input1 = IntStream.of(arr).boxed().collect(Collectors.toList());

        int maxNum = IntStream.range(0, arr.length).map(i -> arr[i]).max().getAsInt();
        System.out.println(maxNum);

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(min+" "+max);

        //guava mibrary
        List<Integer> output = Ints.asList(arr);

    }


}
