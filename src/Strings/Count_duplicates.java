package Strings;

import java.util.Arrays;

public class Count_duplicates {
    public static void main(String[] args) {
        String ans="test string";
        System.out.println(duplicates(ans));
    }
    static int duplicates (String S)
    {
        String ans="";
        int []count=new int[256];
        for(int i=0;i<S.length();i++)
        {
            int index=S.charAt(i);
            System.out.println(index);
            count[index]++;
        }
        System.out.println(Arrays.toString(count));

for(int i=0;i<count.length;i++)
{
    if(count[i]>1)
    {
     ans+=(char)(i);
    }
}
        System.out.println(ans);
            return -1;

    }

}
