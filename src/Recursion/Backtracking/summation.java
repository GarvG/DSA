package Recursion.Backtracking;

public class summation {
    public static void main(String[] args) {
        System.out.println(sum(3,0));
        System.out.println(function(3));
    }
    static int sum(int number,int sum)
    {
        if(number<1)
        {
            return sum;
        }
        int sum1=sum(number-1,sum+number);
        return sum1;
    }
    static int function(int num)
    {
        if(num==0)
        {
            return 0;
        }
        //int sum=function(num-1);
        return num+function(num-1);
    }


}
