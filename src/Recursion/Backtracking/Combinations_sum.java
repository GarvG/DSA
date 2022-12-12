package Recursion.Backtracking;

import java.util.ArrayList;

public class Combinations_sum {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        int arr[]={2,3,6,7};
        System.out.println();
        sum(arr,al,0,7);
    }
    static void sum(int []arr,ArrayList<Integer> al,int idx,int target)
    {

        if(idx==arr.length)
        {
            if(target==0)
            {
                System.out.println(al);
            }
            return;
        }
        if(arr[idx]<=target)
        {
            al.add(arr[idx]);
            sum(arr,al,idx,target-arr[idx]);
            al.remove(al.size()-1);
        }

        sum(arr,al,idx+1,target);



    }
}
