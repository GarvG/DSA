package Arrays;

import java.util.Scanner;

public class Max_Item {
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
        int Max1=Max(arr);
        System.out.println("MAX FROM ARRAY IS "+ Max1);
    }
    static int Max(int [] arr)
    {
      int temp=arr[0];
      for(int i=1;i<arr.length;i++)
      {
          if(arr[i]>temp)
          {
              temp=arr[i];
          }
      }
      return temp;
    }

}
