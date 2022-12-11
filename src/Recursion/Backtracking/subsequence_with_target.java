package Recursion.Backtracking;

import java.util.ArrayList;

public class subsequence_with_target {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        ArrayList<Integer> al=new ArrayList<>();
        target(arr,al,0,2,0);
    }
    static void target(int []arr,ArrayList al,int idx,int targe,int sum)
    {
        if(idx==arr.length)
        {
            if(sum==targe)
            {
                System.out.println(al);

            }
            return;
        }

        
        int val=arr[idx];
        al.add(val);
        sum+=val;
        target(arr,al,idx+1,targe,sum);
        al.remove(al.size()-1);
        sum-=val;
        target(arr,al,idx+1,targe,sum);

    }

}
