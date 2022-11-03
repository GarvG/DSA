package Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int []arr={3,5,2,1,4};
        cyclic(arr);
    }
    static void cyclic(int []arr)
    {
        //int index=value-1;
        for(int i=0;i< arr.length;i++)
        {
            int value=arr[i];
            if(value!=i+1)
            {
                int temp=arr[i];
                arr[i]=arr[value];
                arr[value]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
