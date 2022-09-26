package Loops_conditionals;

import java.util.Scanner;

public class Q3_Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int first = 0;
        int second = 1;
        int ans = 0;
        if(a==1){
            System.out.println(first);
        }
            else
            {
            for (int i = 2; i < a; i++) {
                int temp = second;
                second = second + first;
                first = temp;
            }
            System.out.println(second);
        }

    }
}
// FIBB
