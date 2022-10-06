package Binary_Search;

public class Floor_of_number {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,9,14,19,25};
        int floor=6;
       int ans= floorSearch(arr,floor);
        System.out.println("floor of the given number "+floor+" is " +ans);
    }

    static int floorSearch(int []arr,int floor)
    {
        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid==floor)
            {
                return arr[mid];
            }
            else if(arr[mid]<floor)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

        }
        return arr[end];
    }

}
