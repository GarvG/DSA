package Arrays.subarrays;

public class all_subarrays {
    public static void main(String[] args) {
        int []ans={1,23,3,2};
        all(ans);
    }
    static void all(int [] ans)
    {
        for(int i=0;i<ans.length;i++)
        {
            for(int j=i;j< ans.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(ans[k]+"\t");
                }
                System.out.println();
            }
        }
    }

}
