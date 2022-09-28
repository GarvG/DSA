package D;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class L_Happy_Number {
    public static void main(String[] args) {
int n=3;
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1)
        {
            int current=n;
            int sum=0;
            while(current!=0)
            {
                int rem=current%10;
                sum=sum+rem*rem;
                current=current/10;
            }
            if(seen.contains(sum))
            {
                System.out.println("not Happy");
                break;
            }
            seen.add(sum);
            n=sum;
        }
        System.out.println("Happy");





//        int num=19;
//        int temp=num;
//        int sum=0;
//        int count=0;
//        while(temp>0)
//        {
//            int rem=temp%10;
//            System.out.println("rem is "+rem);
//            sum=sum+rem*rem;
//            temp=temp/10;
//            System.out.println(sum+"sum is");
//            System.out.println(temp);
//            if(sum==1)
//            {
//                System.out.println("H_N");
//                break;
//            }
//            if(temp==0)
//            {
//             temp=sum;
//            }
//
//            int temp1=temp;
//                while(temp1>0)
//                {
//                    count++;
//                    temp1=temp1/10;
//                }
//
////            else
////            {
////
////                if(count==1)
////                {
////                    System.out.println("not happy");
////                    break;
////                }

            }
        }


