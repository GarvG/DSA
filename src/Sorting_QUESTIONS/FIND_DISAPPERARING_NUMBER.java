package Sorting_QUESTIONS;

import java.util.ArrayList;
import java.util.Arrays;

public class FIND_DISAPPERARING_NUMBER {
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        int []arr={4,3,2,7,8,2,3,1};
        ans=disappear(arr);
        System.out.println(ans);
    }
    static ArrayList<Integer> disappear(int []arr)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int n=arr.length;
        while(i<n)
        {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                int temp=arr[correctIndex];
                arr[correctIndex]=arr[i];
                arr[i]=temp;
            }
            else
            {
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<n;j++)
        {
            if(j!=arr[j]-1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }

}
