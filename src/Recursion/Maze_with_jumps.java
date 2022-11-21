package Recursion;
import java.util.*;
public class Maze_with_jumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        ArrayList<String>ans=getMazePaths(1,1,dr,dc);
        System.out.println(ans);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sc==dc&&sr==dr)
        {
            ArrayList<String> temp=new ArrayList<>();
            temp.add("");
            return temp;
        }

        ArrayList<String> ans=new ArrayList<>();
        for(int mh=1;mh<=dc-sc;mh++)
        {
            ArrayList<String> mhans=getMazePaths(sr,sc+mh,dr,dc);
            for(String val:mhans)
            {
                ans.add("h"+mh+val);
            }

        }
        for(int vh=1;vh<=dr-sr;vh++)
        {
            ArrayList<String> vhans=getMazePaths(sr+vh,sc,dr,dc);
            for(String val:vhans)
            {
                ans.add("v"+vh+val);
            }

        }


        for(int dh=1;dh<=dr-sr&&dh<=dc-sc;dh++)
        {
            ArrayList<String> dhans=getMazePaths(sr+dh,sc+dh,dr,dc);
            for(String val:dhans)
            {
                ans.add("d"+dh+val);
            }

        }

        return ans;
    }
}
