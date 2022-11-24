import java.util.*;
public class test {
    private int i=1;
    public  class  A{
        static {
            System.out.println("static");
        }
        {
            System.out.println("block");
        }

    }
//    public A()
//    {
//        System.out.println("A");
//    }
long var;
    public void test(long param){
        var=param;
    }



    public static void main(String[] args) {
//        int []nums={1,2,4,5,2};
//        ArrayList<Integer> hs=new ArrayList<Integer>();
//        for(int i=0;i<nums.length;i++)
//        {
////            System.out.print("before"+hs);
//            if(hs.contains(nums[i]))
//            {
//                hs.remove(Integer.valueOf(nums[i]));
//            }
//            else{
//                hs.add(nums[i]);
//            }
//        }
     //   A a=new A();
        //System.out.print(hs);
//        int number=11;
//        int NUMBER=22;
//        int Number=33;
//        System.out.print(number + " ");
//        System.out.print(NUMBER + " ");
//        System.out.println(Number+" ");
    test a,b;
    a=new test();
   // b=new test(5);


    }
}