package Loops_conditionals;

import java.util.Scanner;

public class p5_armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no= sc.nextInt();
        int count=0;
        int temp=no;
        int sum=0;
        int r=0;

        while(temp>0)
        {
            r=temp%10;
            sum=sum+(r*r*r);
            temp=temp/10;
        }
        System.out.println(sum);
        if(sum==no)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
