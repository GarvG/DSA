package Recursion.Backtracking;

import java.util.ArrayList;

public class subsequence_String {
    public static void main(String[] args) {
      //  ArrayList<String> ans=new ArrayList<>();
       // Boolean find=false;
        //System.out.println(sub(ans,"MADAM",0,"A"));
 StringBuilder sb=new StringBuilder();
int ans=sub1(sb,"MADAM","A",0);
//ans>0?System.out.println("YES"):System.out.println("NO");
       // System.out.println(sub(ans,"MADAM",0));
    }
    static int sub1(StringBuilder sb,String q,String s,int idx)
    {
        if(idx==q.length())
        {
            if(sb.equals(q))
            {
                return 1;
            }
            return 0;
        }
        sb.append(s.charAt(idx));
        int ans1=sub1(sb,q,s,idx+1);
        sb.deleteCharAt(sb.length()-1);
        int ans2=sub1(sb,q,s,idx+1);
        return ans1+ans2;

    }



    static int sub(ArrayList al,String ques,int idx,String ch)
    {
        if(idx==ques.length())
        {
            String ans="";
            for(int i=0;i<al.size();i++)
            {
                ans+=al.get(i);
            }
            if(ch.equals(ans))
            {
                //find=true;
                System.out.println(ans);
                return 1;

            }
        return 0;
        }
        al.add(ques.charAt(idx));
        int ans1=sub(al,ques,idx+1,ch);
        al.remove(al.size()-1);
        int ans2= sub(al,ques,idx+1,ch);
      return ans1+ans2;
    }

//    static ArrayList sub(ArrayList al,String q,int idx)
//    {
//     if(idx==q.length())
//     {
//         ArrayList<String> ans=new ArrayList<>();
//         //ans.add(al.get(0))
//         for(String ch:al)
//         {
//             ans.add(ch);
//         }
//     }
//    }
}
