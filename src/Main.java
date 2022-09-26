public class Main {
    public static void main(String[] args) {

        int x=-123;
        int ans=Math.abs(x);
        System.out.println(ans);
        int p=0;
        int ans1=ans;
        int count=0;

        while(ans1>0)
        {
        count++;
        ans1=ans1/10;
        }
        System.out.println(count);
        count--;
        while(ans>0)

        {
            int n=ans%10;
             p=p*10+n;
             ans=ans/10;
        }
        System.out.println(p);

    }
}