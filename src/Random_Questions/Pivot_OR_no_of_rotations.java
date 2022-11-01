package Random_Questions;

public class Pivot_OR_no_of_rotations{
    public static void main(String[] args) {
        int arr[]={11,12,15,18,2,5,6,8};
        int ans=PorRot(arr);
        System.out.println(ans);
    }
    static int PorRot(int []arr)
    {
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi)
        {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<arr[hi])
            {
                hi=mid;
            }
            else {
                lo=mid+1;
            }
        }
        //return arr[hi]; // for finding the pivot element
        return hi; // for finding the number of rotations
        // index of the minimum element is the number of rotations
    }

}
