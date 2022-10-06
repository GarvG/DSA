package Binary_Search;

public class OrderAgnosticBs {
    public static void main(String[] args) {
      //  int []arr={1,2,3,10,13,19,21,25,45,56};
        int []arr={90,82,70,60,54,31,19,10,9,4,1};
        int target=19;
        int ans=OrderAgSearch(arr,target);
        System.out.println(ans);
    }
    static int OrderAgSearch(int [] arr,int target){
        int len= arr.length;
        int start=0;
        int end=len-1;

        boolean isAsc=arr[start]< arr[end];
        while(start<=end)
        {
            int middle=start+(end-start)/2;
            if(arr[middle]==target)
            {
                return middle;
            }

            if(isAsc)
            {
                if(arr[middle]>target)
                {
                    end=middle-1;
                }
                else
                {
                    start=middle+1;
                }
            }
            else
            {
                if(arr[middle]>target)
                {
                    start=middle+1;
                }
                else
                {
                    end=middle-1;
                }
            }
        }
        return -1;
    }
}
