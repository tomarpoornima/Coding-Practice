package binarysearch_practice;

public class GuessNumber {
    public static int guess(int num){
        if(num > 0){
            return -1;
        }else if(num < 0){
            return 1;
        }else {
            return 0;
        }
    }

    public static int guessNumber(int n){
        int l = 1, r = n;

        while(l <= r){
           int mid = l +(r - l)/2;
           int res = guess(mid);
            if(res == 0){
                return mid;
            }
            if(res > 0){
                l = mid +1;
            }else{
                r = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(guessNumber(n));
    }
}
