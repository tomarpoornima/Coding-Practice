package array_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlattenArray {

    public static void main(String[] args) {
            Object[] arr = new Object[]{1,2,  new Object[]{   new Object[]{4,5},    3,4}, new Object[]{5,6,7},8,9};

            Integer[] res = flatten(arr);

            System.out.println(Arrays.toString(res));
    }

    public static Integer[] flatten(Object[] arr){
        List<Integer> ans = flattenRec(arr);
        return ans.toArray(new Integer[]{});
    }

    public static List<Integer> flattenRec(Object[] arr){

        List<Integer> ans = new ArrayList<>();
        if(arr == null){
            return ans;
        }

        for (int i=0; i<arr.length; i++) {

            if (arr[i] instanceof Integer) {
                ans.add((Integer) arr[i]);
            } else if (arr[i] instanceof Object[]) {
                ans.addAll(flattenRec((Object[]) arr[i]));
            }

        }
        return ans;
    }

}
