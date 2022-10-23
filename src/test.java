import java.util.*;
public class test {
    public static void main(String[] args) {
        int []nums={1,2,4,5,2};
        ArrayList<Integer> hs=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
//            System.out.print("before"+hs);
            if(hs.contains(nums[i]))
            {
                hs.remove(Integer.valueOf(nums[i]));
            }
            else{
                hs.add(nums[i]);
            }



        }
        System.out.print(hs);
    }
}