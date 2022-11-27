package Recursion.Arrays;

import java.util.Scanner;

public class All_Array_basics {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int [] arr={1,2,4,8,91,12};
        Sorted(arr,0,6);
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

}
