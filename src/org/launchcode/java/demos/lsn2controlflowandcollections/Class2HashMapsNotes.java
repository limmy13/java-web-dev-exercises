package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;


//HashMap stores key/value pairs ---- this is not referred to as an "object",
// generally the term "object" is reserved for instances of classes

//Map Class allows you to loop over a hashmap by specifying the type of one key/value pair
// at a time out of the entire set of entries
public class Class2HashMapsNotes {

    public static void main(String[] arg) {

        // HashMap<String, Integer> scores = new HashMap<>();
        // HashMap TYPES            names  = call constructor


        // TODO: Declare an empty HashMap that can hold String keys and Integer values
        HashMap<String, Integer> itemsToPack = new HashMap<>();

        // Add 6 key/value pairs to represent items to pack
        itemsToPack.put("shoes", 2);
        itemsToPack.put("socks", 2);
        itemsToPack.put("shorts", 2);
        itemsToPack.put("pants", 2);
        itemsToPack.put("jackets", 2);
        itemsToPack.put("belts", 2);

        // print the map
        System.out.println(itemsToPack);

        // print entry set
        System.out.println(itemsToPack.entrySet());

        //print just the key set;
        System.out.println(itemsToPack.values());

        // CHECK IF IT CONTAINS A CERTAIN KEY and print result
        System.out.println(itemsToPack.containsKey("socks"));

        //check if it contains a certain value and print result
        System.out.println(itemsToPack.containsValue(6));

        //Print size
        System.out.println(itemsToPack.size());
    }
}
