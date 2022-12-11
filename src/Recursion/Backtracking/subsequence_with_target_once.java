package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequence_with_target_once {
    public static void main(String[] args) {
        int []arr={1,2,1};
        ArrayList<Integer>al=new ArrayList<>();
        System.out.println(target(arr, al,0,2,0));
    }
    static Boolean target(int []arr,ArrayList<Integer> al,int idx,int targe,int sum)
    {
        if(idx==arr.length)
        {
            if(targe==sum)
            {
                System.out.println(al);
                return true;
            }
          else{
                return false;
            }

        }
        sum+=arr[idx];
        al.add(arr[idx]);
        if(target(arr,al,idx+1,targe,sum)==true)
        {
            return true;
        }
        sum-=arr[idx];
        al.remove(al.size()-1);
        if(target(arr,al,idx+1,targe,sum)==true) return true;
        return false;
    }
}
