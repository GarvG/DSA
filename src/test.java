public class test {
    public static void main(String[] args) {
            String s="hello";
            char[] s2=s.toCharArray();
            int start=0;
            int end=s2.length-1;
        System.out.println(start+" "+end);
            while(start<end)
            {
                char ch1=s2[end];
                s2[end]=s2[start];
                s2[start]=ch1;
               start++;
               end--;

            }
    for(int i=0;i<s2.length;i++)
    {
        System.out.println(s2[i]);
    }
    }
}