package Loops_conditionals;

import java.util.Scanner;

public class P1_String_Palimdrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
                System.out.println(start+" "+end);
                if(start==end)
                {
                    System.out.println("palim");
                    break;
                }
            }
           else{
                System.out.println("not plaim");
                break;
            }
            }





        }

    }


