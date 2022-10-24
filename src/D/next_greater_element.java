package D;

import java.util.Arrays;

public class next_greater_element {
    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        int []ans=nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ans=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=nums1[i];
        }
        int ince=nums1.length;
        for(int i=0;i<nums2.length;i++)
        {
            ans[ince]=nums2[i];
            ince++;
        }
       // System.out.println(Arrays.toString(ans));
        int i=0;
        int j=ans.length-1;
        while(i<nums1.length)
        {
            int val=ans[i];
            if(val==ans[j])
            {
                if(j==ans.length-1)
                {
                    nums1[i]=-1;
                }
                else
                {
                    if(ans[j+1]>nums1[i])
                    {
                        nums1[i]=ans[j+1];
                    }
                    else
                    {
                        nums1[i]=-1;
                    }
                }


                i++;
                j=ans.length-1;
            }
            else{
                j--;
            }

        }
        return nums1;
    }
}
