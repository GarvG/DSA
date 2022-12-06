package Recursion.Backtracking;

import java.util.ArrayList;

public class subsequences {
    public static void main(String[] args) {
        int []arr={1,2,3};
      //  System.out.println(Sub(arr,0));
        ArrayList<Integer> al=new ArrayList<>();
        sub(arr,al,0);
    }
    static ArrayList Sub(int []arr, int idx)
    {
        if(idx==arr.length)
        {
            ArrayList<String>temp=new ArrayList<>();
           temp.add("");
           return temp;
        }
        ArrayList<String>tempres=Sub(arr,idx+1);
        int first=arr[idx];
        ArrayList<String>Myres=new ArrayList<>();
        for(String ch:tempres)
        {
            Myres.add(ch+"");
        }
        for(String ch:tempres)
        {
            Myres.add(first+ch);
        }
        return Myres;
    }
    static void sub(int []arr,ArrayList al,int idx)
    {
        if(idx==arr.length)
        {
            System.out.println(al);
            return;
        }
        al.add(arr[idx]);
        sub(arr,al,idx+1);
        al.remove(al.size()-1);
        sub(arr,al,idx+1);
    }
}
