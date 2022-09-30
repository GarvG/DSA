package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number the length of array to be inserted");
        int len=sc.nextInt();
        int [] arr= new int[len];
        System.out.println("Enter numbers uptil: "+len);
        for(int i=0;i<len;i++)
        {
            arr[i]= sc.nextInt();
        }
        reverse(arr);
    }
    static  void reverse(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
