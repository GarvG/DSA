package Binary_Search;

public class PIVOT {
    public static void main(String[] args) {
        int[]arr={10,12,13,-3,-1,0,4,7,8,9};
        int ans=pivot(arr);
        System.out.println(ans);
    }
    static int pivot(int []arr)
    {
    int start=0;
    int end= arr.length-1;

    while(start<end)
    {
        int mid=start+(end-start)/2;
        if(arr[mid]<arr[end])
        {
            end=mid;
        }
        else
        {
            start=mid+1;
        }
    }
    return start;
    }
}
