package Binary_Search;

public class FINDING_PIVOT_IN_ROTATED_ARRAY {
    public static void main(String[] args) {
        int[]arr={3,2};
        int ans=findPivot(arr);
        System.out.println(ans);
    }
    static int findPivot(int[] arr)
    {
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev=(mid-1+n)%n;
            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next])
            {
                return mid;
            }

            else if(arr[mid]>=arr[start])
            {
                start=mid+1;
            }
            else if(arr[mid]<=arr[end])
            {
                end=mid-1;
            }
        }
        return 0;
    }
}
