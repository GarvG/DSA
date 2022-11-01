package Random_Questions;

public class ceiil {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,7,8,11,15,17};
        int target=13;
        System.out.println(ciel(arr,target));
    }
    static int ciel(int []arr, int target)
    {
        int ans=0;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                ans=arr[mid];
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return ans;
    }
}
