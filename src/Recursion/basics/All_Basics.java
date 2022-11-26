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
//        System.out.println("---------------------------q4 ends-------------------");
//        System.out.println(Sumofdigits(n));
//        System.out.println("---------------------------q5 ends-------------------");
//        System.out.println(Productsofdigits(n));
//        System.out.println("---------------------------q6 ends-------------------");
//        System.out.println(Reverse(n));
//        System.out.println("---------------------------q7 ends-------------------");
        System.out.println(CountZeros(n));
        System.out.println("---------------------------q8 ends-------------------");

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

        static int Reverse(int n)
        {
            int digits=(int)(Math.log10(n))+1;
           return Reversehelper(n,digits);
        }
    static int Reversehelper(int n,int count)
    {
        if(n/10==0)
        {
            return n;
        }
        int rem=n%10;

        return rem*(int)(Math.pow(10,count-1))+Reversehelper(n/10,count-1);
    }

    static int CountZeros(int n)
    {
        int count=0;
        if(n/10==0)
        {
            if(n==0)
            {
                return count++;
            }
            else
            {
                return 0;
            }
        }
        if(n%10==0)
        {
            count++;
        }
        int ans=CountZeros(n/10);
        return ans+count;
    }




}
