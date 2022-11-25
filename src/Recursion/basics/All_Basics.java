package Recursion.basics;

import java.util.Scanner;

public class All_Basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number!! ");
        int n=sc.nextInt();

//        Print1toN(n);
//        System.out.println("---------------------------q1 ends-------------------");
//        PrintNto1(n);
//        System.out.println("---------------------------q2 ends-------------------");
//        Print1toNto1(n);
//        System.out.println("---------------------------q3 ends-------------------");
//        System.out.println(Fact(n));

          System.out.println(Sumofdigits(n));
        System.out.println(Productsofdigits(n));
    }
    static void Print1toN(int n)
    {
     if(n==0)
     {
         return;
     }
     Print1toN(n-1);
        System.out.println(n);
    }
    static void PrintNto1(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        PrintNto1(n-1);
    }
    static void Print1toNto1(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        Print1toNto1(n-1);
        System.out.println(n);
    }
    static int Fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int ans=Fact(n-1);
        return n*ans;
    }

    static int Sumofdigits(int n) {
        if(n/10==0)
        {
            return n;
        }
        int faith=Sumofdigits(n/10);
        return faith+n%10;
    }

    static int Productsofdigits(int n)
    {
        if(n/10==0)
        {
            return n;
        }
        int faith=Productsofdigits(n/10);
        return faith*(n%10);
    }




}
