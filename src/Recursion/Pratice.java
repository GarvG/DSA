package Recursion;

import java.util.Scanner;

public class Pratice {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
        Recursion(n);
    }
    static void Recursion(int n)
    {
        if(n==0)
        {
            return;
        }
        Recursion(n-1);
        System.out.println(n);
    }
}
