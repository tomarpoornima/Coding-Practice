package array_practice;

import java.util.Scanner;

public class Demo {
    public static void main(String args[])
    {

        System.out.println("Enter limit:");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int count;
        for(int i=3;i!=n;i++)
        {
            count=0;

            for(int j=2;j<=(i-1)/2;j++)
            {
                if((i-1)%j==0)
                {
                    count++;
                    break;
                }
            }
            for(int j=2;j<=(i+1)/2;j++)
            {
                if((i+1)%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {

                System.out.println(i);
            }
        }

    }
}
