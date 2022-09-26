package Loops_conditionals;

public class P3_revrese_String_Word {
    public static void main(String[] args) {
        String s="lets Connect with you";
        String ans="";
        String word="";
        String space=" ";
        String notspace="";
        char[] notspac=notspace.toCharArray();
        char[] spac=space.toCharArray();
        char[] chars=s.toCharArray();
        for(int l=0;l<chars.length;l++)
        {
            if(chars[l]!=spac[0] && l!=chars.length)
            {
                word+=chars[l];

                System.out.println(l+" "+ chars.length);
                System.out.println(word);
            }


            else
            {
                System.out.println(word);

                int len=word.length()-1;
                while(len>=0)
                {
                    ans+=word.charAt(len);
                    len--;
                }
                word="";
                ans+=" ";
            }

        }
        if(word.length()!=0)
        {
            int len=word.length()-1;
            while(len>=0)
            {
                ans+=word.charAt(len);
                len--;
            }
            word="";
        }
    }
}
