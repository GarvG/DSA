package Loops_conditionals;

import java.util.Scanner;

public class P2_String_Revers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String Rev="";
        int le=s.length();
        System.out.println(le);
        int en=le-1;
        while(en>=0)
        {
            Rev=Rev+s.charAt(en);
            en--;
        }
        System.out.println(Rev);
    }
}
