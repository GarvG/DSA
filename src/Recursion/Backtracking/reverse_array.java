package Recursion.Backtracking;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
       // System.out.println(twopointer(arr,0,4));
      //  twopointer(arr,0,5); //
        singlepointer(arr,0,6);
    }
    static void twopointer(int[]arr,int start,int end)
    {
        if(start>=end)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        twopointer(arr,start+1,end-1);
    }
    static void singlepointer(int[] arr, int start,int n)
    {
        if(start>=n/2)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp=arr[n-start-1];
        arr[n-start-1]=arr[start];
        arr[start]=temp;
        singlepointer(arr,start+1,n);
    }


}
