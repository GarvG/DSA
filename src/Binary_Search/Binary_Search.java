package Binary_Search;

public class Binary_Search {
    public static void main(String[] args) {

        int []arr=new int[]{1,2,4,6,10,12,35,49};
        int target=121;
        int ans=Search(arr,target);
        System.out.println(ans);
    }
    static int Search(int [] arr,int target)
    {
        int len=arr.length;
        int start=0;
        int end=len-1;
        while(start<=end)
        {
          //  int middle=(start+end)/2;
            int middle=start+(end-start)/2;
            if(arr[middle]==target)
            {
                return middle;
            }
            if(target>arr[middle])
            {
                start=middle+1;
            }
            else{
                end=middle-1;
            }

        }
return -1;
    }
}
