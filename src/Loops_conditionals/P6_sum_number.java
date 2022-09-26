package Loops_conditionals;

import java.util.Scanner;

public class P6_sum_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sum = 0,rem=0;
        while(no>0)
        {
            rem=no%10;
            sum=sum+rem;
            no=no/10;

        }
        System.out.println(sum);
    }
}

