package Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        cyclic(arr);
    }
    static void cyclic(int []arr)
    {
        //int index=value-1;
        int i=0;
       while(i<arr.length)
        {
            //int value=arr[i];
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
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
        System.out.println(Arrays.toString(arr));
    }
}
