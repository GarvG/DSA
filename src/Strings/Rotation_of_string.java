package Strings;

public class Rotation_of_string {
    public static void main(String[] args) {
        String s1="ABACD";
        String s2="CDABA";
       if(check(s1,s2)==true)
       {
           System.out.println("yes rotation");
       }
       else
       {
           System.out.println("NO rotation");
       }

    }
    static Boolean check(String s1,String s2)
    {
        String temp=s1+s1;
        if(s1.length()!=s2.length())
        {
            return false;
        }
        else
        {
            if(temp.indexOf(s2)!=-1)
            {
                return true;
            }
        }
        return false;
//        return (s1.length() == s2.length())
//                && ((s1 + s1).indexOf(s2) != -1);
    }
}
