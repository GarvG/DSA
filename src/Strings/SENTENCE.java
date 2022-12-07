package Strings;

import java.util.Arrays;

public class SENTENCE {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        int charar[]=new int[26];


        for(int i=0;i<sentence.length();i++)
        {
            int ch=sentence.charAt(i)-'a';
            System.out.println(ch);
            charar[ch]++;
        }
       for(int i=0;i< charar.length;i++)
       {
           if(charar[i]==0)
           {
               System.out.println("NO DOESNOT CONTAIN");
               //return false;
               return;
           }

       }
        System.out.println("YES CONTAINNNN");
    }
}
