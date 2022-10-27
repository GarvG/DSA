package HashMap;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        /*
        String s="";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch, nf);
            } else {
                hm.put(ch, 1);
            }

        }
        System.out.println(hm.size());
        System.out.println(hm);


        */
        int arr[]={10,2,5,3};
        HashMap<Integer,Integer> hs =new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hs.put(2*(arr[i]),i);
        }
        System.out.println(hs);
        if(hs.containsKey(10))
        {
            System.out.println(hs.get(10));
        }

    }
}