package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Pratice {
    public static void main(String[] args) {
        // put -> update IF ALREADY EXISTS OR CREATE A NEW
        // get -> returns value or null of the frequency
        // contains key -> IF exists true or false
        // remove -> IF exists return value or else null
        // Keyset -> return all keys
        // size -> return all size;
        // Hashmap is an array of linked list
        // calling put map.put(UK,15); it works on when we give key to hashfunction then it return the bucket for where it is stored or the place where we need to add
//        HashMap<String ,Integer> hm=new HashMap<>();
//        hm.put("INDIA",125); // PUTTING  ADDING
//        hm.put("CHINA",225);  // PUTTING  ADDING
//        hm.put("US",12);   // PUTTING  ADDING
//        hm.put("PAK",100); // PUTTING  ADDING
//        System.out.println(hm);
//        hm.put("NIG",10); // PUTTING  ADDING
//        hm.put("US",25); // IF ALREADY EXISTS UPDATING
//        System.out.println(hm);
//
//        System.out.println(hm.get("INDIA"));  // GETTING THE VALUE IF EXISTS
//        System.out.println(hm.get("UK"));  // GETTING NULL AS IT DO NOT EXISTS
//        System.out.println(!hm.containsKey("US1")); // CHECKS IT IS PRESENT OR NOT
//
//        Set<String> keys=hm.keySet();
//        System.out.println(keys);
//        System.out.println(hm.size());

        int arr[]={1,2,2,1,1,3};
        HashMap<Integer,Integer>hm =new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int of=hm.get(arr[i]);
                int nf=of+1;
                hm.put(arr[i],nf);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
      // System.out.println(hm);
//        int count=hm.get(0);
//        for(Integer val:hm.keySet())
//        {
//           if(count==hm.get(val))
//           {
//               System.out.println("repeat");
//           }
//           else
//           {
//               count=hm.get(val);
//           }
//        }

//        int count=hm.get(3);
//        System.out.println(count);
//        for(int i=0;i<arr.length;i++) {
//            //int val=arr[i];
//            int val = hm.get(arr[i]);
//            System.out.println(val);
//        }

//            if(count==val)
//            {
//                System.out.println("repeat");
//                break;
//            }
//            else
//            {
//                count=arr[i];
//            }

        int count=hm.get(arr[0]);
        for(int i=1;i<hm.size();i++)
        {
            if(count==hm.get(arr[i]))
            {
                System.out.println("REPEAT");
                break;
            }
            else
        {
        count=hm.get(arr[i]);
        }
        }

    }

}
