package Recursion.Backtracking;

public class first {
    public static void main(String[] args) {
        first1(4,4);
       // print1toN(3,1)
    }
    static void first1(int start,int end)
    {
        if(start<1)
        {
            return;
        }
        first1(start-1,end);
        System.out.println(start);
    }
//    static void print1toN(int start , int end)
//    {
//
//    }

}
