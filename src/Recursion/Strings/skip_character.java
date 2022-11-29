package Recursion.Strings;

public class skip_character {
    public static void main(String[] args) {
        String ans="baccad";
        //String a=Skip(ans,0,"");
        //System.out.print();
        Skip(ans,0,"",'a');
        System.out.println(Skip1(ans,0,'a'));
    }
    static void Skip(String ans, int start, String newf, char a)
    {
        if(start==ans.length())
        {

            System.out.println(newf);
            return;
        }
        char ch=ans.charAt(start);
        if(ch==a)
        {
          Skip(ans,start+1,newf,a);
        }
        else
        {
            Skip(ans,start+1,newf+ch,a);
        }
    } // by passing ans argument in the String

    static String Skip1(String ans,int start,char skip)
    {
        if(start==ans.length())
        {
            return "";
        }
        String myans="";
        char ch=ans.charAt(start);
        if(ch!=skip)
        {
            myans+=ch;

        }
        String temp=Skip1(ans,start+1,skip);
        return myans+temp;
    }
}

