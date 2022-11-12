package Strings;

class Sorting_in_String {
    public String sortSentence(String s) {
         String[] ans=s.split(" ");
         String temp[]=new String[ans.length];
         StringBuilder sb=new StringBuilder();
       for(int i=0;i<ans.length;i++)
       {
         // sb=ans[i];
          char ch=ans[i].charAt(ans[i].length()-1);
          int index=ch-'0';
         // sb.delete(sb.length()-1,sb.length()-1);
          temp[index-1]=ans[i].substring(0,ans[i].length()-1);
       }
       for(int i=0;i<temp.length;i++)
       {
           sb=sb.append(temp[i]);
           sb=sb.append(" ");
       } 
       sb.delete(sb.length()-1,sb.length());
       return sb.toString();
    }
}
