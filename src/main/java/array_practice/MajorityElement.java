package array_practice;

import java.util.HashMap;

public class MajorityElement {
    public static int findMajority(int[] arr, int n){

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i])+1);
            }else {
                freq.put(arr[i], 1);
            }
        }
        int max = n/2;
        for(Integer ele : freq.keySet()){
            Integer max_count = freq.get(ele);
            if(max_count > max){
                max = max_count;
                return ele;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 1,1 };
        int[] arre = null;
        int[] des = {};
        int n = arr.length;

        System.out.println(findMajority(arr, n));
    }
}
