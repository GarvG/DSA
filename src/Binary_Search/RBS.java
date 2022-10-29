package Binary_Search;
public class RBS {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        System.out.println(pivot(arr));
    }
    static int search(int[]nums,int target)
    {
        int pivot=pivot(nums);
      if(pivot==-1)
      {
          return Search(nums,target,0,nums.length-1);
      }
      if(nums[pivot]==target)
      {
          return target;
      }
    if(target>=nums[0])
    {
        return Search(nums,target,0,pivot-1);
    }
    else{
        return Search(nums,target,pivot+1, nums.length-1);
    }
    }
    static int Search(int [] arr,int target,int start,int end)
    {
        int len=arr.length;

        while(start<=end)
        {
            //  int middle=(start+end)/2;
            int middle=start+(end-start)/2;
            if(arr[middle]==target)
            {
                return middle;
            }
            if(target>arr[middle])
            {
                start=middle+1;
            }
            else{
                end=middle-1;
            }

        }
        return -1;
    }
    static int pivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }


}
