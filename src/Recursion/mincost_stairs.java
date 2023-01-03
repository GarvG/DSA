package Recursion;

public class mincost_stairs {
    public static void main(String[] args) {
        int []cost={6,10,5,15,20,7,16};
        int n= cost.length;
        System.out.println();
        min(0,cost,n-1,6);
    }
    static void min(int i,int [] arr,int target,int ic)
    {
        int cost;
        if(i==target)
        {
            System.out.println(ic);
            return;
        }
        if(i<=target-2)
        {
            if(arr[i+1]<arr[i+2])
            {
                ic=ic+arr[i+1];
                min(i+1,arr,target,ic);
            }
            else
            {
                ic=ic+arr[i+2];
                min(i+2,arr,target,ic);
            }
        }
        if(i==target-1)
        {
            min(i+1,arr,target,ic+arr[i+1]);
        }
       // return ic;
    }

}
