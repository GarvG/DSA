package Random_Questions;

import java.util.Arrays;

public class first_and_last_oocurence {
    public static void main(String[] args) {
        int []arr={2,4,10,10,10,18,20};
        int target=10;
        fandloccur(arr,target);
    }
    static void fandloccur(int []arr,int target)
    {
        int []res={-1,-1};
        int low=0;
        int high= arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>target)
            {
                high=mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;

            }
            else
            {
                res[0]=mid;
                high=mid-1;
            }

        }

       int start=0;
        int end=arr.length-1;
        System.out.println(res[0]);
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                res[1]=mid;
                start=mid+1;
            }

        }
        System.out.println(Arrays.toString(res));
        int Count_occurences=res[1]-res[0]+1;
        System.out.println("THE COUNT OF REPEATED IS "+Count_occurences);
    }

}
