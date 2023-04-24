package array_practice;

public class ArrayDemoProblems {
    public static void multiplicationOfNine(int n){
        for(int i=1; i<=n; i++){
            if(n%9==0){
                System.out.println(n);
            }
        }
    }

    //tc-O(N)
    public static void isPrime(int n){
        int x, y, flag;
        for(x=1; x<=n; x++){
            if( x==0 || x==1){
                continue;
            }
            flag = 1;
            for(y=2; y<= x/2; y++){
                if(x%y == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(x+" ");
            }
        }
    }
    public static void isPrime2(int n){
        int count;
        for (int i = 2; i <= n; i++){
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void isPrime3(int n){
        int x, y, flag;
        for (x=2; x<=n; x++){
            flag=1;
            for (y=2; y*y<=x; y++){
                if(x%y == 0){
                    flag=0;
                    break;
                }
            }
            if (flag==1){
                System.out.print(x+" ");
            }
        }
    }

    public static int[] sumOfEvenOdd(int[] arr){
        int even=0, odd=0;
        for (int i=0; i<arr.length; i++){
            if(i%2==0)
                even+=arr[i];
            else
                odd+=arr[i];
        }
        return new int[]{even,odd};
    }
    public static void printPattern(int n){
        for (int i=1; i<=n; i++){
            System.out.print(" "+((i%2==0)? (i-1):(i+1)));
        }
    }
    public static void printSeries(int n, int a, int b, int c){
        int d;
        if(n==1){
            System.out.print(a+" ");
        }
        if(n==2){
            System.out.print(a+" "+b+" ");
        }
        System.out.print(a+" "+b+" "+c+" ");
        for (int i=4; i<=n; i++){
            d = a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
    }
    public static void main(String[] args) {
        int n = 20;
        isPrime(n);
        System.out.println();
        isPrime2(n);
        System.out.println();
        isPrime3(n);
        System.out.println();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int[] ans = sumOfEvenOdd(arr);
        for (int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
        printPattern(n);
        System.out.println();
        printSeries(7,1,3,4);
    }
}
