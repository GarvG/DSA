package Loops_conditionals;

import java.util.Scanner;

public class Q4_occurence_in_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0)
        {
            int n=num%10;
            if(n==9)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
