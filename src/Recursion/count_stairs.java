package Recursion;

public class count_stairs {
    public static void main(String[] args) {
        System.out.println(count(0,4));
    }
    static int count(int curr,int target)
    {
        int x = 0,y=0;
        if(curr==target)
        {
            return 1;
        }
        if(curr<target)
        {
            x=count(curr+1,target);
        }
       if(curr<target-1)
       {
           y=count(curr+2,target);
       }

        return x+y;
    }
//    static int count(int moves,int target)
//    {
//        if(moves==target)
//        {
//            return 1;
//        }
//
//    }

}
