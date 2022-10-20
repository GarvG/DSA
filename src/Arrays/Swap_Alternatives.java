package Arrays;

import java.util.Arrays;

public class Swap_Alternatives {
    public static void main(String[] args) {
        int []arr={1,2,4,6,7,13,123};
        Swap(arr);
    }
    static void Swap(int [] arr)
    {
        int i=0;
        //int j=1;
        while(i< arr.length-1)
        {
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            i+=2;
           // j++;
        }
        System.out.println(Arrays.toString(arr));
    }

}
