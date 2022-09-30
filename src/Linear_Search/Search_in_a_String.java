package Linear_Search;

import java.util.Scanner;

public class Search_in_a_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String s= sc.next();
        System.out.println("ENTER THE CHAR TO FIND");
        char ch = sc.next().charAt(0);
        Boolean ans=find(s,ch);
        System.out.println(ans);
    }
    static boolean find(String s, char ch)
    {
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            if(ch==s.charAt(i))
                return true;
        }
        return false;
    }
}

/*
* Also we can do
* for(char c: str.tocharArray())
* {
* if(c==ch)
* {
* return true
* }
* }
* return false;
*
*
* */