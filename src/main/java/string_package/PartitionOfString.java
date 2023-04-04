package string_package;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PartitionOfString {

    //tc = O(n), SC = O(26)==O(1)
    public static int partitionString(String s){
        if(s.length()==0){
            return 0;
        }

        int count = 1;
        Set<Character>  hs = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.clear();
                count++;
            }
            hs.add(s.charAt(i));
        }
        return count;
    }
    //tc = O(n), SC = O(26)==O(1)
    public static int partitionString1(String s){
        if(s.length()==0){
            return 0;
        }
        int[] seenChar = new int[26];
        Arrays.fill(seenChar, -1);
        int count = 1, substrStart = 0;
        for(int i=0; i<s.length(); i++){
            if(seenChar[s.charAt(i) - 'a'] >= substrStart){
                count++;
                substrStart = i;
            }
            seenChar[s.charAt(i) - 'a'] = i;
        }
        return count;
    }

    public static int partitionStringByBit(String s){
        int i=0, ans = 1, flag = 0;
        while(i < s.length()){
            int val = s.charAt(i) - 'a';
            if((flag & (1<< val)) != 0){
                flag = 0;
                ans++;
            }
            flag = flag | (1<<val);
            i++;
        }
        return ans;
    }
    public static int partitionStr(String s) {
        if(s.length() == 0){
            return 0;
        }
        int xor = 0;
        int ans = 1;
        for(char c : s.toCharArray()){
            if((xor & (1<<c)) != 0){
                xor = 0;
                ans++;
            }
            xor = xor ^ (1<<c);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "ssssss";
        System.out.println(partitionString(s));
        System.out.println(partitionString1(s));
        System.out.println(partitionStringByBit(s));
        System.out.println(partitionStr(s));
    }
}
