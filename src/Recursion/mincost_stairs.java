package Recursion;

public class mincost_stairs {
    public static void main(String[] args) {
        int []cost={-6,-10,-5,-15,-20,-7,-16};
        int n= cost.length;
        System.out.println(min(0,cost,n,-6));
    }
    static int min(int i,int [] arr,int target,int ic)
    {
        int cost;
        if(i==target)
        {
            return ic;
        }
        if(i<target-2)
        {
            if(arr[i+1]<arr[i+2])
            {
                min(i+1,arr,target-1,ic+arr[i+1]);
            }
            else
            {
                min(i+2,arr,target-2,ic+arr[i+2]);
            }
        }
        if(i==target-1)
        {
            min(i+1,arr,target-1,ic+arr[i+1]);
        }
        return ic;
    }

}
