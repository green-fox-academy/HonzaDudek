import java.util.HashMap;

public class hashMaps {
    public static void main(String[] args) {
        // Creating a hash map
        HashMap<String, String> hm = new HashMap<String, String>();

        // Put data to Hash map - HashMap is collection of key:value pairs
        hm.put("Katie", "Android, Wordpress");
        hm.put("Magda", "Facebook");
        hm.put("Vanessa", "Tools");
        hm.put("Ania", "Java");
        hm.put("Ania", "JEE"); // When inserting two values with same name, old value is overwritten

        // HashMap iteration
        for (String key: hm.keySet())
            System.out.println(key + ": " + hm.get(key));

        System.out.println();

        if (hm.containsKey("Katie")) {
            System.out.println("HashMap contains key 'Katie");
        }
    }
}
