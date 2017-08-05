package Collections;

import java.util.*;

/**
 * Created by sdodia on 5/26/17.
 */
public class TreeMapDemo {

    public static void main(String args[]){
        TreeMap tmap = new TreeMap();

        tmap.put("Zara", new Double(3434.34));
        tmap.put("Mahnaz", new Double(123.22));
        tmap.put("Ayan", new Double(1378.00));
        tmap.put("Daisy", new Double(99.22));
        tmap.put("Qadir", new Double(-19.08));

        Set set = tmap.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = ((Double)tmap.get("Zara")).doubleValue();
        tmap.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + tmap.get("Zara"));
    }
}
