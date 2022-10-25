package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Pratice {
    public static void main(String[] args) {
        // put -> update IF ALREADY EXISTS OR CREATE A NEW
        // get -> returns value or null
        // contains key -> IF exists true or false
        // remove -> IF exists return value or else null
        // Keyset -> return all keys
        // size -> return all size;
        // Hashmap is an array of linked list
        // calling put map.put(UK,15); it works on when we give key to hashfunction then it return the bucket for where it is stored or the place where we need to add
        HashMap<String ,Integer> hm=new HashMap<>();
        hm.put("INDIA",125); // PUTTING  ADDING
        hm.put("CHINA",225);  // PUTTING  ADDING
        hm.put("US",12);   // PUTTING  ADDING
        hm.put("PAK",100); // PUTTING  ADDING
        System.out.println(hm);
        hm.put("NIG",10); // PUTTING  ADDING
        hm.put("US",25); // IF ALREADY EXISTS UPDATING
        System.out.println(hm);

        System.out.println(hm.get("INDIA"));  // GETTING THE VALUE IF EXISTS
        System.out.println(hm.get("UK"));  // GETTING NULL AS IT DO NOT EXISTS
        System.out.println(hm.containsKey("PAK")); // CHECKS IT IS PRESENT OR NOT

        Set<String> keys=hm.keySet();
        System.out.println(keys);
    }

}
