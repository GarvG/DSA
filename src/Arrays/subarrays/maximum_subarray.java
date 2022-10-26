package Arrays.subarrays;

public class maximum_subarray {
    public static void main(String[] args){
        int[] arr={1,13,-1,2};
        int ans=max_sub(arr);
        System.out.println(ans);
    }
    static int max_sub(int [] arr)
    {
        int Bmax=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i;j< arr.length;j++)
            {
                int max=0;
                for(int k=i;k<=j;k++)
                {
                    max=max+arr[k];
                }
                Bmax=Math.max(Bmax,max);
            }
        }
        return Bmax;
    }

}
