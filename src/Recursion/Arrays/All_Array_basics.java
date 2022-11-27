package Recursion.Arrays;

import java.util.Scanner;

public class All_Array_basics {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int [] arr={1,2,4,4,8,9,12};
        Sorted(arr,0,6);
//        System.out.println("------------Q1 ends----------------");
//
//        System.out.println(Sorted1(arr,0,6));
//        System.out.println("------------Q2 ends----------------");
        System.out.println(FTarget(arr,4,0,6));
        System.out.println("------------Q3 ends----------------");
        System.out.println(LTarget(arr,4,0,6));
        System.out.println("------------Q4 ends----------------");
    }
    static void Sorted(int [] arr ,int start,int end)
    {
        if(start==end-1)
        {
            System.out.println("Sorted");
            return;
        }
        if(start+1<end)
        {
         if(arr[start]<arr[start+1])
         {
             Sorted(arr,start+1,end);
         }
         else{
             System.out.println("Not Sorted");
             return;
         }
        }
        else
        {
            return;
        }
    }

    static Boolean Sorted1(int [] arr,int start,int end)
    {
        Boolean ans = false;
        if(start==end-1)
    {
        return true;
    }
        if(start+1<end)
        {
            if(arr[start]<arr[start+1])
            {
                ans=Sorted1(arr,start+1,end);
            }
            else
            {
                return false;
            }
        }
        return ans;
    }

    static int FTarget(int []arr,int target,int start,int end)
    {
        int ans=-1;
        if(arr[start]==target)
        {
            return start;
        }
        if(start<end-1)
        {
            ans=FTarget(arr,target,start+1,end);
        }
        return ans;
    }

    static int LTarget(int [] arr,int target,int start,int end)
    {
        int ans=0;
        if(start==end-1)
        {
            return -1;
        }
        ans=LTarget(arr,target,start+1,end);
        if(ans==-1)
        {
            if(arr[start]==target)
            {
                return start;
            }
            else
            {
                return -1;
            }

        }
        else
        {
            return ans;
        }
    }

}
