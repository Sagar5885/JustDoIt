package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by sdodia on 5/26/17.
 */
public class HashMapDemo {

    public static void main(String args[]){
        HashMap hm = new HashMap();

        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

        Set set = hm.entrySet();

        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //Add 1000 in Zara's account
        hm.put("Zara", new Double(1000+((Double)hm.get("Zara")).doubleValue()));
        System.out.println("Zara's new balance: " + hm.get("Zara"));
    }
}
