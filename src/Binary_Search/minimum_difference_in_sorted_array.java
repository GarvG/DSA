package Binary_Search;

public class minimum_difference_in_sorted_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,8,10,14};
        int key=15;
        System.out.println(diff(arr,key));

    }
    static int diff(int []arr,int key)
    {
        int ans=0;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<key)
            {
                ans=arr[mid];
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        System.out.println(ans);
        return Math.abs(ans-key);
    }
}
