package HashMap;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        String s="leetcode";
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
        System.out.println(hm);
    }
}