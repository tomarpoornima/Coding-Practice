package recursion_practice;

public class Print1ToNNumbers {

    public static void print1ToN(int n){
        if(n==0)
            return;

        print1ToN(n-1);
        System.out.print(n+" ");
    }

    public static void printNto1(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printNto1(n-1);
    }

    public static void main(String[] args) {
        int n = 10;

        print1ToN(n);

        System.out.println();

        printNto1(n);
    }
}
