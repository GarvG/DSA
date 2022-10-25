package HashMap;

import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        String ques="abracadabra";
        HashMap<Character,Integer> hm =new HashMap<>();
        for(int i=0;i<ques.length();i++){
            if(hm.containsKey(ques.charAt(i)))
                {
                    int of=hm.get(ques.charAt(i));
                    int nf=of+1;
                    hm.put(ques.charAt(i),nf);
                }
            else
                {
                    hm.put(ques.charAt(i),1);
                }

        }
        System.out.println(hm);
        //int max=hm.get(ques.charAt(0));
        char maxfc=ques.charAt(0);
        for(Character key : hm.keySet())
        {
            if(hm.get(key)>hm.get(maxfc)){
            maxfc=key;
            }
        }
        System.out.println(maxfc);
    }
}
