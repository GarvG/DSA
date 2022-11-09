package D;

class Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        // CREATING A CHARACTHER ARRAY FOR STRING 1 AND STROING IT IN
      int []count1=new int[26];
      for(int i=0;i<s1.length();i++)
      {
          int index=s1.charAt(i)-'a';
          count1[index]++;
      }  
 // CREATING A CHARACTHER ARRAY FOR STRING 2 ALSO AND COMPARING TILL THE WINDOW SIZE MEANS THE LENGTH OF S1 
 // AND ADDING THE S2 IN THE CHARACTHER ARRAY OF IT  
        int []count2=new int[26];
        int i=0;
        int windowSize=s1.length();

        while(i< windowSize && i<s2.length())
        {
          int index=s2.charAt(i)-'a';
          count2[index]++;
         i++;  
        }  

// CHECKING THE BOTH THE ARRAYS ARE EQUAL OR NOT IF YES RETURN TRUE 

        if(check(count1,count2))
            return true;

// IF NO MEANS WE NEED TO MOVE OUR WINDOW AHEAD AND 


           while(i<s2.length())
            {
                char ch=s2.charAt(i);
                int index=ch-'a';
                count2[index]++;
                char oldchar=s2.charAt(i-windowSize);
                index=oldchar-'a';
                count2[index]--;
                i++;
                  if(check(count1,count2))
                    return true;
            }
        
return false;
    }
    boolean check(int []count1,int[]count2)
    {
        for(int i=0;i<26;i++)
        {
            if(count1[i]!=count2[i])
            {
                return false;
            }
            
        }
        return true;
    }
}
