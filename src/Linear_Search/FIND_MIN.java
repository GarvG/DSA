package Linear_Search;

import java.util.Scanner;

public class FIND_MIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number the length of array to be inserted");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter numbers uptil: " + len);
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Min(arr);
        System.out.println(ans);
    }

    static int Min(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        return min;
    }
}

