package Linear_Search;

import java.util.Scanner;
// Search for a number in range
public class Search_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number the length of array to be inserted");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter numbers uptil: " + len);
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER THE NUMBER TO SEARCH");
        int search = sc.nextInt();
        System.out.println("Enter the Range!!");
        int start = sc.nextInt();
        int end = sc.nextInt();
       Boolean ans= Search(arr, search, start, end);
        System.out.println(ans);
    }

    static Boolean Search(int[] arr, int search, int start, int end)
    {
        if(arr.length==0)
        {
            return false;
        }

        for(int i=start;i<=end;i++)
        {
            if(arr[i]==search)
            {
                return true;
            }
        }
        return false;
    }
}
