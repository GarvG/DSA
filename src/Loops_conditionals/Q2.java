package Loops_conditionals;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        if(ch>='a'&& ch<='z')
        {
            System.out.println("LOWER");
        }
        else
            System.out.println("UPPER");

    }
}
// CHECKING IF THE CHAR IS LOWER OR UPPER

