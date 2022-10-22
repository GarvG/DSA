package Arrays;
import java.util.*;
public class XOR {
    public static void main(String[] args) {
        ArrayList <Integer> a1=new ArrayList<Integer>();
        ArrayList <Integer> a2=new ArrayList<Integer>();
        a1.add(27);
        //a1.add(5);
        //a1.add(22);
        a2.add(3);
//        a2.add(16);
//        a2.add(3);
        int N=a1.size();
        int ans=solve(N,a1,a2);
        System.out.println(ans);
    }
    public static int solve(int N,List<Integer>a1,List<Integer>a2)
    {
        int max=0;
     //   Collections.sort(a1);
        int i=0;
        int j=0;
        int finalans = 0;
        int temp=N;
        while(i<=N-1)
        {
            if(N==1)
            {
                return a1.get(i)^a2.get(j);
            }
            int ans=a1.get(i)^a2.get(j);
            int ans2=a1.get(i+1)^a2.get(j+1);
            finalans=(ans)&(ans2);
            i++;
            j++;
        }
        return finalans;

    }

}

