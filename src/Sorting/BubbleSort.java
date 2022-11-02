package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={3,1,5,4,2};
        bubbleSort(arr);
    }
    static void bubbleSort(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j< arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
