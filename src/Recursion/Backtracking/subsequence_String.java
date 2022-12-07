package Recursion.Backtracking;

import java.util.ArrayList;

public class subsequence_String {
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
        sub(ans,"MADAM",0);
    }
    static void sub(ArrayList al,String ques,int idx)
    {
        if(idx==ques.length())
        {
            System.out.println(al);
            return;
        }
        al.add(ques.charAt(idx));
        sub(al,ques,idx+1);
        al.remove(al.size()-1);
        sub(al,ques,idx+1);
    }
}
