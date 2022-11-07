package Strings;

class decrypt {
    public static void main(String[] args) {
     String s="10#11#12";
     String ans=freqAlphabets(s);
        System.out.println(ans);
    }
    public  static  String freqAlphabets(String s) {
     int i=0;
     int j=0;
     String Fans="";
     while(i<s.length())
     {
         if(s.charAt(i)!='#')
         {
             String temp="";

             if(i+2<s.length() && s.charAt(i+2)=='#' )
             {
                 temp+=s.charAt(i);
                 temp+=s.charAt(i+1);
                 i=i+3;
                 j=j+3;
                 int an=96+Integer.valueOf(temp);
                 Fans=Fans+(char)(an);
             }
             else
             { 
                 char ch=(char)((s.charAt(i))+(48));
                 Fans=Fans+ch;
                i++;
                j++;
             }
         }
    
     }
     return Fans;   
    }
}