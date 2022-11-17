package Recursion;

import java.util.Scanner;

public class first_index_array {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.print(firstIndex(arr,0,x));

    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length)
        {
            return -1;
        }
        if(arr[idx]==x)
        {
            return idx;
        }
        else
        {
            int fis=firstIndex(arr,idx+1,x);
            return fis;
        }





//        int fdx=firstIndex(arr,idx+1,x);
//        if(arr[idx]==x)
//        {
//            return idx;
//        }
//        else
//        {
//            return fdx;
//        }
//



    }

}

