package Binary_Search;

public class minimum_difference_in_sorted_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,8,11,14};
        int key=12;
        System.out.println(diff(arr,key));

    }
    static int diff(int []arr,int key)
    {
        int ansL=0;
        int ansR=0;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<key)
            {
                ansL=arr[mid];
                start=mid+1;
            }
            else if(arr[mid]>key){
                ansR=arr[mid];
                end=mid-1;
            }
            else
            {
                return 0;
            }

        }
        System.out.println(ansL+" "+ansR);
       // return Math.abs(ans-key);
        return Math.min(Math.abs(ansL-key),Math.abs(ansR-key));
    //return -1;
    }
}
