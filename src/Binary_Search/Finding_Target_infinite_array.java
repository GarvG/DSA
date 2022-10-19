package Binary_Search;

public class Finding_Target_infinite_array {
    public static void main(String[] args) {
        // start with box of 2
        int []nums={1,2,4,5,6,8,10,13,15,16,18,19,22,26};
        int target=15;
        int start=0;
        int end=1;
        while (target>nums[end])
        {
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }

        int ans=InfinteArray(nums,target,start,end);
        System.out.println(ans);
    }
    static int InfinteArray(int [] nums,int target,int start,int end)
    {
      while(start<=end)
      {
          int mid=start+(end-start)/2;
          if(nums[mid]>target)
          {
              end=mid-1;
          }
          else if(nums[mid]<target)
          {
              start=mid+1;
          }
          else
          {
              return mid;
          }
      }


     return -1;
    }
}
