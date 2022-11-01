package IMPORTANT;
import java.util.*;
public class PAINTERs {
    public static void main(String[] args) {
        ArrayList<Integer> boards= new  ArrayList<Integer>();
        int k=2;
        int ans=findLargestMinDistance(boards,k);
        System.out.println(ans);
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int sum=0;
        for(int val:boards)
        {
            sum+=val;
        }
        int low=0;
        int high=sum;
        int mid=low+(high-low)/2;
        int ans=0;
        while(low<=high)
        {
            if(isPossible(boards,mid,k))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            mid=low+(high-low)/2;
        }
        return ans;
    }
    static Boolean isPossible(ArrayList<Integer> boards,int load,int painters)
    {
        int painterC=1;
        int sum=0;
        for(int i=0;i<boards.size();i++)
        {
            if(sum+boards.get(i)<=load)
            {
                sum+=boards.get(i);
            }
            else
            {
                painterC++;
                if(painterC>painters||boards.get(i)>load)
                {
                    return false;
                }
                sum=boards.get(i);
            }
        }
        return true;
    }
}
