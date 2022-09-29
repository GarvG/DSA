package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_indicies {
    public static void main(String[] args) {

        // arr of 5 length
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number the length of array to be inserted");
        int len=sc.nextInt();
        int [] arr= new int[len];
        System.out.println("Enter numbers uptil: "+len);
        for(int i=0;i<len;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("index to swap");
        int first= sc.nextInt();
        int second= sc.nextInt();
        swap(arr,first,second);


    }
   static void swap(int []arr,int first,int second )
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        System.out.println(Arrays.toString(arr));
    }

}
