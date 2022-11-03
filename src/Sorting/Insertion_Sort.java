package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        Insertion(arr);
    }
    static void Insertion(int []arr)
    {
        for(int i=0;i<= arr.length-2;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
