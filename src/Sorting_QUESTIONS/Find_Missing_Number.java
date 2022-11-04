package Sorting_QUESTIONS;

import java.util.Arrays;

public class Find_Missing_Number {
    public static void main(String[] args) {
        int []arr={4,0,1,2};
        System.out.println(sort(arr));
    }
    static int sort(int []arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correctIndex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex])
            {
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;

            }
            else
            {
                i++;
            }
        }

        for(int j=0;j< arr.length;j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return arr.length;
        //System.out.println(Arrays.toString(arr));
    }
}
