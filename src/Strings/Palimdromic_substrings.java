package Strings;

public class Palimdromic_substrings {
    public static void main(String[] args) {
        String s="aba";
        palim(s);
    }
    static boolean isPalimdrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }return true;

    }
    static void palim(String s)
    {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String check=s.substring(i,j);
                if(isPalimdrome(check)==true)
                {
                    System.out.println(check);
                }

            }
        }
    }
}
