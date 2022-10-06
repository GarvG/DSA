package Binary_Search;

public class Ceiling_of_number {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int ceilig=15;
      int ans=  CeilingSeach(arr,ceilig);
        System.out.println(ans);
    }
    static int CeilingSeach(int []arr,int ceiling)
    {
        int len= arr.length;
        int start=0;
        int end=len-1;
        while(start<=end)
        {
            int middle=start+(end-start)/2;
            System.out.println(middle);
            if(arr[middle]==ceiling)
            {
                return ceiling;
            }
            else if(arr[middle]>ceiling)
            {
                end=middle-1;
            }
            else
            {
                start=middle+1;
            }
            System.out.println(start);
        }
        return arr[start];
    }
}
