package Recursion;
import java.util.*;
public class getKpc {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String ans=sc.next();
        printKPC(ans,"");
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        char ch=str.charAt(0);
        String roq=str.substring(1);
        int val=(int)(ch-'0');
        String s=codes[val];
        for(int i=0;i<s.length();i++)
        {
            printKPC(roq,asf+s.charAt(i));
        }
    }
}
