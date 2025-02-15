package programs;

import java.util.*;

public class HashTable {
    static void HT() {
        Map<String, Integer> table = new Hashtable<>();
        table.put("Pen", 10);
        table.put("Book", 500);
        table.put("Clothes", 400);
        table.put("Mobile", 5000);
        table.put("Booklet", 2500);

        try {

            // add 100 in each value using forEach()
            table.forEach((k, v) -> {

                v = v + 100;
                table.put(k, v);
                System.out.println(k + " " + v);
            });
        } catch (Exception e) {

            System.out.println("Exception: " + e);
        }
    }
}