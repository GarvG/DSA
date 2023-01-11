package Recursion;

public class mincost_stairs {
    public static void main(String[] args) {
        int[] cost = {6, 10, 5, 15, 20, 7, 16};
        int n = cost.length;
        System.out.println();
        // min(0,cost,n-1,6);
        System.out.println(mincost(0, cost, n-1, 0));
    }

    static void min(int i, int[] arr, int target, int ic) {
        int cost;
        if (i == target) {
            System.out.println(ic);
            return;
        }
        if (i <= target - 2) {
            if (arr[i + 1] < arr[i + 2]) {
                ic = ic + arr[i + 1];
                min(i + 1, arr, target, ic);
            } else {
                ic = ic + arr[i + 2];
                min(i + 2, arr, target, ic);
            }
        }
        if (i == target - 1) {
            min(i + 1, arr, target, ic + arr[i + 1]);
        }
        // return ic;
    }
    static int mincost(int moves, int[] cost, int target, int ic) {
        int cost1=0;
        int cost2=0;
        int fcost=0;
        if(moves==target)
        {
            return 0;
        }
        if(moves<=target-2)
        {
            if(cost[moves+1]<cost[moves+2])
            {
                cost1=mincost(moves+1,cost,target,ic);
                return cost1+cost[moves+1];
            }
            else
            {
                cost2=mincost(moves+2,cost,target,ic);
                return cost2+cost[moves+2];
            }
        }

        if(moves==target-1)
        {
           fcost=  mincost(moves+1,cost,target,ic);
           return fcost+cost[moves+1];
        }
        return fcost+cost1+cost2;

    }

}