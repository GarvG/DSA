package CODING_ROUND;


import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        String a="BOOK ON THE TABLE";
        String targert="BLOOB";
        Substring(a,targert);


    }
    static void Substring(String a,String target)
    {
        HashMap<String,Integer>hm=new HashMap<>();
        String ans="";
        for(int i=0;i<a.length();i++)
        {

            if(a.charAt(i)!=' ')
            {
                ans+=a.charAt(i);
            }
            else {
                hm.put(ans,1);
                ans="";
            }
        }
        if(ans.length()!=0)
        {
            hm.put(ans,1);
        }
    int count=0;
        System.out.println(hm);
        for(String ans1:hm.keySet())
        {
            if(hm.containsKey(target))
            {
                count++;
                System.out.println("YES");
                break;
            }
        }
        if(count==0)
        {
            System.out.println("NO");
        }




//        String[] ans=a.split(" ");
//        int count=-1;
//        for(int i=0;i<ans.length;i++)
//        {
//            if(ans[i].equals(target))
//            {
//                count=0;
//                System.out.println("YES");
//                break;
//            }
//        }
//        if(count==-1)
//        {
//            System.out.println("NO");
//        }




//        String ans="";
//        int count=-1;
//        for(int i=0;i<a.length();i++)
//        {
//            char ch=a.charAt(i);
//            ans+=ch;
//            if(ans==target)
//            {
//                System.out.println("YES Exists");
//                count++;
//                break;
//
//            }
//
//        }
//        if(count==-1)
//        {
//            System.out.println("Doesnot Exists");
//        }

    }
}
