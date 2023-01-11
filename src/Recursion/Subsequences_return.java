package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences_return {
    public static void main(String[] args) {
        int arr[]={1,2,1};


        System.out.println(target(arr));
    }
    public static List<List<Integer>> target(int []arr)
    {
        List<List<Integer>> al=new ArrayList<>();
        targethelper(arr,al,new ArrayList<Integer>(),0,0,2);
        return al;
    }
     static void targethelper(int[]arr,List<List<Integer>>al,ArrayList<Integer>temp,int idx,int sum,int target)
    {
        if(idx==arr.length)
        {
            if(sum==target)
            {
                al.add(new ArrayList<>(temp));

            }
            return;
        }
        temp.add(arr[idx]);
        sum+=arr[idx];
        targethelper(arr,al,temp,idx+1,sum,target);
        temp.remove(temp.size() - 1);
        sum-=arr[idx];
        targethelper(arr,al,temp,idx+1,sum,target);
    }

}
