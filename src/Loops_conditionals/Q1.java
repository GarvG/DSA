package Loops_conditionals;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=0;
        max=a;
        if(b>max)
        {
            max=b;
            if(c>max)
            {
                max=c;
                System.out.println("c is the greatest"+c);
            }
            else
            {
                System.out.println("b is the greatest"+b);
            }

        }
        else
        {
            System.out.println("a is the greatest"+a);
        }


    }
}

// GREATEST OF THREE NUMBERS
