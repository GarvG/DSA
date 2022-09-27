package Loops_conditionals;

import java.util.Scanner;

public class L_Happy_Number {
    public static void main(String[] args) {
        int num=19;
        int temp=num;
        int sum=0;
        while(temp>0)
        {
            int rem=temp%10;
            sum=sum+rem*rem;
            temp=temp/10;
            System.out.println(sum);
            if(sum==1)
            {
                System.out.println("H_N");
            }
            if(temp==0)
            {
             temp=sum;
            }
        }
    }
}
