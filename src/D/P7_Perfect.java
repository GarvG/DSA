package D;

import java.util.Scanner;

public class P7_Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
        if(sum==n)
        {
            System.out.println("P");
        }
        else{
            System.out.println("N");
        }
    }
}
