package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={4,5,1,2,3};
        sort(arr);
    }
    static void sort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int max=0;
            //int lastelement= arr.length-i-1;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[max]<arr[j])
                {
                    max=j;
                }

            }
            int temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[max];
            arr[max]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }

}
