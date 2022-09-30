package Loops_conditionals;

import java.util.Scanner;

public class Count_number_OPTI {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=(int)(Math.log10(num))+1;
        System.out.println(count);
    }
}
