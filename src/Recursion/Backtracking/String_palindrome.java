package Recursion.Backtracking;

public class String_palindrome {
    public static void main(String[] args) {
        System.out.println(functional("madama",0,5));
    }
    static Boolean functional(String ques,int start,int end)
    {
      //  Boolean ans=null;
        if(start>=end)
        {
            return true;
        }

//        if(ques.charAt(start)!=ques.charAt(end)){
//          return false;
//          }
//
//       Boolean ans=functional(ques,start+1,end-1);
//        return ans;

        return (ques.charAt(start)==ques.charAt(end) && functional(ques,start+1,end-1));
    }
}
