package Recursion.Backtracking;

public class fib {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int num)
    {
        if(num==0||num==1)
        {
            return num;
        }
        int ans=fibo(num-1)+fibo(num-2);
        return ans;
    }
}
