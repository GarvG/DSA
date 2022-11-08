package Strings;

public class Ascii_difference {
    public static void main(String[] args) {
        String s="abdgca";
        Ascii_(s);
    }
    static void Ascii_(String s)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            int diff=s.charAt(i)-s.charAt(i-1);
            sb.append(diff);
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
