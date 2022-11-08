package Strings;

public class String_compression {
    public static void main(String[] args) {
        String s="aaaabcccccddddeeezfffffaaa";
        String ans1=compression1(s);
        System.out.println(ans1);
        System.out.println(compression2(s));
    }
    static String compression1(String s)
    {
        String ans=""+s.charAt(0);
        int i=1;
        while(i<s.length())
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                ans+=s.charAt(i);

            }
            i++;
        }
        return ans;
    }

    static String compression2(String s)
    {
        int i=1;
        int count=1;
        String ans=""+s.charAt(0);
        while(i<s.length())
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    ans+=count;
                    count=1;
                }
                ans+=s.charAt(i);
            }
            i++;
        }
        if(count>1)
        {
            ans+=count;
        }
        return ans;
    }

}

