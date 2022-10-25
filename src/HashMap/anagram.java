package HashMap;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String s="aacc";
        String t="ccac";
        Boolean ans=ana(s,t);
        System.out.println(ans);
    }
    static boolean ana(String s,String t)
    {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
            {
                int of=hm.get(ch);
                int nf=of+1;
                hm.put(ch,nf);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        System.out.println(hm);

        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(!hm.containsKey(ch) || hm.get(ch)==0)
            {
                return false;
            }
            else
            {
                int f=hm.get(ch);
                hm.put(ch,f-1);
            }
        }

        return true;
    }

}
