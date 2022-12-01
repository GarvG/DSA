package Recursion;

import java.util.Scanner;

public class dice_with_target {
    public static void main(String[] args) {
        System.out.println(movesfortargetnumber(4,0));
    }
    static  int movesfortargetnumber(int number,int count)
    {
        int number1=0;
        int number2=0;
        int number3=0;
        int number4=0;
        int number5=0;
        int number6=0;
        if(number==0)
        {
            return count;
        }
        if(number>=1)
        {
           number1=movesfortargetnumber(number-1,count+1);
        }
        if(number>=2)
        {
            number2=movesfortargetnumber(number-2,count+1);
        }
        if(number>=3)
        {
            number3=movesfortargetnumber(number-3,count+1);
        }
        if(number>=4)
        {
            number4=movesfortargetnumber(number-4,count+1);
        }
        if(number>=5)
        {
            number5=movesfortargetnumber(number-5,count+1);
        }
        if(number>=6)
        {
            number6=movesfortargetnumber(number-6,count+1);
        }
        return number1+number2+number3+number4+number5+number6;
    }

}
