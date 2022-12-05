package Recursion.Backtracking;

public class factorial {
    public static void main(String[] args) {
        //System.out.println(parameter(5,1));
    parameter(6,1);
        System.out.println(functional(5));
    }
    static void parameter(int number,int answer)
    {
        if(number<1)
        {
            System.out.println(answer);
            //return 1;
            return;
        }
        parameter(number-1,answer*number);

    }
    static int functional(int number)
    {
        if(number==1)
        {
            return 1;
        }
        int fact=functional(number-1);
        return number*fact;
       // return number*functional(number-1);
    }
}
