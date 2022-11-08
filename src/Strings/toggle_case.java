package Strings;

public class toggle_case {
    public static void main(String[] args) {
        String s="pepCoDINg";
        toggle(s);
    }
    static void toggle(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
              ans+=(char)(s.charAt(i)-32);
            }
            else
            {
                ans+=(char)(s.charAt(i)+32);
            }
        }
        System.out.println(ans);
    }
}
