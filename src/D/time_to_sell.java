package D;

public class time_to_sell {
    public static void main(String[] args) {
        int []arr={7,2,5,4,1,6,9};
        int ans=time(arr);
        System.out.println(ans);
    }
    static int time(int [] arr)
    {
        int maxP=0;
        int minso=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            minso=Math.min(minso,arr[i]);
            int max=arr[i]-minso;
            maxP=Math.max(maxP,max);
        }

        return maxP;
    }
}
