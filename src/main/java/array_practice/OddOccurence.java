package array_practice;

import java.util.HashMap;

public class OddOccurence {

    //time - O(n^2), space - O(1)
    public static int getOddOccurence(int[] arr, int n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count%2 !=0 ){
                return arr[i];
            }
        }
        return -1;
    }
    //time - O(n), space - O(n)
    public static int getOddOccurenceHashMap(int[] arr, int n){
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0; i<n; i++){
            if(hmap.containsKey(arr[i])){
                int val = hmap.get(arr[i]);
                hmap.put(arr[i], val+1);
            }else{
                hmap.put(arr[i], 1);
            }
        }
        for(Integer a : hmap.keySet()){
            if(hmap.get(a)%2 != 0){
                return a;
            }
        }
        return -1;
    }
    //time -O(n), space - O(1)
    public static int getOddOccurenceXOR(int[] arr, int n){
        int res = 0;
        for(int i=0; i<n; i++){
            res = res ^ arr[i];
        }
        return res;
    }

}

//https://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/