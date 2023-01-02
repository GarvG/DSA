package Recursion.Strings;

public class palim {
    public static void main(String[] args) {
        System.out.println(check("OPPO",0,3));
    }
    static Boolean check(String str,int start,int end)
    {
        Boolean ans=null;
        if(start>end)
        {
            return true;
        }
        if(str.charAt(start)==str.charAt(end))
        {
            ans=check(str,start+1,end-1);
        }
        else
        {
            return false;
        }
        return ans;
    }

}
