package Loops_conditionals;

import java.util.Scanner;

public class Q5_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int count=-1;
        int temp=n;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        System.out.println("length"+count);
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            rev= rev+(int) (rem*Math.pow(10,count));
            count--;
        }
        System.out.println(rev);
    }
}
